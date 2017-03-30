package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * rain分元素
 *
 * @author auto create
 * @since 1.0, 2015-12-28 20:55:22
 */
public class RAINInfoCodeElement extends ZhimaObject {

	private static final long serialVersionUID = 3826838987275927632L;

	/** 
	 * 风险代码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 风险解释
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 风险名称
	 */
	@ApiField("name")
	private String name;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
