package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaAuthZhimaCustCertifyInitialResponse;

/**
 * ALIPAY API: zhima.auth.zhima.cust.certify.initial request
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaAuthZhimaCustCertifyInitialRequest implements ZhimaRequest<ZhimaAuthZhimaCustCertifyInitialResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务扩展属性：
来源类型source_type必传，比如：
1.web场景中，传入{“source_type”:"pc"}
2.移动端场景中，传入{“source_type”:"h5"}
	 */
	private String bizParams;

	/** 
	* 与芝麻信用签订的合约外标，即使合约改签或续签该值不会发生变化
	 */
	private String contractFlag;

	/** 
	* 不同身份类型的参数列表，json字符串的key-value格式：
如：
identity_type= "CERT_AND_MOBILE";
identity_param={"certNo":"xxx", "name":"张三", "certType":"IDENTITY_CARD"};
	 */
	private String identityParam;

	/** 
	* 身份标识类型（后续可以扩展）：
BY_CERTNO_AND_NAME:按照身份证+姓名（+手机号）进行授权
	 */
	private String identityType;

	/** 
	* 当前使用的产品码
	 */
	private String productCode;

	/** 
	* 芝麻认证过程中的冗余字段，在认证申请时传入，在结果页面回调中原样透传给商户端。
【建议使用方式】用于商户端唯一标记发起认证的用户信息，在接收到芝麻信用认证结果回调后确定用户
	 */
	private String state;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间
	 */
	private String transactionId;

	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}
	public String getBizParams() {
		return this.bizParams;
	}

	public void setContractFlag(String contractFlag) {
		this.contractFlag = contractFlag;
	}
	public String getContractFlag() {
		return this.contractFlag;
	}

	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}
	public String getIdentityParam() {
		return this.identityParam;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getIdentityType() {
		return this.identityType;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return this.state;
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
		return "zhima.auth.zhima.cust.certify.initial";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_params", this.bizParams);
		txtParams.put("contract_flag", this.contractFlag);
		txtParams.put("identity_param", this.identityParam);
		txtParams.put("identity_type", this.identityType);
		txtParams.put("product_code", this.productCode);
		txtParams.put("state", this.state);
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

	public Class<ZhimaAuthZhimaCustCertifyInitialResponse> getResponseClass() {
		return ZhimaAuthZhimaCustCertifyInitialResponse.class;
	}
}
