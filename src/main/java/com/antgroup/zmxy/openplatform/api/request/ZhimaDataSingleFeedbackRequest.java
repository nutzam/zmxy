package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaDataSingleFeedbackResponse;

/**
 * ALIPAY API: zhima.data.single.feedback request
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaDataSingleFeedbackRequest implements ZhimaRequest<ZhimaDataSingleFeedbackResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 扩展参数
	 */
	private String bizExtParams;

	/** 
	* 反馈的json格式的数据内容
	 */
	private String data;

	/** 
	* 主键使用反馈字段进行组合，也可以使用反馈的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no#pay_month或者order_no#bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键
	 */
	private String identity;

	/** 
	* 芝麻系统中配置的值，由芝麻信用提供，需要匹配，测试反馈和正式反馈使用不同的TYPE_ID
	 */
	private String typeId;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams() {
		return this.bizExtParams;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getIdentity() {
		return this.identity;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeId() {
		return this.typeId;
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
		return "zhima.data.single.feedback";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_ext_params", this.bizExtParams);
		txtParams.put("data", this.data);
		txtParams.put("identity", this.identity);
		txtParams.put("type_id", this.typeId);
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

	public Class<ZhimaDataSingleFeedbackResponse> getResponseClass() {
		return ZhimaDataSingleFeedbackResponse.class;
	}
}
