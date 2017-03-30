package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.profile.status.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:36:04
 */
public class ZhimaProfileStatusFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 2621334139633214981L;

	/** 
	 * 业务处理结果
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
