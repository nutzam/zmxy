package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditIvsDetailGetResponse;

/**
 * ALIPAY API: zhima.credit.ivs.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2016-07-29 18:46:29
 */
public class ZhimaCreditIvsDetailGetRequest implements ZhimaRequest<ZhimaCreditIvsDetailGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户地址，最多输入三个，多个地址之间用|分隔，如 杭州市西湖区天目山路266号|杭州市西湖区万塘路999号。

备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	private String address;

	/** 
	* 银行卡号，最多输入两个，多个银行卡号之间用|分隔，如602436748024138|622536748024139。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	private String bankCard;

	/** 
	* 证件号。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱必须传其中两项
	 */
	private String certNo;

	/** 
	* 证件类型。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	private String certType;

	/** 
	* 电子邮箱，最多传入两个，多个邮箱之间用|分隔，如jnlxhy@alitest.com|john.sss@alitest.com。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱必至少传其中两项
	 */
	private String email;

	/** 
	* 国际移动设备标志
	 */
	private String imei;

	/** 
	* 国际移动用户识别码
	 */
	private String imsi;

	/** 
	* ip地址
	 */
	private String ip;

	/** 
	* 物理地址
	 */
	private String mac;

	/** 
	* 手机号，最多传入三个，多个手机号之间用|分隔，如15256797367|18669152789。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	private String mobile;

	/** 
	* 姓名。
备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	private String name;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* transaction_id是代表一笔请求的唯一标志，该标识作为对账的关键信息，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常（错误码xxxx），有效期内的重复查询不重新计费。 transaction_id 推荐生成方式是：30位，（其中17位时间值（精确到毫秒）：yyyyMMddHHmmssSSS）加上（13位自增数字：1234567890123）
	 */
	private String transactionId;

	/** 
	* wifi的物理地址
	 */
	private String wifimac;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getBankCard() {
		return this.bankCard;
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

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getImei() {
		return this.imei;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getImsi() {
		return this.imsi;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return this.ip;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getMac() {
		return this.mac;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
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

	public void setWifimac(String wifimac) {
		this.wifimac = wifimac;
	}
	public String getWifimac() {
		return this.wifimac;
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
		return "zhima.credit.ivs.detail.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("address", this.address);
		txtParams.put("bank_card", this.bankCard);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("email", this.email);
		txtParams.put("imei", this.imei);
		txtParams.put("imsi", this.imsi);
		txtParams.put("ip", this.ip);
		txtParams.put("mac", this.mac);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("product_code", this.productCode);
		txtParams.put("transaction_id", this.transactionId);
		txtParams.put("wifimac", this.wifimac);
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

	public Class<ZhimaCreditIvsDetailGetResponse> getResponseClass() {
		return ZhimaCreditIvsDetailGetResponse.class;
	}
}
