/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.antgroup.zmxy.openplatform.api.internal.util;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;

import javax.crypto.Cipher;

import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.internal.util.json.ExceptionErrorListener;
import com.antgroup.zmxy.openplatform.api.internal.util.json.JSONValidatingReader;

/**
 * 加解密工具类.
 * @author xiaoqing.zhouxq
 * @version $Id: RSACoderUtil.java, v 0.1 2015年8月31日 下午3:16:16 xiaoqing.zhouxq Exp $
 */
public class RSACoderUtil extends CoderUtil {

    /**
     * 加密算法
     */
    public static final String KEY_ALGORTHM           = "RSA";

    /**具体加密算法，包括padding的方式*/
    public static final String SPECIFIC_KEY_ALGORITHM = "RSA/ECB/PKCS1Padding";

    /**
     * 加签算法
     */
    public static final String SIGNATURE_ALGORITHM    = "SHA1WithRSA";

    /**
     * 用RSA算法进行加密
     * 
     * @param paramsString 要加密的字符串
     * @param charset 字符集
     * @param publicKey 加密使用的公钥
     * @return  加密结果
     * @throws Exception 异常
     */
    public static String encrypt(String paramsString, String charset, String publicKey)
                                                                                       throws Exception {
        byte[] encryptedResult = RSACoderUtil.encryptByPublicKey(paramsString.getBytes(charset),
            publicKey, null);

        return Base64Util.byteArrayToBase64(encryptedResult);
    }

    /**
     * 用RSA算法进行加密
     * 
     * @param paramsString 要加密的字符串
     * @param charset 字符集
     * @param publicKey 加密使用的公钥
     * @param encryptionType 加密算法类型
     * @return  加密结果
     * @throws Exception 异常
     */
    public static String encrypt(String paramsString, String charset, String publicKey,
                                 EncryptionModeEnum encryptionType) throws Exception {
        byte[] encryptedResult = RSACoderUtil.encryptByPublicKey(paramsString.getBytes(charset),
            publicKey, encryptionType);

        return Base64Util.byteArrayToBase64(encryptedResult);
    }

    /**
     * 把参数通过私钥进行加签.
     * 
     * @param data 要加密的字符串
     * @param charset 字符串的编码
     * @param privateKey 商户的私钥
     * @return 加签后的数据
     * @throws Exception 异常
     */
    public static String sign(String data, String charset, String privateKey) throws Exception {
        byte[] dataInBytes = data.getBytes(charset);
        String signParams = RSACoderUtil.sign(dataInBytes, privateKey);//用应用的私钥加签.
        return signParams;
    }

    /**
     * 把参数通过私钥进行加签.
     * 
     * @param signType 签名类型
     * @param data 要加密的字符串
     * @param charset 字符串的编码
     * @param privateKey 商户的私钥
     * @return 加签后的数据
     * @throws Exception 异常
     */
    public static String sign(SignTypeEnum signType, String data, String charset, String privateKey)
                                                                                                    throws Exception {
        byte[] dataInBytes = data.getBytes(charset);
        String signParams = RSACoderUtil.sign(signType, dataInBytes, privateKey);//用应用的私钥加签.
        return signParams;
    }

    /**
     * 解密数据
     * 
     * @param data base64格式的加密数据
     * @param key 私钥
     * @param charset 字符集
     * @return 解密后的明文
     * @throws Exception 异常
     */
    public static String decrypt(String data, String key, String charset) throws Exception {
        byte[] byte64 = Base64Util.base64ToByteArray(data);
        byte[] encryptedBytes = decryptByPrivateKey(byte64, key, null);
        return new String(encryptedBytes, charset);
    }

    /**
     * 解密数据
     * 
     * @param data base64格式的加密数据
     * @param key 私钥
     * @param charset 字符集
     * @param encryptionType 加密类型
     * @return 解密后的明文
     * @throws Exception 异常
     */
    public static String decrypt(String data, String key, String charset,
                                 EncryptionModeEnum encryptionType) throws Exception {
        byte[] byte64 = Base64Util.base64ToByteArray(data);
        byte[] encryptedBytes = decryptByPrivateKey(byte64, key, encryptionType);
        return new String(encryptedBytes, charset);
    }

