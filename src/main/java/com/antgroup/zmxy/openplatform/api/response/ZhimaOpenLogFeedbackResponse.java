package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.open.log.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 15:23:56
 */
public class ZhimaOpenLogFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3539487651757832376L;

	/** 
	 * 
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
