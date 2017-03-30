package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.auth.face.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 13:11:30
 */
public class ZhimaAuthFaceVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7439557897837717234L;

	/** 
	 * 业务执行结果是否成功
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 一次请求的标识token
	 */
	@ApiField("token")
	private String token;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