    /**
     * 用私钥解密 
     * @param data   加密数据
     * @param key    密钥
     * @param encryptionType 加密类型
     * @return 解密后的byte数组
     * @throws Exception 异常
     */
    public static byte[] decryptByPrivateKey(byte[] data, String key,
                                             EncryptionModeEnum encryptionType) throws Exception {
        byte[] decryptedData = null;

        //对私钥解密
        byte[] keyBytes = decryptBASE64(key);

        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
        Key privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        //对数据解密
        Cipher cipher = Cipher.getInstance(SPECIFIC_KEY_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        // 解密时超过maxDecryptBlockSize字节就报错。为此采用分段解密的办法来解密
        int maxDecryptBlockSize;
        if (encryptionType != null) {
            maxDecryptBlockSize = getMaxDecryptBlockSizeByEncryptionType(encryptionType);
        } else {
            maxDecryptBlockSize = getMaxDecryptBlockSize(keyFactory, privateKey);
        }

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            int dataLength = data.length;
            for (int i = 0; i < dataLength; i += maxDecryptBlockSize) {
                int decryptLength = dataLength - i < maxDecryptBlockSize ? dataLength - i
                    : maxDecryptBlockSize;
                byte[] doFinal = cipher.doFinal(data, i, decryptLength);
                bout.write(doFinal);
            }
            decryptedData = bout.toByteArray();
        } finally {
            if (bout != null) {
                bout.close();
            }
        }

        return decryptedData;
    }

    /**
     * 用公钥加密
     * @param data   加密数据
     * @param key    公钥
     * @param encryptionType 加密类型
     * @return 加密后的字节数组
     * @throws Exception 异常
     */
    public static byte[] encryptByPublicKey(byte[] data, String key,
                                            EncryptionModeEnum encryptionType) throws Exception {
        byte[] encryptedData = null;

        //对公钥解密
        byte[] keyBytes = decryptBASE64(key);
        //取公钥
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
        Key publicKey = keyFactory.generatePublic(x509EncodedKeySpec);

        //对数据解密
        Cipher cipher = Cipher.getInstance(SPECIFIC_KEY_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        // 加密时超过maxEncryptBlockSize字节就报错。为此采用分段加密的办法来加密
        int maxEncryptBlockSize;
        if (encryptionType != null) {
            maxEncryptBlockSize = getMaxEncryptBlockSizeByEncryptionType(encryptionType);
        } else {
            maxEncryptBlockSize = getMaxEncryptBlockSize(keyFactory, publicKey);
        }

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            int dataLength = data.length;
            for (int i = 0; i < data.length; i += maxEncryptBlockSize) {
                int encryptLength = dataLength - i < maxEncryptBlockSize ? dataLength - i
                    : maxEncryptBlockSize;
                byte[] doFinal = cipher.doFinal(data, i, encryptLength);
                bout.write(doFinal);
            }
            encryptedData = bout.toByteArray();
        } finally {
            if (bout != null) {
                bout.close();
            }
        }
        return encryptedData;
    }

    /** 用私钥对信息生成数字签名
     * @param data   加密数据
     * @param privateKey 私钥
     * @return 签名后的base64值
     * @throws Exception 异常
     */
    public static String sign(byte[] data, String privateKey) throws Exception {
        //解密私钥
        return sign(SignTypeEnum.SHA1WITHRSA, data, privateKey);
    }

    /** 用私钥对信息生成数字签名
     * @param signType 签名类型
     * @param data   加密数据
     * @param privateKey 私钥
     * @return 签名后的base64值
     * @throws Exception 异常
     */
    public static String sign(SignTypeEnum signType, byte[] data, String privateKey)
                                                                                    throws Exception {
        //解密私钥
        byte[] keyBytes = decryptBASE64(privateKey);
        //构造PKCS8EncodedKeySpec对象
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
        //指定加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
        //取私钥匙对象
        PrivateKey privateKey2 = keyFactory.generatePrivate(pkcs8EncodedKeySpec);

        //用私钥对信息生成数字签名
        Signature signature = Signature.getInstance(signType.getDesc());
        signature.initSign(privateKey2);
        signature.update(data);

        return encryptBASE64(signature.sign());
    }

