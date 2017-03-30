package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.merchant.expand.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:51:43
 */
public class ZhimaMerchantExpandQueryResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5773942982257382919L;

	/** 
	 * 浙江飞猪网络技术有限公司，企业别称请填写【飞猪】
	 */
	@ApiField("alias_name")
	private String aliasName;

	/** 
	 * 为用户提供服务的支付宝服务窗名称，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	@ApiField("alipay_window_name")
	private String alipayWindowName;

	/** 
	 * 为用户提供服务的手机应用，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 审核失败的具体原因
	 */
	@ApiField("audit_fail_reason")
	private String auditFailReason;

	/** 
	 * 审核状态：
Y:通过
N:不通过
ING:审批中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 签约芝麻信用产品的用途，最多5个场景，ISV可以自定义
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 数据反馈联系人邮箱地址(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	@ApiField("data_feedback_contract_email")
	private String dataFeedbackContractEmail;

	/** 
	 * 数据反馈联系人手机号码(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	@ApiField("data_feedback_contract_mobile")
	private String dataFeedbackContractMobile;

	/** 
	 * 数据反馈联系人姓名(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	@ApiField("data_feedback_contract_name")
	private String dataFeedbackContractName;

	/** 
	 * 商户的支付宝userId
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/** 
	 * 主要联系人邮箱地址(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	@ApiField("major_contract_email")
	private String majorContractEmail;

	/** 
	 * 主要联系人手机号码(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	@ApiField("major_contract_mobile")
	private String majorContractMobile;

	/** 
	 * 主要联系人姓名(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	@ApiField("major_contract_name")
	private String majorContractName;

	/** 
	 * 异议处理联系人邮箱地址(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	@ApiField("objection_contract_email")
	private String objectionContractEmail;

	/** 
	 * 异议处理联系人手机号码(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	@ApiField("objection_contract_mobile")
	private String objectionContractMobile;

	/** 
	 * 异议处理联系人姓名(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	@ApiField("objection_contract_name")
	private String objectionContractName;

	/** 
	 * 芝麻特定的商户一级行业归属，比如生活行业，金融行业，政府行业
	 */
	@ApiField("one_level_mcc")
	private String oneLevelMcc;

	/** 
	 * 服务联动联系人邮箱地址(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	@ApiField("service_contract_email")
	private String serviceContractEmail;

	/** 
	 * 服务联动联系人手机号码(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	@ApiField("service_contract_mobile")
	private String serviceContractMobile;

	/** 
	 * 服务联动联系人姓名(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	@ApiField("service_contract_name")
	private String serviceContractName;

	/** 
	 * 芝麻特有的商户二级行业归属，比如汽车服务
	 */
	@ApiField("two_level_mcc")
	private String twoLevelMcc;

	/** 
	 * 用户提供服务的微信公众号，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	@ApiField("webchat_amount")
	private String webchatAmount;

	/** 
	 * 为用户提供服务的网站，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	@ApiField("websit_url")
	private String websitUrl;

	/** 
	 * 商户在芝麻域认证状态：
1:已认证
0:未认证
	 */
	@ApiField("zhima_certify_status")
	private String zhimaCertifyStatus;

	/** 
	 * 商户被芝麻冻结的原因
	 */
	@ApiField("zhima_freeze_reason")
	private String zhimaFreezeReason;

	/** 
	 * 商户在芝麻域的冻结状态
1:冻结
0:未冻结
	 */
	@ApiField("zhima_freeze_status")
	private String zhimaFreezeStatus;

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAliasName( ) {
		return this.aliasName;
	}

	public void setAlipayWindowName(String alipayWindowName) {
		this.alipayWindowName = alipayWindowName;
	}
	public String getAlipayWindowName( ) {
		return this.alipayWindowName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

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

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setDataFeedbackContractEmail(String dataFeedbackContractEmail) {
		this.dataFeedbackContractEmail = dataFeedbackContractEmail;
	}
	public String getDataFeedbackContractEmail( ) {
		return this.dataFeedbackContractEmail;
	}

	public void setDataFeedbackContractMobile(String dataFeedbackContractMobile) {
		this.dataFeedbackContractMobile = dataFeedbackContractMobile;
	}
	public String getDataFeedbackContractMobile( ) {
		return this.dataFeedbackContractMobile;
	}

	public void setDataFeedbackContractName(String dataFeedbackContractName) {
		this.dataFeedbackContractName = dataFeedbackContractName;
	}
	public String getDataFeedbackContractName( ) {
		return this.dataFeedbackContractName;
	}

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId( ) {
		return this.linkedMerchantId;
	}

	public void setMajorContractEmail(String majorContractEmail) {
		this.majorContractEmail = majorContractEmail;
	}
	public String getMajorContractEmail( ) {
		return this.majorContractEmail;
	}

	public void setMajorContractMobile(String majorContractMobile) {
		this.majorContractMobile = majorContractMobile;
	}
	public String getMajorContractMobile( ) {
		return this.majorContractMobile;
	}

	public void setMajorContractName(String majorContractName) {
		this.majorContractName = majorContractName;
	}
	public String getMajorContractName( ) {
		return this.majorContractName;
	}

	public void setObjectionContractEmail(String objectionContractEmail) {
		this.objectionContractEmail = objectionContractEmail;
	}
	public String getObjectionContractEmail( ) {
		return this.objectionContractEmail;
	}

	public void setObjectionContractMobile(String objectionContractMobile) {
		this.objectionContractMobile = objectionContractMobile;
	}
	public String getObjectionContractMobile( ) {
		return this.objectionContractMobile;
	}

	public void setObjectionContractName(String objectionContractName) {
		this.objectionContractName = objectionContractName;
	}
	public String getObjectionContractName( ) {
		return this.objectionContractName;
	}

	public void setOneLevelMcc(String oneLevelMcc) {
		this.oneLevelMcc = oneLevelMcc;
	}
	public String getOneLevelMcc( ) {
		return this.oneLevelMcc;
	}

	public void setServiceContractEmail(String serviceContractEmail) {
		this.serviceContractEmail = serviceContractEmail;
	}
	public String getServiceContractEmail( ) {
		return this.serviceContractEmail;
	}

	public void setServiceContractMobile(String serviceContractMobile) {
		this.serviceContractMobile = serviceContractMobile;
	}
	public String getServiceContractMobile( ) {
		return this.serviceContractMobile;
	}

	public void setServiceContractName(String serviceContractName) {
		this.serviceContractName = serviceContractName;
	}
	public String getServiceContractName( ) {
		return this.serviceContractName;
	}

	public void setTwoLevelMcc(String twoLevelMcc) {
		this.twoLevelMcc = twoLevelMcc;
	}
	public String getTwoLevelMcc( ) {
		return this.twoLevelMcc;
	}

	public void setWebchatAmount(String webchatAmount) {
		this.webchatAmount = webchatAmount;
	}
	public String getWebchatAmount( ) {
		return this.webchatAmount;
	}

	public void setWebsitUrl(String websitUrl) {
		this.websitUrl = websitUrl;
	}
	public String getWebsitUrl( ) {
		return this.websitUrl;
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
