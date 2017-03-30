package com.antgroup.zmxy.openplatform.api.internal.util;

/**
 * 
 * 
 * @author dengpeng.zdp
 * @version $Id: TimeoutConfig.java, v 0.1 2016-6-22 下午3:40:57 dengpeng.zdp Exp $
 */
public class TimeoutConfig {
    /**
     * 建立连接超时时间, 单位是毫秒
     */
    private int connectTimeout;

    /**
     * 非文件上传类请求总超时时间, 单位是毫秒
     */
    private int requestTimeout;

    /**
     * 文件上传类请求超时时间, 单位是毫秒
     */
    private int fileUploadTimeout;

    /**
     * 超时时间设置, 单位是毫秒
     * @param connectTimeout 建立连接超时时间, 单位是毫秒
     * @param requestTimeout 非文件上传类请求总超时时间, 单位是毫秒
     * @param fileUploadTimeout 文件上传类请求总超时时间, 单位是毫秒
     */
    public TimeoutConfig(int connectTimeout, int requestTimeout, int fileUploadTimeout) {
        this.connectTimeout = connectTimeout;
        this.requestTimeout = requestTimeout;
        this.fileUploadTimeout = fileUploadTimeout;
    }

    /**
     * Getter method for property <tt>connectTimeout</tt>.
     * 
     * @return property value of connectTimeout
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Setter method for property <tt>connectTimeout</tt>.
     * 
     * @param connectTimeout value to be assigned to property connectTimeout
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Getter method for property <tt>requestTimeout</tt>.
     * 
     * @return property value of requestTimeout
     */
    public int getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Setter method for property <tt>requestTimeout</tt>.
     * 
     * @param requestTimeout value to be assigned to property requestTimeout
     */
    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * Getter method for property <tt>fileUploadTimeout</tt>.
     * 
     * @return property value of fileUploadTimeout
     */
    public int getFileUploadTimeout() {
        return fileUploadTimeout;
    }

    /**
     * Setter method for property <tt>fileUploadTimeout</tt>.
     * 
     * @param fileUploadTimeout value to be assigned to property fileUploadTimeout
     */
    public void setFileUploadTimeout(int fileUploadTimeout) {
        this.fileUploadTimeout = fileUploadTimeout;
    }
}
