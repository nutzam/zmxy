package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthEngineSmsauthResponse;

/**
 * ALIPAY API: zhima.auth.engine.smsauth request
 * 
 * @author auto create
 * @since 1.0, 2016-09-21 09:54:19
 */
public class ZhimaAuthEngineSmsauthRequest implements ZhimaRequest<ZhimaAuthEngineSmsauthResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务扩展字段,页面授权接口需要传入auth_code,channelType,state
auth_code授权码,短信唤起支付宝客户端接口的值为M_SMS
channelType渠道类型,每个授权码支持不同的渠道类型
appsdk:sdk接入
apppc:商户pc页面接入
api:后台api接入
windows:支付宝服务窗接入
app:商户app接入
state是商户自定义的数据,页面授权接口会原样把这个数据返回个商户
	 */
	private String bizParams;

	/** 
	* 身份参数,短信唤起支付宝客户端授权需要传入姓名+证件类型+证件号码+手机号
	 */
	private String identityParam;

	/** 
	* 身份类型,短信唤起支付宝客户端接口的身份识别类型为2:按照姓名+证件类型+证件号码+手机号进行授权
	 */
	private String identityType;

	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}
	public String getBizParams() {
		return this.bizParams;
	}

	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}
	public String getIdentityParam() {
		return this.identityParam;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getIdentityType() {
		return this.identityType;
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
		return "zhima.auth.engine.smsauth";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_params", this.bizParams);
		txtParams.put("identity_param", this.identityParam);
		txtParams.put("identity_type", this.identityType);
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

	public Class<ZhimaAuthEngineSmsauthResponse> getResponseClass() {
		return ZhimaAuthEngineSmsauthResponse.class;
	}
}
