package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.customer.certify.check response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-18 11:19:53
 */
public class ZhimaCustomerCertifyCheckResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5175163851217196312L;

	/** 
	 * 认证返回结果码，certify_result为false时有值
	 */
	@ApiField("certify_errorcode")
	private String certifyErrorcode;

	/** 
	 * 认证错误信息
	 */
	@ApiField("certify_errormessage")
	private String certifyErrormessage;

	/** 
	 * 认证结果标识，成功为true，失败为false
	 */
	@ApiField("certify_result")
	private String certifyResult;

	/** 
	 * 人脸照片。仅人脸核身时返回该属性
	 */
	@ApiField("face_picture")
	private String facePicture;

	/** 
	 * ！！------废弃-----！！
	 */
	@ApiField("identify_result")
	private String identifyResult;

	/** 
	 * 用户身份识别返回的值为一个json串;例如: { authenticity=true, // 证件是否验证成功 birthday=1989年1月10日, //证件的生出生年月日 sex=男, // 证件上的性别 address=浙江省杭州市xx区xx街道xx号, // 证件上的住址 validity=2010.01.04-2020.01.04，//证件上的有效期 head_picture=/9j/4AAQS, // 证件上的头像字节码被base64加码后的字符串 cert_no=41302619890110
	 */
	@ApiField("identity_result")
	private String identityResult;

	/** 
	 * 芝麻会员在商户端的身份标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 实名标识（T：实名，F：非实名）
	 */
	@ApiField("real_name_flag")
	private String realNameFlag;

	/** 
	 * 为商户自助传递的参数,芝麻不做任何的业务处理，透传给商户。商户端可以使用改属性传递用户唯一标识，在回调中识别用户
	 */
	@ApiField("state")
	private String state;

	/** 
	 * 芝麻认证每一次请求返回的令牌，发起页面认证请求和认证请求结果查询接口都需要使用到该返回值作为入参
	 */
	@ApiField("token")
	private String token;

	public void setCertifyErrorcode(String certifyErrorcode) {
		this.certifyErrorcode = certifyErrorcode;
	}
	public String getCertifyErrorcode( ) {
		return this.certifyErrorcode;
	}

	public void setCertifyErrormessage(String certifyErrormessage) {
		this.certifyErrormessage = certifyErrormessage;
	}
	public String getCertifyErrormessage( ) {
		return this.certifyErrormessage;
	}

	public void setCertifyResult(String certifyResult) {
		this.certifyResult = certifyResult;
	}
	public String getCertifyResult( ) {
		return this.certifyResult;
	}

	public void setFacePicture(String facePicture) {
		this.facePicture = facePicture;
	}
	public String getFacePicture( ) {
		return this.facePicture;
	}

	public void setIdentifyResult(String identifyResult) {
		this.identifyResult = identifyResult;
	}
	public String getIdentifyResult( ) {
		return this.identifyResult;
	}

	public void setIdentityResult(String identityResult) {
		this.identityResult = identityResult;
	}
	public String getIdentityResult( ) {
		return this.identityResult;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setRealNameFlag(String realNameFlag) {
		this.realNameFlag = realNameFlag;
	}
	public String getRealNameFlag( ) {
		return this.realNameFlag;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
