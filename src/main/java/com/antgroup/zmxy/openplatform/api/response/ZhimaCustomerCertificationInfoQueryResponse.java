package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.customer.certification.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-30 14:32:06
 */
public class ZhimaCustomerCertificationInfoQueryResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5162181589847713666L;

	/** 
	 * 认证场景码,有如下几种场景:
－“FACE_SDK”：认证严格度适中，建议对应各类对身份顶替风险容忍度较低的业务场景，比如各类与资金或密码没有关系的场景
－“FACE_SDK_STRICT”：认证严格度高，建议对应各类对身份顶替风险容忍度极低的业务场景，比如修改密码、大额交易、资金管理
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 要认证的身份信息,包含证件类型,证件名,证件号
	 */
	@ApiField("certify_identity")
	private String certifyIdentity;

	/** 
	 * 要认证的商户信息
	 */
	@ApiField("certify_merchant")
	private String certifyMerchant;

	/** 
	 * 扩展业务信息
	 */
	@ApiField("ext_biz_info")
	private String extBizInfo;

	/** 
	 * 认证是否已经通过
	 */
	@ApiField("passed")
	private String passed;

	/** 
	 * 商户回调地址
	 */
	@ApiField("return_url")
	private String returnUrl;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCertifyIdentity(String certifyIdentity) {
		this.certifyIdentity = certifyIdentity;
	}
	public String getCertifyIdentity( ) {
		return this.certifyIdentity;
	}

	public void setCertifyMerchant(String certifyMerchant) {
		this.certifyMerchant = certifyMerchant;
	}
	public String getCertifyMerchant( ) {
		return this.certifyMerchant;
	}

	public void setExtBizInfo(String extBizInfo) {
		this.extBizInfo = extBizInfo;
	}
	public String getExtBizInfo( ) {
		return this.extBizInfo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getReturnUrl( ) {
		return this.returnUrl;
	}

}
