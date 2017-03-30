package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.ep.cloudatlas.apply response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-19 10:06:10
 */
public class ZhimaCreditEpCloudatlasApplyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7541365539328591662L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 云图编码
	 */
	@ApiField("cloudatlas_code")
	private String cloudatlasCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCloudatlasCode(String cloudatlasCode) {
		this.cloudatlasCode = cloudatlasCode;
	}
	public String getCloudatlasCode( ) {
		return this.cloudatlasCode;
	}

}