    /**
     * 校验数字签名
     * @param data   加密数据
     * @param publicKey  公钥
     * @param sign   数字签名
     * @return 验签结果
     * @throws Exception 异常
     */
    public static boolean verify(byte[] data, String publicKey, String sign) throws Exception {
        return verify(SignTypeEnum.SHA1WITHRSA, data, publicKey, sign);
    }

    /**
     * 校验数字签名
     * @param signType 签名类型
     * @param data   加密数据
     * @param publicKey  公钥
     * @param sign   数字签名
     * @return 验签结果
     * @throws Exception 异常
     */
    public static boolean verify(SignTypeEnum signType, byte[] data, String publicKey, String sign)
                                                                                                   throws Exception {
        //解密公钥
        byte[] keyBytes = decryptBASE64(publicKey);
        //构造X509EncodedKeySpec对象
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
        //指定加密算法
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
        //取公钥匙对象
        PublicKey publicKey2 = keyFactory.generatePublic(x509EncodedKeySpec);

        Signature signature = Signature.getInstance(signType.getDesc());
        signature.initVerify(publicKey2);
        signature.update(data);
        //验证签名是否正常
        return signature.verify(decryptBASE64(sign));
    }

    /**
     * 从开放平台的response里面解析出业务的返回值并解密（如果加密的话，根据encrypted属性判断是否加密）
     * 返回结果的格式如下:
     * * 在执行结果失败时，encrypted=false,所有的返回结果就不加密加签了,格式如下:
     *  {
     *   "encrypted":false,
     *   "biz_response":"{"success":false,"error_code":"ZMOP.unknow_error","error_message":"未知错误"}"
     *   }
     *   
     *  在执行成功时，encrypted=true，所有的返回结果进行加密,格式如下:
     *  {
     *   "encrypted":true,
     *   "biz_response_sign":"业务明文数据签名",
     *   "biz_response":"业务密文数据"
     *  }
     * 
     * @param fullResponse 开放平台的返回结果
     * @param privateKey 商户私钥
     * @param charset 编码
     * @param encryptionType 加密算法类型
     * @return 解密后的结果，比如上面第二个例子中，返回"not encrypted data"
     */
    public static String decryptResponse(String fullResponse, String privateKey, String charset,
                                         EncryptionModeEnum encryptionType) throws Exception {
        String decryptedRsp = null;
        Map rootJson = parseResponseMap(fullResponse);
        for (Iterator it = rootJson.keySet().iterator(); it.hasNext();) {
            String key = (String) it.next();
            if (key.endsWith("_response")) {
                String value = (String) rootJson.get(key);
                decryptedRsp = value;
            }
        }

        if (((Boolean) rootJson.get("encrypted")).booleanValue()) {
            decryptedRsp = RSACoderUtil.decrypt(decryptedRsp, privateKey, charset, encryptionType);
        }
        return decryptedRsp;
    }

    /**
     * 对返回结果进行验签
     * 返回结果的格式如下:
     * * 在执行结果失败时，encrypted=false,所有的返回结果就不加密加签了,格式如下:
     *  {
     *   "encrypted":false,
     *   "biz_response":"{"success":false,"error_code":"ZMOP.unknow_error","error_message":"未知错误"}"
     *   }
     *   
     *  在执行成功时，encrypted=true，所有的返回结果进行加密,格式如下:
     *  {
     *   "encrypted":true,
     *   "biz_response_sign":"业务明文数据签名",
     *   "biz_response":"业务密文数据"
     *  }
     * @param fullResponse 开放平台返回值
     * @param decryptedBizResponse 解密后的业务数据
     * @param publicKey 芝麻公钥
     * @param charset 字符集
     * @throws Exception 验签异常
     */
    public static void verifySign(String fullResponse, String decryptedBizResponse,
                                  String publicKey, String charset) throws Exception {
        verifySign(SignTypeEnum.SHA1WITHRSA, fullResponse, decryptedBizResponse, publicKey, charset);
    }

