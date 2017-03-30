package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditEpLawsuitRecordGetResponse;

/**
 * ALIPAY API: zhima.credit.ep.lawsuit.record.get request
 * 
 * @author auto create
 * @since 1.0, 2016-05-05 16:40:41
 */
public class ZhimaCreditEpLawsuitRecordGetRequest implements ZhimaRequest<ZhimaCreditEpLawsuitRecordGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 企业名称和组织机构号，2个参数必须要输入一个
	 */
	private String companyName;

	/** 
	* 涉诉类型。cpws-裁判文书; zxgg-执行公告; sxgg-失信公告; ktgg-开庭公告; fygg-法院公告; ajlc-案件流程信息; bgt-曝光台。
	 */
	private String lawsuitType;

	/** 
	* 企业组织机构代码和企业名称2个参数，最少有一个
	 */
	private String orgNo;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddhhmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return this.companyName;
	}

	public void setLawsuitType(String lawsuitType) {
		this.lawsuitType = lawsuitType;
	}
	public String getLawsuitType() {
		return this.lawsuitType;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getOrgNo() {
		return this.orgNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId() {
		return this.transactionId;
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
		return "zhima.credit.ep.lawsuit.record.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("company_name", this.companyName);
		txtParams.put("lawsuit_type", this.lawsuitType);
		txtParams.put("org_no", this.orgNo);
		txtParams.put("product_code", this.productCode);
		txtParams.put("transaction_id", this.transactionId);
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

	public Class<ZhimaCreditEpLawsuitRecordGetResponse> getResponseClass() {
		return ZhimaCreditEpLawsuitRecordGetResponse.class;
	}
}
