package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.auth.face.init response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 13:11:48
 */
public class ZhimaAuthFaceInitResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5822158293746345673L;

	/** 
	 * 请求返回的加密串
	 */
	@ApiField("auth_msg")
	private String authMsg;

	public void setAuthMsg(String authMsg) {
		this.authMsg = authMsg;
	}
	public String getAuthMsg( ) {
		return this.authMsg;
	}

}
