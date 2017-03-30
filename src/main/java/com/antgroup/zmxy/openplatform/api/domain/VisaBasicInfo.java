package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告用户基本信息
 *
 * @author auto create
 * @since 1.0, 2016-03-11 11:18:27
 */
public class VisaBasicInfo extends ZhimaObject {

	private static final long serialVersionUID = 8489443779374524925L;

	/** 
	 * 中文生日
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 出生地
	 */
	@ApiField("birthplace")
	private String birthplace;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 英文生日
	 */
	@ApiField("en_birthday")
	private String enBirthday;

	/** 
	 * 英文出生地
	 */
	@ApiField("en_birthplace")
	private String enBirthplace;

	/** 
	 * 英文证件号
	 */
	@ApiField("en_cert_no")
	private String enCertNo;

	/** 
	 * 英文性别
	 */
	@ApiField("en_gender")
	private String enGender;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getBirthplace( ) {
		return this.birthplace;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setEnBirthday(String enBirthday) {
		this.enBirthday = enBirthday;
	}
	public String getEnBirthday( ) {
		return this.enBirthday;
	}

	public void setEnBirthplace(String enBirthplace) {
		this.enBirthplace = enBirthplace;
	}
	public String getEnBirthplace( ) {
		return this.enBirthplace;
	}

	public void setEnCertNo(String enCertNo) {
		this.enCertNo = enCertNo;
	}
	public String getEnCertNo( ) {
		return this.enCertNo;
	}

	public void setEnGender(String enGender) {
		this.enGender = enGender;
	}
	public String getEnGender( ) {
		return this.enGender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
