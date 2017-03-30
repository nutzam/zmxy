package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditCardVerifyResponse;

/**
 * ALIPAY API: zhima.credit.card.verify request
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 10:48:13
 */
public class ZhimaCreditCardVerifyRequest implements ZhimaRequest<ZhimaCreditCardVerifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户地址.
1. 如传入，则进行有效性校验，输出地址有效性等级；
2. 如不传，则不进行地址有效性校验，输出地址有效性等级为未知；
	 */
	private String address;

	/** 
	* 机构ID
	 */
	private String instId;

	/** 
	* 芝麻用户的身份标志，openid
	 */
	private String openId;

	/** 
	* 订单号
	 */
	private String orderId;

	/** 
	* 云产品ID
	 */
	private String productCode;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddhhmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	/** 
	* 支付宝用户ID
	 */
	private String userId;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId() {
		return this.instId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId() {
		return this.orderId;
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

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "zhima.credit.card.verify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("address", this.address);
		txtParams.put("inst_id", this.instId);
		txtParams.put("open_id", this.openId);
		txtParams.put("order_id", this.orderId);
		txtParams.put("product_code", this.productCode);
		txtParams.put("transaction_id", this.transactionId);
		txtParams.put("user_id", this.userId);
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

	public Class<ZhimaCreditCardVerifyResponse> getResponseClass() {
		return ZhimaCreditCardVerifyResponse.class;
	}
}
