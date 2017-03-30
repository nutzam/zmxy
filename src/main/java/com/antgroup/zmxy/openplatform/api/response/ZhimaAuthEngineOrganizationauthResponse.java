package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.auth.engine.organizationauth response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-10 15:30:19
 */
public class ZhimaAuthEngineOrganizationauthResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3478329439722444445L;

	/** 
	 * 27位openId，用于标识芝麻会员在
	 */
	@ApiField("open_id")
	private String openId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
