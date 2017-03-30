package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.merchant.enterprise.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:54:06
 */
public class ZhimaMerchantEnterpriseQueryResponse extends ZhimaResponse {

	private static final long serialVersionUID = 8721353781339673627L;

	/** 
	 * 审核失败的具体原因
	 */
	@ApiField("audit_fail_reason")
	private String auditFailReason;

	/** 
	 * 审核状态： Y:通过 N:不通过 ING:审批中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 二级商户标识
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/** 
	 * 商户认证状态： 1:未认证 3:已认证
	 */
	@ApiField("merchant_status")
	private String merchantStatus;

	/** 
	 * 商户在芝麻域认证状态： 1:已认证 0:未认证
	 */
	@ApiField("zhima_certify_status")
	private String zhimaCertifyStatus;

	/** 
	 * 商户被芝麻冻结的原因
	 */
	@ApiField("zhima_freeze_reason")
	private String zhimaFreezeReason;

	/** 
	 * 商户在芝麻域的冻结状态 1:冻结 0:未冻结
	 */
	@ApiField("zhima_freeze_status")
	private String zhimaFreezeStatus;

	public void setAuditFailReason(String auditFailReason) {
		this.auditFailReason = auditFailReason;
	}
	public String getAuditFailReason( ) {
		return this.auditFailReason;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId( ) {
		return this.linkedMerchantId;
	}

	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	public String getMerchantStatus( ) {
		return this.merchantStatus;
	}

	public void setZhimaCertifyStatus(String zhimaCertifyStatus) {
		this.zhimaCertifyStatus = zhimaCertifyStatus;
	}
	public String getZhimaCertifyStatus( ) {
		return this.zhimaCertifyStatus;
	}

	public void setZhimaFreezeReason(String zhimaFreezeReason) {
		this.zhimaFreezeReason = zhimaFreezeReason;
	}
	public String getZhimaFreezeReason( ) {
		return this.zhimaFreezeReason;
	}

	public void setZhimaFreezeStatus(String zhimaFreezeStatus) {
		this.zhimaFreezeStatus = zhimaFreezeStatus;
	}
	public String getZhimaFreezeStatus( ) {
		return this.zhimaFreezeStatus;
	}

}
