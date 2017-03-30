package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthEngineMultiauthResponse;

/**
 * ALIPAY API: zhima.auth.engine.multiauth request
 * 
 * @author auto create
 * @since 1.0, 2016-06-24 14:37:49
 */
public class ZhimaAuthEngineMultiauthRequest implements ZhimaRequest<ZhimaAuthEngineMultiauthResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 外部商户应用id
	 */
	private String authAppId;

	/** 
	* 外部商户id
	 */
	private String authMerchantId;

	/** 
	* 支付宝用户id
	 */
	private String userId;

	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	public String getAuthAppId() {
		return this.authAppId;
	}

	public void setAuthMerchantId(String authMerchantId) {
		this.authMerchantId = authMerchantId;
	}
	public String getAuthMerchantId() {
		return this.authMerchantId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "zhima.auth.engine.multiauth";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("auth_app_id", this.authAppId);
		txtParams.put("auth_merchant_id", this.authMerchantId);
		txtParams.put("user_id", this.userId);
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

	public Class<ZhimaAuthEngineMultiauthResponse> getResponseClass() {
		return ZhimaAuthEngineMultiauthResponse.class;
	}
}
