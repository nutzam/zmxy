/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.antgroup.zmxy.openplatform.api;

/**
 * 
 * @author runzhi
 */
public interface ZhimaClient {

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @return
     * @throws ZhimaApiException
     */
    public <T extends ZhimaResponse> T execute(ZhimaRequest<T> request) throws ZhimaApiException;
}
