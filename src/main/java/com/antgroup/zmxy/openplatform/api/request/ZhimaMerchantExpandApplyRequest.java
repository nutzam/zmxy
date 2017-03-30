package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaMerchantExpandApplyResponse;

/**
 * ALIPAY API: zhima.merchant.expand.apply request
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:52:43
 */
public class ZhimaMerchantExpandApplyRequest implements ZhimaRequest<ZhimaMerchantExpandApplyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 浙江飞猪网络技术有限公司，企业别称请填写【飞猪】
	 */
	private String aliasName;

	/** 
	* 为用户提供服务的支付宝服务窗名称，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String alipayWindowName;

	/** 
	* 为用户提供服务的手机应用，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String appName;

	/** 
	* 用于记录本次提交信息中，那些字段有所调整
	 */
	private String applyMemo;

	/** 
	* 签约芝麻信用产品的用途，最多5个场景，ISV可以自定义
	 */
	private String bizScene;

	/** 
	* 数据反馈联系人邮箱地址(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	private String dataFeedbackContractEmail;

	/** 
	* 数据反馈联系人手机号码(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	private String dataFeedbackContractMobile;

	/** 
	* 数据反馈联系人姓名(使用芝麻信用评分、行业关注名单时，联动解决数据问题的接口人。)
	 */
	private String dataFeedbackContractName;

	/** 
	* 商户logo的图片内容，把图片的二进制转化成String传递过来
，最大2M
	 */
	private String logoImage;

	/** 
	* 商户图标类型，只支持如下格式：bmp, jpg, jpeg, png, gif
	 */
	private String logoImageType;

	/** 
	* 主要联系人邮箱地址(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	private String majorContractEmail;

	/** 
	* 主要联系人手机号码(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	private String majorContractMobile;

	/** 
	* 主要联系人姓名(联系人将用于接收重要通知，如签约进度、技术集成、合同到期等)
	 */
	private String majorContractName;

	/** 
	* 异议处理联系人邮箱地址(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	private String objectionContractEmail;

	/** 
	* 异议处理联系人手机号码(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	private String objectionContractMobile;

	/** 
	* 异议处理联系人姓名(用户对所披露的负面信息存在异议时，联动核查的接口人)
	 */
	private String objectionContractName;

	/** 
	* 芝麻特定的商户一级行业归属，比如生活行业，金融行业，政府行业
	 */
	private String oneLevelMcc;

	/** 
	* 商户业务许可证图片内容，把图片的二进制转化成String传递过来
，最大2M
	 */
	private String qualificationImage;

	/** 
	* 商户业务许可证图片类型，只支持如下格式：bmp, jpg, jpeg, png, gif
	 */
	private String qualificationImageType;

	/** 
	* 服务联动联系人邮箱地址(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	private String serviceContractEmail;

	/** 
	* 服务联动联系人手机号码(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	private String serviceContractMobile;

	/** 
	* 服务联动联系人姓名(联动解决用户服务相关问题的接口人。比如用户投诉或出现重大服务事件时，可以协调解决问题的联系人)
	 */
	private String serviceContractName;

	/** 
	* 芝麻特有的商户二级行业归属，比如汽车服务
	 */
	private String twoLevelMcc;

	/** 
	* 用户提供服务的微信公众号，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String webchatAmount;

	/** 
	* 为用户提供服务的网站，如有请填写
支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String websitUrl;

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAliasName() {
		return this.aliasName;
	}

	public void setAlipayWindowName(String alipayWindowName) {
		this.alipayWindowName = alipayWindowName;
	}
	public String getAlipayWindowName() {
		return this.alipayWindowName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setApplyMemo(String applyMemo) {
		this.applyMemo = applyMemo;
	}
	public String getApplyMemo() {
		return this.applyMemo;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene() {
		return this.bizScene;
	}

	public void setDataFeedbackContractEmail(String dataFeedbackContractEmail) {
		this.dataFeedbackContractEmail = dataFeedbackContractEmail;
	}
	public String getDataFeedbackContractEmail() {
		return this.dataFeedbackContractEmail;
	}

	public void setDataFeedbackContractMobile(String dataFeedbackContractMobile) {
		this.dataFeedbackContractMobile = dataFeedbackContractMobile;
	}
	public String getDataFeedbackContractMobile() {
		return this.dataFeedbackContractMobile;
	}

	public void setDataFeedbackContractName(String dataFeedbackContractName) {
		this.dataFeedbackContractName = dataFeedbackContractName;
	}
	public String getDataFeedbackContractName() {
		return this.dataFeedbackContractName;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}
	public String getLogoImage() {
		return this.logoImage;
	}

	public void setLogoImageType(String logoImageType) {
		this.logoImageType = logoImageType;
	}
	public String getLogoImageType() {
		return this.logoImageType;
	}

	public void setMajorContractEmail(String majorContractEmail) {
		this.majorContractEmail = majorContractEmail;
	}
	public String getMajorContractEmail() {
		return this.majorContractEmail;
	}

	public void setMajorContractMobile(String majorContractMobile) {
		this.majorContractMobile = majorContractMobile;
	}
	public String getMajorContractMobile() {
		return this.majorContractMobile;
	}

	public void setMajorContractName(String majorContractName) {
		this.majorContractName = majorContractName;
	}
	public String getMajorContractName() {
		return this.majorContractName;
	}

	public void setObjectionContractEmail(String objectionContractEmail) {
		this.objectionContractEmail = objectionContractEmail;
	}
	public String getObjectionContractEmail() {
		return this.objectionContractEmail;
	}

	public void setObjectionContractMobile(String objectionContractMobile) {
		this.objectionContractMobile = objectionContractMobile;
	}
	public String getObjectionContractMobile() {
		return this.objectionContractMobile;
	}

	public void setObjectionContractName(String objectionContractName) {
		this.objectionContractName = objectionContractName;
	}
	public String getObjectionContractName() {
		return this.objectionContractName;
	}

	public void setOneLevelMcc(String oneLevelMcc) {
		this.oneLevelMcc = oneLevelMcc;
	}
	public String getOneLevelMcc() {
		return this.oneLevelMcc;
	}

	public void setQualificationImage(String qualificationImage) {
		this.qualificationImage = qualificationImage;
	}
	public String getQualificationImage() {
		return this.qualificationImage;
	}

	public void setQualificationImageType(String qualificationImageType) {
		this.qualificationImageType = qualificationImageType;
	}
	public String getQualificationImageType() {
		return this.qualificationImageType;
	}

	public void setServiceContractEmail(String serviceContractEmail) {
		this.serviceContractEmail = serviceContractEmail;
	}
	public String getServiceContractEmail() {
		return this.serviceContractEmail;
	}

	public void setServiceContractMobile(String serviceContractMobile) {
		this.serviceContractMobile = serviceContractMobile;
	}
	public String getServiceContractMobile() {
		return this.serviceContractMobile;
	}

	public void setServiceContractName(String serviceContractName) {
		this.serviceContractName = serviceContractName;
	}
	public String getServiceContractName() {
		return this.serviceContractName;
	}

	public void setTwoLevelMcc(String twoLevelMcc) {
		this.twoLevelMcc = twoLevelMcc;
	}
	public String getTwoLevelMcc() {
		return this.twoLevelMcc;
	}

	public void setWebchatAmount(String webchatAmount) {
		this.webchatAmount = webchatAmount;
	}
	public String getWebchatAmount() {
		return this.webchatAmount;
	}

	public void setWebsitUrl(String websitUrl) {
		this.websitUrl = websitUrl;
	}
	public String getWebsitUrl() {
		return this.websitUrl;
	}
	private String channel;
	private String platform;	
	private String scene;
	private String extParams;

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setChannel(String channel){
		this.channel=channel;
	}

    public String getChannel(){
    	return this.channel;
    }

	public void setPlatform(String platform){
		this.platform=platform;
	}

    public String getPlatform(){
    	return this.platform;
    }
    
    public void setScene(String scene){
		this.scene=scene;
	}

    public String getScene(){
    	return this.scene;
    }
    
    public void setExtParams(String extParams){
		this.extParams=extParams;
	}

    public String getExtParams(){
    	return this.extParams;
    }
    
	public String getApiMethodName() {
		return "zhima.merchant.expand.apply";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("alias_name", this.aliasName);
		txtParams.put("alipay_window_name", this.alipayWindowName);
		txtParams.put("app_name", this.appName);
		txtParams.put("apply_memo", this.applyMemo);
		txtParams.put("biz_scene", this.bizScene);
		txtParams.put("data_feedback_contract_email", this.dataFeedbackContractEmail);
		txtParams.put("data_feedback_contract_mobile", this.dataFeedbackContractMobile);
		txtParams.put("data_feedback_contract_name", this.dataFeedbackContractName);
		txtParams.put("logo_image", this.logoImage);
		txtParams.put("logo_image_type", this.logoImageType);
		txtParams.put("major_contract_email", this.majorContractEmail);
		txtParams.put("major_contract_mobile", this.majorContractMobile);
		txtParams.put("major_contract_name", this.majorContractName);
		txtParams.put("objection_contract_email", this.objectionContractEmail);
		txtParams.put("objection_contract_mobile", this.objectionContractMobile);
		txtParams.put("objection_contract_name", this.objectionContractName);
		txtParams.put("one_level_mcc", this.oneLevelMcc);
		txtParams.put("qualification_image", this.qualificationImage);
		txtParams.put("qualification_image_type", this.qualificationImageType);
		txtParams.put("service_contract_email", this.serviceContractEmail);
		txtParams.put("service_contract_mobile", this.serviceContractMobile);
		txtParams.put("service_contract_name", this.serviceContractName);
		txtParams.put("two_level_mcc", this.twoLevelMcc);
		txtParams.put("webchat_amount", this.webchatAmount);
		txtParams.put("websit_url", this.websitUrl);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new ZhimaHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<ZhimaMerchantExpandApplyResponse> getResponseClass() {
		return ZhimaMerchantExpandApplyResponse.class;
	}
}
