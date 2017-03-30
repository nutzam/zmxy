package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.trueidentity.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-23 16:38:34
 */
public class ZhimaCreditTrueidentityGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4893721153552278853L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 加密后的银行卡号
	 */
	@ApiField("encrypted_card_no")
	private String encryptedCardNo;

	/** 
	 * 未返回真身id的原因

枚举：EMPTY_RESULT（默认值，真身id为空）
          BINDED_CARD_IS_NULL （用户未绑卡）
          IDENTITY_INFO_NOT_MATCH  （持卡人证件号与姓名与支付宝信息不完全匹配）
          CARDHOLDER_HAS_NO_MOBILE（持卡人无手机号信息）
          CERT_TYPE_INVALID（持卡人证件类型不支持）
	 */
	@ApiField("info_code")
	private String infoCode;

	/** 
	 * 真身核实ID。
	 */
	@ApiField("true_identity_id")
	private String trueIdentityId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setEncryptedCardNo(String encryptedCardNo) {
		this.encryptedCardNo = encryptedCardNo;
	}
	public String getEncryptedCardNo( ) {
		return this.encryptedCardNo;
	}

	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}
	public String getInfoCode( ) {
		return this.infoCode;
	}

	public void setTrueIdentityId(String trueIdentityId) {
		this.trueIdentityId = trueIdentityId;
	}
	public String getTrueIdentityId( ) {
		return this.trueIdentityId;
	}

}
