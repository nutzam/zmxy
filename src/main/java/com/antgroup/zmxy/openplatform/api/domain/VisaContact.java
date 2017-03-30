package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告联系方式
 *
 * @author auto create
 * @since 1.0, 2016-03-09 15:47:32
 */
public class VisaContact extends ZhimaObject {

	private static final long serialVersionUID = 8145228573529617686L;

	/** 
	 * 联系地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 英文地址
	 */
	@ApiField("en_address")
	private String enAddress;

	/** 
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setEnAddress(String enAddress) {
		this.enAddress = enAddress;
	}
	public String getEnAddress( ) {
		return this.enAddress;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

}
