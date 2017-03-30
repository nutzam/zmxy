package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 企业征信基本单元
 *
 * @author auto create
 * @since 1.0, 2016-02-04 14:57:03
 */
public class EpElement extends ZhimaObject {

	private static final long serialVersionUID = 5169432527414359934L;

	/** 
	 * key键值
	 */
	@ApiField("key")
	private String key;

	/** 
	 * value键值
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
