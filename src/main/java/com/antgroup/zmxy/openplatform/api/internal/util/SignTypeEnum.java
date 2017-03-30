/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.antgroup.zmxy.openplatform.api.internal.util;

/**
 * 签名模式.
 * @author xiaoqing.zhouxq
 * @version $Id: SignModeEnum.java, v 0.1 2016年5月31日 上午9:14:22 xiaoqing.zhouxq Exp $
 */
public enum SignTypeEnum {

    SHA1WITHRSA("RSA", "SHA1withRSA"),

    SHA256WITHRSA("RSA2", "SHA256withRSA");

    /** 签名编码. */
    private String code;

    /** 签名算法. */
    private String desc;

    /**
     * 根据签名编码构造签名模式.
     * @param code 签名编码.
     * @param value 签名算法.
     */
    private SignTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 判断是否是SHA1WITHRSA的签名类型.
     * @return true/false.
     */
    public boolean isSHA1WITHRSA() {
        return this.equals(SHA1WITHRSA);
    }

    /**
     * 判断是否是RSA2的签名类型.
     * @return true/false.
     */
    public boolean isSHA256WITHRSA() {
        return this.equals(SHA256WITHRSA);
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
