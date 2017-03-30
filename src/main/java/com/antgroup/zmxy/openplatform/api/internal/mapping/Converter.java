package com.antgroup.zmxy.openplatform.api.internal.mapping;

import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.SignItem;

/**
 * 动态格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Converter {

    /**
     * 把字符串转换为响应对象。
     * 
     * @param <T> 领域泛型
     * @param rsp 响应字符串
     * @param clazz 领域类型
     * @return 响应对象
     * @throws TopException
     */
    public <T extends ZhimaResponse> T toResponse(String rsp, Class<T> clazz)
                                                                              throws ZhimaApiException;

    /**
     * 获取响应内的签名数据
     * 
     * @param request
     * @param response
     * @return
     * @throws ZhimaApiException
     */
    public SignItem getSignItem(ZhimaRequest<?> request, ZhimaResponse response)
                                                                                  throws ZhimaApiException;

}
