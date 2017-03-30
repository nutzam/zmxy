package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaProfileStatusFeedbackResponse;

/**
 * ALIPAY API: zhima.profile.status.feedback request
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:36:04
 */
public class ZhimaProfileStatusFeedbackRequest implements ZhimaRequest<ZhimaProfileStatusFeedbackResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务号
	 */
	private String bizNo;

	/** 
	* 业务类型
	 */
	private String bizType;

	/** 
	* 当前为BANK或者ACCUFUND
	 */
	private String dataSource;

	/** 
	* 数据抓取code
	 */
	private String itemCode;

	/** 
	* 更新备注
	 */
	private String memo;

	/** 
	* 数据采集机构
	 */
	private String orgCode;

	/** 
	* 数据状态
	 */
	private String status;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getDataSource() {
		return this.dataSource;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return this.itemCode;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
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
		return "zhima.profile.status.feedback";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("data_source", this.dataSource);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("memo", this.memo);
		txtParams.put("org_code", this.orgCode);
		txtParams.put("status", this.status);
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

	public Class<ZhimaProfileStatusFeedbackResponse> getResponseClass() {
		return ZhimaProfileStatusFeedbackResponse.class;
	}
}
