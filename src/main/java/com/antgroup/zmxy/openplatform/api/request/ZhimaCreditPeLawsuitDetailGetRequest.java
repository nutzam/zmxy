package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditPeLawsuitDetailGetResponse;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2017-01-18 17:45:07
 */
public class ZhimaCreditPeLawsuitDetailGetRequest implements ZhimaRequest<ZhimaCreditPeLawsuitDetailGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 涉诉类型明细ID，对应字段值：裁判文书（partyId)，执行公告(zxggId)，失信记录(shixinId)，网贷黑名单(wdhmdId)，曝光台(bgtId)
	 */
	private String lawsuitId;

	/** 
	* 涉诉类型包括：裁判文书（party)，执行公告(zxgg)，失信记录(sxgg)，网贷黑名单(wdhmd)，曝光台(bgt)
	 */
	private String lawsuitType;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddhhmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	public void setLawsuitId(String lawsuitId) {
		this.lawsuitId = lawsuitId;
	}
	public String getLawsuitId() {
		return this.lawsuitId;
	}

	public void setLawsuitType(String lawsuitType) {
		this.lawsuitType = lawsuitType;
	}
	public String getLawsuitType() {
		return this.lawsuitType;
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
		return "zhima.credit.pe.lawsuit.detail.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("lawsuit_id", this.lawsuitId);
		txtParams.put("lawsuit_type", this.lawsuitType);
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

	public Class<ZhimaCreditPeLawsuitDetailGetResponse> getResponseClass() {
		return ZhimaCreditPeLawsuitDetailGetResponse.class;
	}
}
