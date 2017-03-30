package com.antgroup.zmxy.openplatform.api.internal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.internal.util.json.ExceptionErrorListener;
import com.antgroup.zmxy.openplatform.api.internal.util.json.JSONValidatingReader;

/**
 * AES加解密工具类
 * 
 * @author dengpeng.zdp
 * @version $Id: AESUtil.java, v 0.1 2015-11-25 上午10:25:05 dengpeng.zdp Exp $
 */
public class AESUtil {

    /**AES算法*/
    private static final String AES_ALGORITHM         = "AES";

    /**AES算法以及所采用的Mode和padding方式*/
    private static final String AES_ALGORITHM_PADDING = "AES/ECB/PKCS5Padding";

    /**
     * 利用AES算法对数据进行加密
     * 
     * @param data 要加密的数据
     * @param aesBase64Key base64编码的AES Key
     * @param charset 字符集
     * @return 加密后的数据(Base64编码)
     */
    public static String encrypt(String data, String aesBase64Key, String charset) throws Exception {
        // AES加密  
        Cipher cipher = initCipher(aesBase64Key, Cipher.ENCRYPT_MODE);

        byte[] bytOut = cipher.doFinal(data.getBytes(charset));
        return Base64Util.byteArrayToBase64(bytOut);
    }

    /**
     * 加密文件，从sourceFile读取文件内容，将加密结果放入targetFile
     * 
     * @param sourceFile 待加密的文件
     * @param targetFile 加密后存储的文件
     * @param aesBase64Key aes秘钥
     * @param charset 编码格式
     */
    public static void encryptFile(File sourceFile, File targetFile, String aesBase64Key,
                                   String charset) throws Exception {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);
            Cipher cipher = initCipher(aesBase64Key, Cipher.ENCRYPT_MODE);
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = cipherInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
                outputStream.flush();
            }
            cipherInputStream.close();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    /**
     * 利用AES算法对数据进行解密
     * 
     * @param encryptedData AES加密的数据
     * @param aesBase64Key  base64编码的AES Key
     * @param charset 字符集
     * @return 解密后的数据
     * @throws Exception 解密异常
     */
    public static String decrypt(String encryptedData, String aesBase64Key, String charset)
                                                                                           throws Exception {
        // AES加密  
        Cipher cipher = initCipher(aesBase64Key, Cipher.DECRYPT_MODE);

        byte[] bytOut = cipher.doFinal(Base64Util.base64ToByteArray(encryptedData));
        String result = new String(bytOut, charset);

        //ios加密的数据解密后会吗会出现ascii码等于0的填充值,需要去掉
        int indexOfNil = result.indexOf('\u0000');
        if (indexOfNil >= 0) {
            result = result.substring(0, indexOfNil);
        }
        return result;
    }

    /**
     * 
     * 
     * @param fullResponse
     * @param aesKey
     * @param charset
     * @return
     */
    public static String decryptResponse(String fullResponse, String aesKey, String charset)
                                                                                            throws Exception {
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
            decryptedRsp = decrypt(decryptedRsp, aesKey, charset);
        }
        return decryptedRsp;
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
     * 将加密后的内容解密后存入文件中
     * 
     * @param file 要保存解密后的内容的文件
     * @param encryptedData 加密后的内容（没有base64编码）
     * @param aesBase64Key aes key
     * @throws Exception 解密异常
     */
    public static void decryptToFile(File file, InputStream encryptedData, String aesBase64Key)
                                                                                               throws Exception {
        CipherOutputStream cipherOutputStream = null;
        try {
            OutputStream os = new FileOutputStream(file);
            Cipher cipher = initCipher(aesBase64Key, Cipher.DECRYPT_MODE);
            cipherOutputStream = new CipherOutputStream(os, cipher);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = encryptedData.read(buffer)) >= 0) {
                cipherOutputStream.write(buffer, 0, length);
            }
        } finally {

            if (cipherOutputStream != null) {
                cipherOutputStream.close();
            }

            if (encryptedData != null) {
                encryptedData.close();
            }
        }

    }

    /**
     * 
     * 
     * @param aesBase64Key
     * @param mode 指定是加密还是解密模式
     * @return
     * @throws Exception
     */
    public static Cipher initCipher(String aesBase64Key, int mode) throws Exception {
        SecretKeySpec skeySpec = getSecretKeySpec(aesBase64Key);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM_PADDING);
        cipher.init(mode, skeySpec);
        return cipher;
    }

    /**
     * 根据base64编码的key获取SecretKeySpec对象
     * 
     * @param aesBase64Key base64编码的key
     * @return SecretKeySpec对象
     * @throws Exception 获取SecretKeySpec对象异常
     */
    public static SecretKeySpec getSecretKeySpec(String aesBase64Key) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(Base64Util.base64ToByteArray(aesBase64Key),
            AES_ALGORITHM);
        return skeySpec;
    }

    /**
     * 初始化AES Key
     * 
     * @return base64编码的AES Key
     * @throws Exception 异常
     */
    public static String initKey() throws Exception {
        //实例化  
        KeyGenerator kgen = KeyGenerator.getInstance(AES_ALGORITHM);
        //设置密钥长度  
        SecureRandom random = new SecureRandom();
        kgen.init(128, random);
        //kgen.init(128);
        //生成密钥
        SecretKey skey = kgen.generateKey();

        //返回密钥的二进制编码  
        return Base64Util.byteArrayToBase64(skey.getEncoded());
    }
}
