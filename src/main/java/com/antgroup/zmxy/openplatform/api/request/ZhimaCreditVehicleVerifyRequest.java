package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditVehicleVerifyResponse;

/**
 * ALIPAY API: zhima.credit.vehicle.verify request
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:27
 */
public class ZhimaCreditVehicleVerifyRequest implements ZhimaRequest<ZhimaCreditVehicleVerifyResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 发动机号码。vin与engine_no至少包含一项
	 */
	private String engineNo;

	/** 
	* 所有人，支持个人和机构
	 */
	private String owner;

	/** 
	* 车牌号
	 */
	private String plateNo;

	/** 
	* 产品码
	 */
	private String productCode;

	/** 
	* 注册日期，格式yyyyMMdd
	 */
	private String registerDate;

	/** 
	* 商户传入的业务流水号。此字段由商户生成，需确保唯一性，用于定位每一次请求，后续按此流水进行对帐。生成规则: 固定30位数字串，前17位为精确到毫秒的时间yyyyMMddHHmmssSSS，后13位为自增数字。
	 */
	private String transactionId;

	/** 
	* 车辆品牌（行驶证中中文部分）
	 */
	private String vehicleBrand;

	/** 
	* 车辆型号（行驶证中英文部分）
	 */
	private String vehicleSeries;

	/** 
	* 车辆识别代号。vin与engine_no至少包含一项
	 */
	private String vin;

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineNo() {
		return this.engineNo;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return this.owner;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo() {
		return this.plateNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleBrand() {
		return this.vehicleBrand;
	}

	public void setVehicleSeries(String vehicleSeries) {
		this.vehicleSeries = vehicleSeries;
	}
	public String getVehicleSeries() {
		return this.vehicleSeries;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin() {
		return this.vin;
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
		return "zhima.credit.vehicle.verify";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("engine_no", this.engineNo);
		txtParams.put("owner", this.owner);
		txtParams.put("plate_no", this.plateNo);
		txtParams.put("product_code", this.productCode);
		txtParams.put("register_date", this.registerDate);
		txtParams.put("transaction_id", this.transactionId);
		txtParams.put("vehicle_brand", this.vehicleBrand);
		txtParams.put("vehicle_series", this.vehicleSeries);
		txtParams.put("vin", this.vin);
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

	public Class<ZhimaCreditVehicleVerifyResponse> getResponseClass() {
		return ZhimaCreditVehicleVerifyResponse.class;
	}
}
