package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 企业征信报告的数值对
 *
 * @author auto create
 * @since 1.0, 2016-06-23 14:22:41
 */
public class OperationalReport extends ZhimaObject {

	private static final long serialVersionUID = 2722969266779723917L;

	/** 
	 * 经营报告中的key值，详细值见产品说明文档
	 */
	@ApiField("key")
	private String key;

	/** 
	 * 企业征信报告经营数据具体字段的值
	 */
	@ApiField("value")
	private String value;

	public void setKey(String key) {
		this.key = key;
	}
	public String getKey( ) {
		return this.key;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public String getValue( ) {
		return this.value;
	}

}
