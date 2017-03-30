package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudRiskListResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.risk.list request
 * 
 * @author auto create
 * @since 1.0, 2017-03-17 20:46:34
 */
public class ZhimaCreditAntifraudRiskListRequest implements ZhimaRequest<ZhimaCreditAntifraudRiskListResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 地址信息。省+市+区/县+详细地址，其中 省+市+区/县可以为空，长度不超过256，不要包含特殊字符，如","，"\"，"|"，"&"，"^"
	 */
	private String address;

	/** 
	* 银行卡号。中国大陆银行发布的银行卡:借记卡长度19位；信用卡长度16位；各位的取值位[0,9]的整数；不含虚拟卡
	 */
	private String bankCard;

	/** 
	* 证件号。证件类型、证件号、姓名三要素均为必填参数
	 */
	private String certNo;

	/** 
	* 证件类型。IDENTITY_CARD标识为身份证，目前仅支持身份证类型
	 */
	private String certType;

	/** 
	* 电子邮箱。合法email，字母小写，特殊符号以半角形式出现
	 */
	private String email;

	/** 
	* 国际移动设备标志。15位长度数字
	 */
	private String imei;

	/** 
	* ip地址。以"."分割的四段Ip，如 x.x.x.x，x为[0,255]之间的整数
	 */
	private String ip;

	/** 
	* 物理地址。支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
	 */
	private String mac;

	/** 
	* 手机号码。中国大陆合法手机号，长度11位，不含国家代码
	 */
	private String mobile;

	/** 
	* 姓名。长度不超过64，姓名中不要包含特殊字符，如","，"\"，"|"，"&"，"^"
	 */
	private String name;

	/** 
	* 产品码。标记商户接入的具体产品；直接使用每个接口入参中示例值即可
	 */
	private String productCode;

	/** 
	* 商户请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，商户要保证其业务唯一性，使用相同transaction_id的查询，芝麻在一段时间内（一般为1天）返回首次查询结果，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	private String transactionId;

	/** 
	* wifi的物理地址。支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
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
		return "zhima.credit.antifraud.risk.list";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("address", this.address);
		txtParams.put("bank_card", this.bankCard);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("email", this.email);
		txtParams.put("imei", this.imei);
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

	public Class<ZhimaCreditAntifraudRiskListResponse> getResponseClass() {
		return ZhimaCreditAntifraudRiskListResponse.class;
	}
}
