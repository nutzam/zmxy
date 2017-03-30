package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthFaceInitResponse;

/**
 * ALIPAY API: zhima.auth.face.init request
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 13:11:48
 */
public class ZhimaAuthFaceInitRequest implements ZhimaRequest<ZhimaAuthFaceInitResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 应用的标识
	 */
	private String apiKey;

	/** 
	* 参数的加密串
	 */
	private String authMsg;

	/** 
	* 用于标识使用人脸业务的类型是授权或者认证，默认为授权类型
	 */
	private String bizType;

	/** 
	* 不同商户的bundle_id,用来做缓存
	 */
	private String bundleId;

	/** 
	* 请求的sessionId
	 */
	private String token;

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getApiKey() {
		return this.apiKey;
	}

	public void setAuthMsg(String authMsg) {
		this.authMsg = authMsg;
	}
	public String getAuthMsg() {
		return this.authMsg;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId() {
		return this.bundleId;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return this.token;
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
		return "zhima.auth.face.init";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("api_key", this.apiKey);
		txtParams.put("auth_msg", this.authMsg);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("bundle_id", this.bundleId);
		txtParams.put("token", this.token);
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

	public Class<ZhimaAuthFaceInitResponse> getResponseClass() {
		return ZhimaAuthFaceInitResponse.class;
	}
}
