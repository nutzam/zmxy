package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.auth.engine.protocol response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 13:11:12
 */
public class ZhimaAuthEngineProtocolResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1133713863648273649L;

	/** 
	 * 27位openId，用于标识芝麻会员在商户端的身份标识
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
