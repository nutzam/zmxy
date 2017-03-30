package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaMerchantEnterpriseApplyResponse;

/**
 * ALIPAY API: zhima.merchant.enterprise.apply request
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:54:23
 */
public class ZhimaMerchantEnterpriseApplyRequest implements ZhimaRequest<ZhimaMerchantEnterpriseApplyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户别名
	 */
	private String aliasName;

	/** 
	* 为用户提供服务的支付宝服务窗名称，如有请填写 支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String alipayWindowName;

	/** 
	* 为用户提供服务的手机应用，如有请填写 支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
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
	* 企业地址
	 */
	private String companyAddress;

	/** 
	* 企业名称
	 */
	private String companyName;

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
	* 营业执照中经营结束日期
	 */
	private String endBusinessDate;

	/** 
	* 法人身份证号码
	 */
	private String legalCertNo;

	/** 
	* 法人身份证反面图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String legalCertNoBackImageUrl;

	/** 
	* 法人身份证正面图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String legalCertNoFrontImageUrl;

	/** 
	* 法人身份证有效期结束日期
	 */
	private String legalCertValidEndDate;

	/** 
	* 法人身份证有效期开始日期
	 */
	private String legalCertValidStartDate;

	/** 
	* 法人姓名
	 */
	private String legalName;

	/** 
	* 营业执照的图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String licenseImageUrl;

	/** 
	* 营业执照号
	 */
	private String licenseNo;

	/** 
	* 营业执照类型：
1:普通营业执照
2:多证合一
	 */
	private String licenseType;

	/** 
	* 芝麻二级商户图标的二进制流,最大100K(80*80),需要对图片的二进制流做Base64处理转化成字符串
	 */
	private String logoImage;

	/** 
	* 芝麻二级商户图标后缀：bmp, jpg, jpeg, png, gif
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
	* 芝麻商户一级行业归属，芝麻提供
	 */
	private String oneLevelMcc;

	/** 
	* 组织结构代码证图片url,营业执照时普通类型时，必填
请通过zhima.merchant.image.upload上传文件
	 */
	private String organizationImageUrl;

	/** 
	* 组织机构代码，营业执照时普通类型时，必填
	 */
	private String organizationNo;

	/** 
	* 外部订单号
	 */
	private String outOrderNo;

	/** 
	* 代理人身份证号码
	 */
	private String proxyCertNo;

	/** 
	* 代理人身份证反面图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String proxyCertNoBackImageUrl;

	/** 
	* 代理人身份证正面图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String proxyCertNoFrontImageUrl;

	/** 
	* 代理人身份证有效期结束日期
	 */
	private String proxyCertValidEndDate;

	/** 
	* 代理人身份证有效期开始日期
	 */
	private String proxyCertValidStartDate;

	/** 
	* 代理人委托书url地址
	 */
	private String proxyMandateUrl;

	/** 
	* 代理人姓名
	 */
	private String proxyName;

	/** 
	* 业务许可证图片url
请通过zhima.merchant.image.upload上传文件
	 */
	private String qualificationImageUrl;

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
	* 营业执照中的经营开始日期
	 */
	private String startBusinessDate;

	/** 
	* 芝麻商户二级行业归属，芝麻提供
	 */
	private String twoLevelMcc;

	/** 
	* 用户提供服务的微信公众号，如有请填写 支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
	 */
	private String webchatAmount;

	/** 
	* 为用户提供服务的网站，如有请填写 支付宝服务窗，微信公众号，网站地址，应用名称必须是4选1
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

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return this.companyName;
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

	public void setEndBusinessDate(String endBusinessDate) {
		this.endBusinessDate = endBusinessDate;
	}
	public String getEndBusinessDate() {
		return this.endBusinessDate;
	}

	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}
	public String getLegalCertNo() {
		return this.legalCertNo;
	}

	public void setLegalCertNoBackImageUrl(String legalCertNoBackImageUrl) {
		this.legalCertNoBackImageUrl = legalCertNoBackImageUrl;
	}
	public String getLegalCertNoBackImageUrl() {
		return this.legalCertNoBackImageUrl;
	}

	public void setLegalCertNoFrontImageUrl(String legalCertNoFrontImageUrl) {
		this.legalCertNoFrontImageUrl = legalCertNoFrontImageUrl;
	}
	public String getLegalCertNoFrontImageUrl() {
		return this.legalCertNoFrontImageUrl;
	}

	public void setLegalCertValidEndDate(String legalCertValidEndDate) {
		this.legalCertValidEndDate = legalCertValidEndDate;
	}
	public String getLegalCertValidEndDate() {
		return this.legalCertValidEndDate;
	}

	public void setLegalCertValidStartDate(String legalCertValidStartDate) {
		this.legalCertValidStartDate = legalCertValidStartDate;
	}
	public String getLegalCertValidStartDate() {
		return this.legalCertValidStartDate;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalName() {
		return this.legalName;
	}

	public void setLicenseImageUrl(String licenseImageUrl) {
		this.licenseImageUrl = licenseImageUrl;
	}
	public String getLicenseImageUrl() {
		return this.licenseImageUrl;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getLicenseType() {
		return this.licenseType;
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

	public void setOrganizationImageUrl(String organizationImageUrl) {
		this.organizationImageUrl = organizationImageUrl;
	}
	public String getOrganizationImageUrl() {
		return this.organizationImageUrl;
	}

	public void setOrganizationNo(String organizationNo) {
		this.organizationNo = organizationNo;
	}
	public String getOrganizationNo() {
		return this.organizationNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setProxyCertNo(String proxyCertNo) {
		this.proxyCertNo = proxyCertNo;
	}
	public String getProxyCertNo() {
		return this.proxyCertNo;
	}

	public void setProxyCertNoBackImageUrl(String proxyCertNoBackImageUrl) {
		this.proxyCertNoBackImageUrl = proxyCertNoBackImageUrl;
	}
	public String getProxyCertNoBackImageUrl() {
		return this.proxyCertNoBackImageUrl;
	}

	public void setProxyCertNoFrontImageUrl(String proxyCertNoFrontImageUrl) {
		this.proxyCertNoFrontImageUrl = proxyCertNoFrontImageUrl;
	}
	public String getProxyCertNoFrontImageUrl() {
		return this.proxyCertNoFrontImageUrl;
	}

	public void setProxyCertValidEndDate(String proxyCertValidEndDate) {
		this.proxyCertValidEndDate = proxyCertValidEndDate;
	}
	public String getProxyCertValidEndDate() {
		return this.proxyCertValidEndDate;
	}

	public void setProxyCertValidStartDate(String proxyCertValidStartDate) {
		this.proxyCertValidStartDate = proxyCertValidStartDate;
	}
	public String getProxyCertValidStartDate() {
		return this.proxyCertValidStartDate;
	}

	public void setProxyMandateUrl(String proxyMandateUrl) {
		this.proxyMandateUrl = proxyMandateUrl;
	}
	public String getProxyMandateUrl() {
		return this.proxyMandateUrl;
	}

	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}
	public String getProxyName() {
		return this.proxyName;
	}

	public void setQualificationImageUrl(String qualificationImageUrl) {
		this.qualificationImageUrl = qualificationImageUrl;
	}
	public String getQualificationImageUrl() {
		return this.qualificationImageUrl;
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

	public void setStartBusinessDate(String startBusinessDate) {
		this.startBusinessDate = startBusinessDate;
	}
	public String getStartBusinessDate() {
		return this.startBusinessDate;
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
		return "zhima.merchant.enterprise.apply";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("alias_name", this.aliasName);
		txtParams.put("alipay_window_name", this.alipayWindowName);
		txtParams.put("app_name", this.appName);
		txtParams.put("apply_memo", this.applyMemo);
		txtParams.put("biz_scene", this.bizScene);
		txtParams.put("company_address", this.companyAddress);
		txtParams.put("company_name", this.companyName);
		txtParams.put("data_feedback_contract_email", this.dataFeedbackContractEmail);
		txtParams.put("data_feedback_contract_mobile", this.dataFeedbackContractMobile);
		txtParams.put("data_feedback_contract_name", this.dataFeedbackContractName);
		txtParams.put("end_business_date", this.endBusinessDate);
		txtParams.put("legal_cert_no", this.legalCertNo);
		txtParams.put("legal_cert_no_back_image_url", this.legalCertNoBackImageUrl);
		txtParams.put("legal_cert_no_front_image_url", this.legalCertNoFrontImageUrl);
		txtParams.put("legal_cert_valid_end_date", this.legalCertValidEndDate);
		txtParams.put("legal_cert_valid_start_date", this.legalCertValidStartDate);
		txtParams.put("legal_name", this.legalName);
		txtParams.put("license_image_url", this.licenseImageUrl);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("license_type", this.licenseType);
		txtParams.put("logo_image", this.logoImage);
		txtParams.put("logo_image_type", this.logoImageType);
		txtParams.put("major_contract_email", this.majorContractEmail);
		txtParams.put("major_contract_mobile", this.majorContractMobile);
		txtParams.put("major_contract_name", this.majorContractName);
		txtParams.put("objection_contract_email", this.objectionContractEmail);
		txtParams.put("objection_contract_mobile", this.objectionContractMobile);
		txtParams.put("objection_contract_name", this.objectionContractName);
		txtParams.put("one_level_mcc", this.oneLevelMcc);
		txtParams.put("organization_image_url", this.organizationImageUrl);
		txtParams.put("organization_no", this.organizationNo);
		txtParams.put("out_order_no", this.outOrderNo);
		txtParams.put("proxy_cert_no", this.proxyCertNo);
		txtParams.put("proxy_cert_no_back_image_url", this.proxyCertNoBackImageUrl);
		txtParams.put("proxy_cert_no_front_image_url", this.proxyCertNoFrontImageUrl);
		txtParams.put("proxy_cert_valid_end_date", this.proxyCertValidEndDate);
		txtParams.put("proxy_cert_valid_start_date", this.proxyCertValidStartDate);
		txtParams.put("proxy_mandate_url", this.proxyMandateUrl);
		txtParams.put("proxy_name", this.proxyName);
		txtParams.put("qualification_image_url", this.qualificationImageUrl);
		txtParams.put("service_contract_email", this.serviceContractEmail);
		txtParams.put("service_contract_mobile", this.serviceContractMobile);
		txtParams.put("service_contract_name", this.serviceContractName);
		txtParams.put("start_business_date", this.startBusinessDate);
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

	public Class<ZhimaMerchantEnterpriseApplyResponse> getResponseClass() {
		return ZhimaMerchantEnterpriseApplyResponse.class;
	}
}
