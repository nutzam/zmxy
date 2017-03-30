package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 扩展信息 例如对应的订单号
 *
 * @author auto create
 * @since 1.0, 2015-12-14 14:21:57
 */
public class ZmWatchListExtendInfo extends ZhimaObject {

	private static final long serialVersionUID = 3198532292449913637L;

	/** 
	 * 对于这个key的描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 对应的字段名
	 */
	@ApiField("key")
	private String key;

	/** 
	 * 对应的值
	 */
	@ApiField("value")
	private String value;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

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