    /**
     * 对返回结果进行验签
     * 返回结果的格式如下:
     * * 在执行结果失败时，encrypted=false,所有的返回结果就不加密加签了,格式如下:
     *  {
     *   "encrypted":false,
     *   "biz_response":"{"success":false,"error_code":"ZMOP.unknow_error","error_message":"未知错误"}"
     *   }
     *   
     *  在执行成功时，encrypted=true，所有的返回结果进行加密,格式如下:
     *  {
     *   "encrypted":true,
     *   "biz_response_sign":"业务明文数据签名",
     *   "biz_response":"业务密文数据"
     *  }
     * @param signType 签名类型
     * @param fullResponse 开放平台返回值
     * @param decryptedBizResponse 解密后的业务数据
     * @param publicKey 芝麻公钥
     * @param charset 字符集
     * @throws Exception 验签异常
     */
    public static void verifySign(SignTypeEnum signType, String fullResponse,
                                  String decryptedBizResponse, String publicKey, String charset)
                                                                                                throws Exception {
        Map rootJson = parseResponseMap(fullResponse);
        String sign = (String) rootJson.get("biz_response_sign");

        if (sign != null && sign.length() > 0) {//在sign对象不为空的情况下才进行验签
            boolean success = verify(signType, decryptedBizResponse.getBytes(charset), publicKey,
                sign);
            if (success == false) {
                throw new ZhimaApiException("验签失败: " + sign.toString());
            }
        }
    }

    /**
     * 把返回结果解析成map对象
     * 
     * @param fullResponse 开放平台返回结果
     * @return map对象
     */
    public static Map parseResponseMap(String fullResponse) throws ZhimaApiException {
        JSONValidatingReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(fullResponse);
        if (rootObj instanceof Map) {
            Map rootJson = (Map) rootObj;
            return rootJson;
        }

        throw new ZhimaApiException("返回结果格式有误:" + fullResponse);
    }

    /**
     * 获取每次加密的最大长度
     * 
     * @param keyFactory KeyFactory
     * @param key 公钥
     * @return 单词加密最大长度
     * @throws Exception 异常
     */
    private static int getMaxEncryptBlockSize(KeyFactory keyFactory, Key key) throws Exception {
        //默认先设置成RSA1024的最大加密长度
        int maxLength = 117;
        try {
            RSAPublicKeySpec publicKeySpec = keyFactory.getKeySpec(key, RSAPublicKeySpec.class);
            int keyLength = publicKeySpec.getModulus().bitLength();
            maxLength = keyLength / 8 - 11;
        } catch (Exception e) {

        }
        return maxLength;
    }

    /**
     * 根据加密算法类型获取单次最大加密长度
     * 
     * @param encryptionType
     * @return
     */
    private static int getMaxEncryptBlockSizeByEncryptionType(EncryptionModeEnum encryptionType) {
        if (encryptionType == EncryptionModeEnum.RSA1024) {
            return 1024 / 8 - 11;
        } else if (encryptionType == EncryptionModeEnum.RSA2048) {
            return 2048 / 8 - 11;
        }

        return 1024 / 8 - 11;
    }

    /***
     * 获取每次解密最大长度
     * 
     * @param keyFactory KeyFactory
     * @param key 私钥
     * @return 单次解密最大长度
     * @throws Exception 异常
     */
    private static int getMaxDecryptBlockSize(KeyFactory keyFactory, Key key) throws Exception {
        //默认先设置成RSA1024的最大解密长度
        int maxLength = 128;
        try {
            RSAPrivateKeySpec publicKeySpec = keyFactory.getKeySpec(key, RSAPrivateKeySpec.class);
            int keyLength = publicKeySpec.getModulus().bitLength();
            maxLength = keyLength / 8;
        } catch (Exception e) {

        }
        return maxLength;
    }

    /**
     * 
     * 
     * @param encryptionType
     * @return
     */
    private static int getMaxDecryptBlockSizeByEncryptionType(EncryptionModeEnum encryptionType) {
        if (encryptionType == EncryptionModeEnum.RSA1024) {
            return 1024 / 8;
        } else if (encryptionType == EncryptionModeEnum.RSA2048) {
            return 2048 / 8;
        }

        return 1024 / 8;
    }
}
