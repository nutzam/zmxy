package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.driver.verify response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:41
 */
public class ZhimaCreditDriverVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7743754248755996856L;

	/** 
	 * 档案编号校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("archive_no_verify_code")
	private Long archiveNoVerifyCode;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 数据当前是否已经获取到
	 */
	@ApiField("complete")
	private Boolean complete;

	/** 
	 * 驾驶证是否存在
	 */
	@ApiField("exist")
	private Boolean exist;

	/** 
	 * 初次领证日期校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("issue_date_verify_code")
	private Long issueDateVerifyCode;

	/** 
	 * 姓名校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("name_verify_code")
	private Long nameVerifyCode;

	/** 
	 * 驾驶证状态。具体枚举值见产品文档
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 准驾车型校验结果[1：匹配；0：不匹配；-1：未输入]
	 */
	@ApiField("vehicle_class_verify_code")
	private Long vehicleClassVerifyCode;

	public void setArchiveNoVerifyCode(Long archiveNoVerifyCode) {
		this.archiveNoVerifyCode = archiveNoVerifyCode;
	}
	public Long getArchiveNoVerifyCode( ) {
		return this.archiveNoVerifyCode;
	}

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

	public void setExist(Boolean exist) {
		this.exist = exist;
	}
	public Boolean getExist( ) {
		return this.exist;
	}

	public void setIssueDateVerifyCode(Long issueDateVerifyCode) {
		this.issueDateVerifyCode = issueDateVerifyCode;
	}
	public Long getIssueDateVerifyCode( ) {
		return this.issueDateVerifyCode;
	}

	public void setNameVerifyCode(Long nameVerifyCode) {
		this.nameVerifyCode = nameVerifyCode;
	}
	public Long getNameVerifyCode( ) {
		return this.nameVerifyCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVehicleClassVerifyCode(Long vehicleClassVerifyCode) {
		this.vehicleClassVerifyCode = vehicleClassVerifyCode;
	}
	public Long getVehicleClassVerifyCode( ) {
		return this.vehicleClassVerifyCode;
	}

}
