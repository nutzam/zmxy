package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.collection.support response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 11:18:06
 */
public class ZhimaCreditCollectionSupportResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1139949763862896725L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 是否有效联系方式：有（true)／无(false)
	 */
	@ApiField("is_matched")
	private Boolean isMatched;

	/** 
	 * 虚拟号码（阿里小号）
	 */
	@ApiField("virtual_number")
	private String virtualNumber;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}
	public Boolean getIsMatched( ) {
		return this.isMatched;
	}

	public void setVirtualNumber(String virtualNumber) {
		this.virtualNumber = virtualNumber;
	}
	public String getVirtualNumber( ) {
		return this.virtualNumber;
	}

}
