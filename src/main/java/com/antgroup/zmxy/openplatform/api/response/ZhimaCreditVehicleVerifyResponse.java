package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.vehicle.verify response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:27
 */
public class ZhimaCreditVehicleVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1491443219458687258L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 是否完成查询
	 */
	@ApiField("complete")
	private Boolean complete;

	/** 
	 * 发动机号码校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("engine_no_verify_code")
	private Long engineNoVerifyCode;

	/** 
	 * 行驶证是否存在。当车牌号与车辆识别代号或发动机号码任一匹配上，即判定为存在，否则不存在
	 */
	@ApiField("exist")
	private Boolean exist;

	/** 
	 * 所有人校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("owner_verify_code")
	private Long ownerVerifyCode;

	/** 
	 * 注册日期校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("register_date_verify_code")
	private Long registerDateVerifyCode;

	/** 
	 * 行驶证状态。具体枚举值见产品文档
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 车辆品牌校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("vehicle_brand_verify_code")
	private Long vehicleBrandVerifyCode;

	/** 
	 * 车辆型号校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("vehicle_series_verify_code")
	private Long vehicleSeriesVerifyCode;

	/** 
	 * 车辆识别代码校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("vin_verify_code")
	private Long vinVerifyCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	public Boolean getComplete( ) {
		return this.complete;
	}

	public void setEngineNoVerifyCode(Long engineNoVerifyCode) {
		this.engineNoVerifyCode = engineNoVerifyCode;
	}
	public Long getEngineNoVerifyCode( ) {
		return this.engineNoVerifyCode;
	}

	public void setExist(Boolean exist) {
		this.exist = exist;
	}
	public Boolean getExist( ) {
		return this.exist;
	}

	public void setOwnerVerifyCode(Long ownerVerifyCode) {
		this.ownerVerifyCode = ownerVerifyCode;
	}
	public Long getOwnerVerifyCode( ) {
		return this.ownerVerifyCode;
	}

	public void setRegisterDateVerifyCode(Long registerDateVerifyCode) {
		this.registerDateVerifyCode = registerDateVerifyCode;
	}
	public Long getRegisterDateVerifyCode( ) {
		return this.registerDateVerifyCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVehicleBrandVerifyCode(Long vehicleBrandVerifyCode) {
		this.vehicleBrandVerifyCode = vehicleBrandVerifyCode;
	}
	public Long getVehicleBrandVerifyCode( ) {
		return this.vehicleBrandVerifyCode;
	}

	public void setVehicleSeriesVerifyCode(Long vehicleSeriesVerifyCode) {
		this.vehicleSeriesVerifyCode = vehicleSeriesVerifyCode;
	}
	public Long getVehicleSeriesVerifyCode( ) {
		return this.vehicleSeriesVerifyCode;
	}

	public void setVinVerifyCode(Long vinVerifyCode) {
		this.vinVerifyCode = vinVerifyCode;
	}
	public Long getVinVerifyCode( ) {
		return this.vinVerifyCode;
	}

}
