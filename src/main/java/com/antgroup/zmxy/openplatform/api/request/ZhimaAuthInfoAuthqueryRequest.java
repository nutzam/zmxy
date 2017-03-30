package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthInfoAuthqueryResponse;

/**
 * ALIPAY API: zhima.auth.info.authquery request
 * 
 * @author auto create
 * @since 1.0, 2017-03-10 15:30:07
 */
public class ZhimaAuthInfoAuthqueryRequest implements ZhimaRequest<ZhimaAuthInfoAuthqueryResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 授权类型，用于识别当前查询是否授权的分流
	 */
	private String authCategory;

	/** 
	* 不同身份类型传入的参数列表,json字符串的key-value格式
身份类型identityType=0:
{"openId":"268801234567890123456"}
身份类型identityType=2:
{"certNo":"330100xxxxxxxxxxxx","name":"张三","certType":"IDENTITY_CARD"}
	 */
	private String identityParam;

	/** 
	* 身份标识类型
0:按照openId查询
2:按照身份证+姓名查询
	 */
	private String identityType;

	public void setAuthCategory(String authCategory) {
		this.authCategory = authCategory;
	}
	public String getAuthCategory() {
		return this.authCategory;
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
		return "zhima.auth.info.authquery";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("auth_category", this.authCategory);
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

	public Class<ZhimaAuthInfoAuthqueryResponse> getResponseClass() {
		return ZhimaAuthInfoAuthqueryResponse.class;
	}
}
