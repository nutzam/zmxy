package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditXueliVerifyResponse;

/**
 * ALIPAY API: zhima.credit.xueli.verify request
 * 
 * @author auto create
 * @since 1.0, 2016-07-08 10:08:01
 */
public class ZhimaCreditXueliVerifyRequest implements ZhimaRequest<ZhimaCreditXueliVerifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 证件号码，暂时只支持身份证号
	 */
	private String certNo;

	/** 
	* 证件类型，暂时支持身份证
	 */
	private String certType;

	/** 
	* 院校名称
	 */
	private String collegeName;

	/** 
	* 学历类别：普通，研究生，成人，高等教育自学考试，网络教育，开放教育，不详
	 */
	private String educationCategory;

	/** 
	* 学历层次：
博士研究生，硕士研究生，研究生班，
第二学士学位，本科，高升本，专升本，第二本科
专科，专科(高职)，第二专科，夜大电大函大普通班，大学
	 */
	private String educationDegree;

	/** 
	* 毕业年份，格式为四位数的年份，如2018
	 */
	private String graduateYear;

	/** 
	* 姓名
	 */
	private String name;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddHHmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

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

	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}
	public String getGraduateYear() {
		return this.graduateYear;
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
		return "zhima.credit.xueli.verify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("college_name", this.collegeName);
		txtParams.put("education_category", this.educationCategory);
		txtParams.put("education_degree", this.educationDegree);
		txtParams.put("graduate_year", this.graduateYear);
		txtParams.put("name", this.name);
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

	public Class<ZhimaCreditXueliVerifyResponse> getResponseClass() {
		return ZhimaCreditXueliVerifyResponse.class;
	}
}
