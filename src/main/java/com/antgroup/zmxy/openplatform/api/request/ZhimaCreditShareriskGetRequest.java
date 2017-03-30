package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditShareriskGetResponse;

/**
 * ALIPAY API: zhima.credit.sharerisk.get request
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaCreditShareriskGetRequest implements ZhimaRequest<ZhimaCreditShareriskGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务申请单号
	 */
	private String bizApplyNo;

	/** 
	* 授权合同编号
	 */
	private String bizAuthNo;

	/** 
	* 业务场景[01： 申贷审批； 02： 贷后管理]
	 */
	private String bizScene;

	/** 
	* 证件号码
	 */
	private String certNo;

	/** 
	* 证件类型[100：身份证]
	 */
	private String certType;

	/** 
	* 姓名
	 */
	private String name;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddhhmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	public void setBizApplyNo(String bizApplyNo) {
		this.bizApplyNo = bizApplyNo;
	}
	public String getBizApplyNo() {
		return this.bizApplyNo;
	}

	public void setBizAuthNo(String bizAuthNo) {
		this.bizAuthNo = bizAuthNo;
	}
	public String getBizAuthNo() {
		return this.bizAuthNo;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene() {
		return this.bizScene;
	}

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
		return "zhima.credit.sharerisk.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_apply_no", this.bizApplyNo);
		txtParams.put("biz_auth_no", this.bizAuthNo);
		txtParams.put("biz_scene", this.bizScene);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
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

	public Class<ZhimaCreditShareriskGetResponse> getResponseClass() {
		return ZhimaCreditShareriskGetResponse.class;
	}
}
