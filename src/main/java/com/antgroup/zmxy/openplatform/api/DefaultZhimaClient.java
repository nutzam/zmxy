/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.antgroup.zmxy.openplatform.api;

import java.io.File;
import java.net.URLEncoder;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import com.antgroup.zmxy.openplatform.api.internal.parser.json.ObjectJsonParser;
import com.antgroup.zmxy.openplatform.api.internal.util.AESUtil;
import com.antgroup.zmxy.openplatform.api.internal.util.EncryptionModeEnum;
import com.antgroup.zmxy.openplatform.api.internal.util.RSACoderUtil;
import com.antgroup.zmxy.openplatform.api.internal.util.SignTypeEnum;
import com.antgroup.zmxy.openplatform.api.internal.util.StringUtils;
import com.antgroup.zmxy.openplatform.api.internal.util.TimeoutConfig;
import com.antgroup.zmxy.openplatform.api.internal.util.WebUtils;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaLogger;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaUtils;

/**
 * SDK客户端
 * 
 * @author dengpeng.zdp
 * @version $Id: DefaultZhimaClient.java, v 0.1 2015-9-16 下午5:23:06 dengpeng.zdp Exp $
 */
public class DefaultZhimaClient implements ZhimaClient {

    /**
     * 芝麻开放平台服务地址
     */
    private String             gatewayUrl;

    /**
     * 芝麻给商户分配的AppId
     */
    private String             appId;

    /**加密算法类型*/
    private EncryptionModeEnum encryptionMode;

    /**签名类型*/
    private SignTypeEnum       signType       = SignTypeEnum.SHA1WITHRSA;

    /**采用AES对称加密的秘钥*/
    private String             aesKey;

    /**
     * 商户的私钥
     */
    private String             privateKey;

    /**
     * 芝麻提供给商户的公钥
     */
    private String             zhimaPublicKey;

    /**
     * 业务参数
     */
    private String             bizParam       = ZhimaConstants.BIZ_PARAM_NAME;

    /**
     * 数据编码格式
     */
    private String             charset        = "UTF-8";

    /**
     * 连接超时时间
     */
    private int                connectTimeout = 6000;

    /**
     * 一次请求总超时时间
     */
    private int                readTimeout    = 60000;

    /**
     * 文件上传超时时间
     */
    private int                uploadTimeout  = 7200000;

    static {
        //清除安全设置
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }

    /**
     * 初始化SDK客户端
     * @param gatewayUrl 芝麻开放平台地址
     * @param appId 芝麻分配的商户App ID
     * @param privateKey -- 商户的私钥
     * @param zhimaPublicKey 芝麻的公钥
     */
    public DefaultZhimaClient(String gatewayUrl, String appId, String privateKey,
                              String zhimaPublicKey) {
        this.gatewayUrl = gatewayUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.zhimaPublicKey = zhimaPublicKey;
    }

    /**
     * 初始化SDK客户端
     * @param gatewayUrl 芝麻开放平台地址
     * @param appId 芝麻分配的商户App ID
     * @param charset 字符集比如UTF-8
     * @param privateKey -- 商户的私钥
     * @param zhimaPublicKey 芝麻的公钥
     */
    public DefaultZhimaClient(String gatewayUrl, String appId, String charset, String privateKey,
                              String zhimaPublicKey) {
        this.gatewayUrl = gatewayUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.charset = charset;
        this.zhimaPublicKey = zhimaPublicKey;
    }

    /**
     * 初始化SDK客户端
     * @param gatewayUrl 芝麻开放平台地址
     * @param appId 芝麻分配的商户App ID
     * @param charset 字符集比如UTF-8
     * @param privateKey -- 商户的私钥
     * @param zhimaPublicKey 芝麻的公钥
     * @param timeoutConfig 超时时间设置
     */
    public DefaultZhimaClient(String gatewayUrl, String appId, String charset, String privateKey,
                              String zhimaPublicKey, TimeoutConfig timeoutConfig) {
        this.gatewayUrl = gatewayUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.charset = charset;
        this.zhimaPublicKey = zhimaPublicKey;
        initTimeoutConfig(timeoutConfig);
    }

