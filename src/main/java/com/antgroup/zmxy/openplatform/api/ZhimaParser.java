package com.antgroup.zmxy.openplatform.api;

/**
 * 响应解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface ZhimaParser<T extends ZhimaResponse> {

    /**
     * 把响应字符串解释成相应的领域对象。
     * 
     * @param rsp 响应字符串
     * @return 领域对象
     */
    public T parse(String rsp) throws ZhimaApiException;

    /**
     * 获取响应类类型。
     */
    public Class<T> getResponseClass() throws ZhimaApiException;

    /**
     * 获取响应内的签名数据
     * 
     * @param rsp 响应字符串
     * @return
     * @throws ZhimaApiException
     */
    public SignItem getSignItem(ZhimaRequest<?> request, ZhimaResponse response)
                                                                                  throws ZhimaApiException;

}
