/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.antgroup.zmxy.openplatform.api;


/**
 * 
 * @author runzhi
 */
public class ZhimaApiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String            errCode;
    private String            errMsg;

    public ZhimaApiException() {
        super();
    }

    public ZhimaApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZhimaApiException(String message) {
        super(message);
    }

    public ZhimaApiException(Throwable cause) {
        super(cause);
    }

    public ZhimaApiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

}