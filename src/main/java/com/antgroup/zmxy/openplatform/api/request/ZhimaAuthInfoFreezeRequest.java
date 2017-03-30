package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthInfoFreezeResponse;

/**
 * ALIPAY API: zhima.auth.info.freeze request
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaAuthInfoFreezeRequest implements ZhimaRequest<ZhimaAuthInfoFreezeResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户在商户处申请业务的唯一识别码;\n每个申请仅对应一条冻结记录，若存在相同流水号的冻结周期将覆盖
	 */
	private String bizNo;

	/** 
	* 扩展字段，json字符串的key-value格式
	 */
	private String bizParams;

	/** 
	* 申请原因
001: 贷款申请中, 002:信用卡申请中, 003:租车申请中, 004:信贷服务期内, 005:信贷逾期中
	 */
	private String bizType;

	/** 
	* 冻结结束时间，若该时间减去冻结开始时间的差值大于冻结周期，则该时间将赋值冻结开始时间+冻结周期
	 */
	private String endDate;

	/** 
	* 用户在商端的身份标识
	 */
	private String openId;

	/** 
	* 冻结开始时间，若该时间早于系统当前时间，则会取当前时间作为冻结开始时间
	 */
	private String startDate;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}
	public String getBizParams() {
		return this.bizParams;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
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
		return "zhima.auth.info.freeze";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("biz_params", this.bizParams);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("end_date", this.endDate);
		txtParams.put("open_id", this.openId);
		txtParams.put("start_date", this.startDate);
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

	public Class<ZhimaAuthInfoFreezeResponse> getResponseClass() {
		return ZhimaAuthInfoFreezeResponse.class;
	}
}
