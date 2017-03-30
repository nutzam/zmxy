package com.antgroup.zmxy.openplatform.api.internal.parser.xml;

import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.ZhimaParser;
import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.SignItem;
import com.antgroup.zmxy.openplatform.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectXmlParser<T extends ZhimaResponse> implements ZhimaParser<T> {

    private Class<T> clazz;

    public ObjectXmlParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws ZhimaApiException {
        Converter converter = new XmlConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    /** 
     * @see com.antgroup.zmxy.openplatform.api.ZhimaParser#getSignItem(com.antgroup.zmxy.openplatform.api.ZhimaRequest, com.antgroup.zmxy.openplatform.api.ZhimaResponse)
     */
    public SignItem getSignItem(ZhimaRequest<?> request, ZhimaResponse response)
                                                                                  throws ZhimaApiException {

        Converter converter = new XmlConverter();

        return converter.getSignItem(request, response);
    }

}
