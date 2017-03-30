package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCustomerPerformanceFeedbackResponse;

/**
 * ALIPAY API: zhima.customer.performance.feedback request
 * 
 * @author auto create
 * @since 1.0, 2016-12-22 17:42:59
 */
public class ZhimaCustomerPerformanceFeedbackRequest implements ZhimaRequest<ZhimaCustomerPerformanceFeedbackResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户证件号码
	 */
	private String certNo;

	/** 
	* 证件类型
	 */
	private String certType;

	/** 
	* 用户姓名
	 */
	private String name;

	/** 
	* 商户反馈的某用户还款计划数据，格式：[{"repayment_id": "1234","repayment_desc": "商品名称","installments": [{"installment_id": "1234","installment_amount": "1000","installment_date": "2016-09-11 12:00:00","installment_desc": "已逾期7天","installment_status": "WAITING_REPAY","currency": "CNY"}]}]
	 */
	private String repayments;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType() {
		return this.certType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setRepayments(String repayments) {
		this.repayments = repayments;
	}
	public String getRepayments() {
		return this.repayments;
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
		return "zhima.customer.performance.feedback";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("name", this.name);
		txtParams.put("repayments", this.repayments);
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

	public Class<ZhimaCustomerPerformanceFeedbackResponse> getResponseClass() {
		return ZhimaCustomerPerformanceFeedbackResponse.class;
	}
}
