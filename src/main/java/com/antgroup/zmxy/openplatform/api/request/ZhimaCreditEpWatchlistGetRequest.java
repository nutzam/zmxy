package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditEpWatchlistGetResponse;

/**
 * ALIPAY API: zhima.credit.ep.watchlist.get request
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 11:21:33
 */
public class ZhimaCreditEpWatchlistGetRequest implements ZhimaRequest<ZhimaCreditEpWatchlistGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 企业关注名单的输入类型：
工商注册号（REG_NO）、组织机构代码（ORG_NO）、社会统一代码(SOCIETY_NO)、税务登记号(TAX_NO)、
企业名称（COMPANY_NAME）
	 */
	private String dataType;

	/** 
	* 企业关注名单，对应类型的数据值
	 */
	private String dataValue;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* transaction_id是代表一笔请求的唯一标志，该标识作为对账的关键信息，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常（错误码xxxx），有效期内的重复查询不重新计费。 transaction_id 推荐生成方式是：30位，（其中17位时间值（精确到毫秒）：yyyyMMddHHmmssSSS）加上（13位自增数字：1234567890123）
	 */
	private String transactionId;

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataType() {
		return this.dataType;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getDataValue() {
		return this.dataValue;
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
		return "zhima.credit.ep.watchlist.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("data_type", this.dataType);
		txtParams.put("data_value", this.dataValue);
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

	public Class<ZhimaCreditEpWatchlistGetResponse> getResponseClass() {
		return ZhimaCreditEpWatchlistGetResponse.class;
	}
}