    /**
     * 初始化SDK客户端
     * @param gatewayUrl 芝麻开放平台地址
     * @param appId 芝麻分配的商户App ID
     * @param charset 字符集比如UTF-8
     * @param privateKey -- 商户的私钥
     * @param zhimaPublicKey 芝麻的公钥
     * @param encrytionMode 加密类型
     */
    public DefaultZhimaClient(String gatewayUrl, String appId, String charset, String privateKey,
                              String zhimaPublicKey, EncryptionModeEnum encrytionMode) {
        this.gatewayUrl = gatewayUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.charset = charset;
        this.zhimaPublicKey = zhimaPublicKey;
        this.encryptionMode = encrytionMode;
    }

    /**
     * 初始化SDK客户端
     * @param gatewayUrl 芝麻开放平台地址
     * @param appId 芝麻分配的商户App ID
     * @param charset 字符集比如UTF-8
     * @param privateKey -- 商户的私钥
     * @param zhimaPublicKey 芝麻的公钥
     * @param encrytionMode 加密类型
     * @param signType 签名类型
     * @param aesKey aes对称加密算法的秘钥
     */
    public DefaultZhimaClient(String gatewayUrl, String appId, String charset, String privateKey,
                              String zhimaPublicKey, EncryptionModeEnum encrytionMode,
                              SignTypeEnum signType, String aesKey) {
        this.gatewayUrl = gatewayUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.charset = charset;
        this.zhimaPublicKey = zhimaPublicKey;
        this.encryptionMode = encrytionMode;
        this.signType = signType;
        this.aesKey = aesKey;
    }

    /**
     * 执行调用
     * @see com.antgroup.zmxy.openplatform.api.ZhimaClient#execute(com.antgroup.zmxy.openplatform.api.ZhimaRequest)
     */
    public <T extends ZhimaResponse> T execute(ZhimaRequest<T> request) throws ZhimaApiException {
        ZhimaParser<T> parser = null;
        parser = new ObjectJsonParser<T>(request.getResponseClass());
        return _execute(request, parser);
    }

