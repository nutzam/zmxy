package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.data.batch.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-01 16:12:33
 */
public class ZhimaDataBatchFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3665765452657631399L;

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
