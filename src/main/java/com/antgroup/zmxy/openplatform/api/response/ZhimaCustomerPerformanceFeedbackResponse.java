package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.customer.performance.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-22 17:42:59
 */
public class ZhimaCustomerPerformanceFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4283182511853821375L;

	/** 
	 * 
	 */
	@ApiField("biz_success")
	private String bizSuccess;

	public void setBizSuccess(String bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public String getBizSuccess( ) {
		return this.bizSuccess;
	}

}
