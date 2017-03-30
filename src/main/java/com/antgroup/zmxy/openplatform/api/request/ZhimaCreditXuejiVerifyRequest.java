package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditXuejiVerifyResponse;

/**
 * ALIPAY API: zhima.credit.xueji.verify request
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:11
 */
public class ZhimaCreditXuejiVerifyRequest implements ZhimaRequest<ZhimaCreditXuejiVerifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 院校名称
	 */
	private String collegeName;

	/** 
	* 输入为数字：
1：表示普通全日制；
2：表示硕士或者博士研究生；
5：表示成人教育；
6：表示高等教育自学考试；
7：表示网络教育；
8：表示开放教育；
9：表示不详
	 */
	private String educationCategory;

	/** 
	* 学历层次：博士、硕士、本科、专科、成人。
	 */
	private String educationDegree;

	/** 
	* 入学年份，格式为四位数的年份，如2013
	 */
	private String enrollmentYear;

	/** 
	* 毕业年份，格式为四位数的年份，如2018
	 */
	private String graduateYear;

	/** 
	* 芝麻会员在商户端的身份标识
	 */
	private String openId;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddHHmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return this.collegeName;
	}

	public void setEducationCategory(String educationCategory) {
		this.educationCategory = educationCategory;
	}
	public String getEducationCategory() {
		return this.educationCategory;
	}

	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}
	public String getEducationDegree() {
		return this.educationDegree;
	}

	public void setEnrollmentYear(String enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}
	public String getEnrollmentYear() {
		return this.enrollmentYear;
	}

	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}
	public String getGraduateYear() {
		return this.graduateYear;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
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
		return "zhima.credit.xueji.verify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("college_name", this.collegeName);
		txtParams.put("education_category", this.educationCategory);
		txtParams.put("education_degree", this.educationDegree);
		txtParams.put("enrollment_year", this.enrollmentYear);
		txtParams.put("graduate_year", this.graduateYear);
		txtParams.put("open_id", this.openId);
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

	public Class<ZhimaCreditXuejiVerifyResponse> getResponseClass() {
		return ZhimaCreditXuejiVerifyResponse.class;
	}
}