    /**
     * 对于page_redirect类型的接口调用,生成用来调用这种类型接口的url,便于在浏览器中使用
     * 
     * @param request 接口请求
     * @exception ZhimaApiException 异常
     * @return 用于在浏览器中访问的url
     */
    public String generatePageRedirectInvokeUrl(ZhimaRequest request) throws ZhimaApiException {
        try {
            String systemQueryParam = WebUtils.buildQuery(getSystemParams(request), charset);
            StringBuffer urlSb = new StringBuffer(gatewayUrl);
            urlSb.append("?");
            urlSb.append(systemQueryParam);

            //append encrypted app param
            String encryptedAppParam = generateEncryptedParam(request);
            urlSb.append("&").append(bizParam).append("=")
                .append(URLEncoder.encode(encryptedAppParam, charset));
            return urlSb.toString();
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 1. 先解密，再验签
     * 2. 如果验签成功，然后返回解密后的值
     * 3. 如果验签失败，抛出异常
     * 
     * @param encryptedResponse 加密后的返回值
     * @param sign 签名(对未加密的返回值的签名)
     * @return　解密后的返回值
     * @throws ZhimaApiException　芝麻API异常
     */
    public String decryptAndVerifySign(String encryptedResponse, String sign)
                                                                             throws ZhimaApiException {
        try {
            String decryptedResponse = RSACoderUtil.decrypt(encryptedResponse, privateKey, charset,
                encryptionMode);
            boolean verifyResult = RSACoderUtil.verify(decryptedResponse.getBytes(charset),
                zhimaPublicKey, sign);
            if (verifyResult == false) {
                throw new ZhimaApiException("验签失败");
            }
            return decryptedResponse;
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 生成系统参数的map
     * 
     * @param request 请求参数
     * @return 系统参数Map
     * @throws ZhimaApiException
     */
    private ZhimaHashMap getSystemParams(ZhimaRequest request) throws ZhimaApiException {
        try {
            ZhimaHashMap protocolParams = new ZhimaHashMap();
            protocolParams.put(ZhimaConstants.METHOD, request.getApiMethodName());
            protocolParams.put(ZhimaConstants.VERSION, request.getApiVersion());
            protocolParams.put(ZhimaConstants.APP_ID, this.appId);
            protocolParams.put(ZhimaConstants.CHARSET, charset);
            protocolParams.put(ZhimaConstants.SCENE, request.getScene());

            DateFormat df = new SimpleDateFormat(ZhimaConstants.DATE_TIME_FORMAT);
            df.setTimeZone(TimeZone.getTimeZone(ZhimaConstants.DATE_TIMEZONE));

            protocolParams.put(ZhimaConstants.CHANNEL, request.getChannel());
            protocolParams.put(ZhimaConstants.PLATFORM, request.getPlatform());
            protocolParams.put(ZhimaConstants.EXT_PARAMS, request.getExtParams());

            //签名
            String bizParamStr = getBizParamStr(request);
            String signContent = RSACoderUtil.sign(signType, bizParamStr, charset, privateKey);
            protocolParams.put(ZhimaConstants.SIGN, signContent);
            protocolParams.put(ZhimaConstants.SIGN_TYPE, signType.getCode());

            //如果是AES的加密方式，需要将aes的秘钥用RSA公钥加密后作为系统参数放在请求里面
            if (encryptionMode == EncryptionModeEnum.AES) {
                String encryptedAesKey = RSACoderUtil.encrypt(aesKey, charset, zhimaPublicKey);
                protocolParams.put(ZhimaConstants.ENCRYPTED_AES_KEY, encryptedAesKey);
                protocolParams
                    .put(ZhimaConstants.ENCRYPTION_MODE, EncryptionModeEnum.AES.getCode());
            }

            return protocolParams;
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 
     * 生成签名
     * @param request 请求
     * @return 请求签名
     * @throws ZhimaApiException API调用异常
     */
    public String generateSign(ZhimaRequest request) throws ZhimaApiException {
        try {
            String bizParamStr = getBizParamStr(request);
            String signContent = RSACoderUtil.sign(bizParamStr, charset, privateKey);
            return signContent;
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 
     * 生成签名并进行UrlEncode
     * @param request 请求
     * @return 请求签名
     * @throws ZhimaApiException API调用异常
     */
    public String generateSignWithUrlEncode(ZhimaRequest request) throws ZhimaApiException {
        try {
            String sign = generateSign(request);
            return URLEncoder.encode(sign, charset);
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 生成加密后的参数
     * @param request 请求参数
     * @exception ZhimaApiException 异常
     * @return 加密后的参数
     */
    public String generateEncryptedParam(ZhimaRequest request) throws ZhimaApiException {
        try {
            String bizParamStr = getBizParamStr(request);
            String encryptedBizParam = RSACoderUtil.encrypt(bizParamStr, charset, zhimaPublicKey,
                encryptionMode);

            return encryptedBizParam;
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 生成加密后的参数并进行UrlEncode
     * @param request 请求参数
     * @exception ZhimaApiException 异常
     * @return 加密后的参数
     */
    public String generateEncryptedParamWithUrlEncode(ZhimaRequest request)
                                                                           throws ZhimaApiException {
        try {
            String encryptedParam = generateEncryptedParam(request);
            return URLEncoder.encode(encryptedParam, charset);
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 生成未加密的app参数的url串
     * 
     * @param request 请求参数
     * @return 组装好的业务参数
     * @throws ZhimaApiException 异常
     */
    private String getBizParamStr(ZhimaRequest request) throws ZhimaApiException {
        try {
            Map<String, String> bizParams = request.getTextParams();
            String bizParamStr = WebUtils.buildQuery(bizParams, charset);
            return bizParamStr;
        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 执行调用
     * 
     * @param request
     * @param parser
     * @return
     * @throws ZhimaApiException
     */
    private <T extends ZhimaResponse> T _execute(ZhimaRequest<T> request, ZhimaParser<T> parser)
                                                                                                throws ZhimaApiException {
        Map<String, Object> rt = doPost(request);
        if (rt == null) {
            return null;
        }

        T tRsp = null;
        try {
            tRsp = parser.parse((String) rt.get("rsp"));
            tRsp.setBody((String) rt.get("rsp"));

        } catch (RuntimeException e) {
            ZhimaLogger.logBizError((String) rt.get("rsp"));
            throw e;
        } catch (ZhimaApiException e) {
            ZhimaLogger.logBizError((String) rt.get("rsp"));
            throw new ZhimaApiException(e);
        }

        tRsp.setParams((ZhimaHashMap) rt.get("textParams"));
        if (!tRsp.isSuccess()) {
            ZhimaLogger.logErrorScene(rt, tRsp, "");
        }
        return tRsp;
    }

    /**
     * 进行HTTP POST请求
     * 
     * @param request 请求对象
     * @return 结果对象
     * @throws ZhimaApiException API调用异常
     */
    public <T extends ZhimaResponse> Map<String, Object> doPost(ZhimaRequest<T> request)
                                                                                        throws ZhimaApiException {
        try {
            Map<String, Object> result = new HashMap<String, Object>();
            String bizParamStr = getBizParamStr(request);

            String encryptedBizParam = null;
            if (encryptionMode == EncryptionModeEnum.AES) {
                encryptedBizParam = AESUtil.encrypt(bizParamStr, aesKey, charset);
            } else {
                encryptedBizParam = RSACoderUtil.encrypt(bizParamStr, charset, zhimaPublicKey,
                    encryptionMode);
            }

            Map<String, String> encodedBizParamMap = new HashMap<String, String>();
            encodedBizParamMap.put(bizParam, encryptedBizParam);
            ZhimaHashMap appParams = new ZhimaHashMap(encodedBizParamMap);

            if (StringUtils.isEmpty(charset)) {
                charset = ZhimaConstants.CHARSET_UTF8;
            }

            ZhimaHashMap sysParams = getSystemParams(request);
            String sysQueryParam = WebUtils.buildQuery(sysParams, charset);
            StringBuffer urlSb = new StringBuffer(gatewayUrl);
            urlSb.append("?");
            urlSb.append(sysQueryParam);

            String fullRsp = null;
            if (request instanceof ZhimaUploadRequest) {
                ZhimaUploadRequest<T> uRequest = (ZhimaUploadRequest<T>) request;
                Map<String, FileItem> fileParams = ZhimaUtils.cleanupMap(uRequest.getFileParams());
                fullRsp = WebUtils.doPost(urlSb.toString(), appParams, fileParams, charset,
                    connectTimeout, uploadTimeout);
            } else {
                fullRsp = WebUtils.doPost(urlSb.toString(), appParams, charset, connectTimeout,
                    readTimeout);
            }

            //首先判断结果是否已经加密，如果已经加密则解密，在调用返回错误的情况下不会加密
            String decryptedRsp = null;
            if (encryptionMode == EncryptionModeEnum.AES) {
                decryptedRsp = AESUtil.decryptResponse(fullRsp, aesKey, charset);
            } else {
                decryptedRsp = RSACoderUtil.decryptResponse(fullRsp, privateKey, charset,
                    encryptionMode);
            }

            //如果需要验签,执行验签操作,如果验签不通过,则抛出异常
            RSACoderUtil.verifySign(signType, fullRsp, decryptedRsp, zhimaPublicKey, charset);

            result.put("rsp", decryptedRsp);
            result.put("textParams", appParams);
            result.put("protocalParams", sysParams);
            result.put("url", urlSb.toString());
            return result;

        } catch (Exception e) {
            throw new ZhimaApiException(e);
        }
    }

    /**
     * 使用AES秘钥对文件进行加密，并存储在目标文件中，存储在目标文件中的是二进制流，
     * 不是base64编码后的字符串
     * 
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     */
    public void encryptFileWithAES(String sourceFile, String targetFile) throws Exception {
        AESUtil.encryptFile(new File(sourceFile), new File(targetFile), aesKey, targetFile);
    }

    /**
     * 设置timeout
     * 
     * @param timeoutConfig
     */
    private void initTimeoutConfig(TimeoutConfig timeoutConfig) {
        if (timeoutConfig != null) {
            if (timeoutConfig.getConnectTimeout() > 0) {
                this.connectTimeout = timeoutConfig.getConnectTimeout();
            }

            if (timeoutConfig.getRequestTimeout() > 0) {
                this.readTimeout = timeoutConfig.getRequestTimeout();
            }

            if (timeoutConfig.getFileUploadTimeout() > 0) {
                this.uploadTimeout = timeoutConfig.getFileUploadTimeout();
            }
        }
    }
}
