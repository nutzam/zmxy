package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.merchant.expand.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:52:43
 */
public class ZhimaMerchantExpandApplyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7448421226628954161L;

	/** 
	 * 二级商户标识
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId( ) {
		return this.linkedMerchantId;
	}

}
