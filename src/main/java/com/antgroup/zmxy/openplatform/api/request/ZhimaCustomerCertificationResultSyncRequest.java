package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCustomerCertificationResultSyncResponse;

/**
 * ALIPAY API: zhima.customer.certification.result.sync request
 * 
 * @author auto create
 * @since 1.0, 2016-12-30 14:31:52
 */
public class ZhimaCustomerCertificationResultSyncRequest implements ZhimaRequest<ZhimaCustomerCertificationResultSyncResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	private String bizNo;

	/** 
	* 各渠道认证状态,失败原因,材料等信息
	 */
	private String channelStatuses;

	/** 
	* 认证失败的错误码
	 */
	private String errorCode;

	/** 
	* 认证失败的错误信息
	 */
	private String errorMessage;

	/** 
	* 扩展业务参数
	 */
	private String extBizParam;

	/** 
	* 识别后的主体信息,入参有传就和入参的certify_identity一致
	 */
	private String identifiedPrincipal;

	/** 
	* 商户id,商户在芝麻的唯一标识
	 */
	private String merchantId;

	/** 
	* 认证是否通过
	 */
	private String passed;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setChannelStatuses(String channelStatuses) {
		this.channelStatuses = channelStatuses;
	}
	public String getChannelStatuses() {
		return this.channelStatuses;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setExtBizParam(String extBizParam) {
		this.extBizParam = extBizParam;
	}
	public String getExtBizParam() {
		return this.extBizParam;
	}

	public void setIdentifiedPrincipal(String identifiedPrincipal) {
		this.identifiedPrincipal = identifiedPrincipal;
	}
	public String getIdentifiedPrincipal() {
		return this.identifiedPrincipal;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId() {
		return this.merchantId;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed() {
		return this.passed;
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
		return "zhima.customer.certification.result.sync";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("channel_statuses", this.channelStatuses);
		txtParams.put("error_code", this.errorCode);
		txtParams.put("error_message", this.errorMessage);
		txtParams.put("ext_biz_param", this.extBizParam);
		txtParams.put("identified_principal", this.identifiedPrincipal);
		txtParams.put("merchant_id", this.merchantId);
		txtParams.put("passed", this.passed);
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

	public Class<ZhimaCustomerCertificationResultSyncResponse> getResponseClass() {
		return ZhimaCustomerCertificationResultSyncResponse.class;
	}
}
