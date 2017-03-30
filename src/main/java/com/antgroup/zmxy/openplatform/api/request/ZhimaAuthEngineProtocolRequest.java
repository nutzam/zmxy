package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthEngineProtocolResponse;

/**
 * ALIPAY API: zhima.auth.engine.protocol request
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 13:11:12
 */
public class ZhimaAuthEngineProtocolRequest implements ZhimaRequest<ZhimaAuthEngineProtocolResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务扩展入参
	 */
	private String bizParams;

	/** 
	* 授权的身份标识参数
	 */
	private String identityParam;

	/** 
	* 用户的身份标识类型\n3：身份证+姓名+手机号进行支付宝识别，核身，授权\n4：身份证+姓名+手机号（可选）进行公安网的核身，授权
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
		return "zhima.auth.engine.protocol";
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

	public Class<ZhimaAuthEngineProtocolResponse> getResponseClass() {
		return ZhimaAuthEngineProtocolResponse.class;
	}
}
