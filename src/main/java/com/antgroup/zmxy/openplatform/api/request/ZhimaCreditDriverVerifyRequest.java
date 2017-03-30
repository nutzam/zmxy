package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditDriverVerifyResponse;

/**
 * ALIPAY API: zhima.credit.driver.verify request
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:41
 */
public class ZhimaCreditDriverVerifyRequest implements ZhimaRequest<ZhimaCreditDriverVerifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 驾驶证档案编号
	 */
	private String archiveNo;

	/** 
	* 初次领证日期，格式为yyyyMMdd
	 */
	private String issueDate;

	/** 
	* 驾驶证号码
	 */
	private String licenseNo;

	/** 
	* 驾驶证上的姓名
	 */
	private String name;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 芝麻业务凭证，详见https://b.zmxy.com.cn/technology/openDoc.htm?id=334
	 */
	private String transactionId;

	/** 
	* 准驾车型，多个车型之间以 || 隔开，如C1 || C2 || B2
	 */
	private String vehicleClass;

	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}
	public String getArchiveNo() {
		return this.archiveNo;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueDate() {
		return this.issueDate;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
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

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public String getVehicleClass() {
		return this.vehicleClass;
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
		return "zhima.credit.driver.verify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("archive_no", this.archiveNo);
		txtParams.put("issue_date", this.issueDate);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("name", this.name);
		txtParams.put("product_code", this.productCode);
		txtParams.put("transaction_id", this.transactionId);
		txtParams.put("vehicle_class", this.vehicleClass);
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

	public Class<ZhimaCreditDriverVerifyResponse> getResponseClass() {
		return ZhimaCreditDriverVerifyResponse.class;
	}
}
