package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.merchant.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-17 12:22:35
 */
public class ZhimaMerchantOrderConfirmResponse extends ZhimaResponse {

	private static final long serialVersionUID = 2341483439838397169L;

	/** 
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/** 
	 * 身份证签发机关
	 */
	@ApiField("cert_city")
	private String certCity;

	/** 
	 * 身份证有效期
	 */
	@ApiField("cert_indate")
	private String certIndate;

	/** 
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 渠道来源
	 */
	@ApiField("channel_id")
	private String channelId;

	/** 
	 * 常驻城市
	 */
	@ApiField("city_name")
	private String cityName;

	/** 
	 * 单位地址
	 */
	@ApiField("company_address")
	private String companyAddress;

	/** 
	 * 单位电话
	 */
	@ApiField("company_contact")
	private String companyContact;

	/** 
	 * 单位名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 单位性质
	 */
	@ApiField("company_type")
	private String companyType;

	/** 
	 * 联系人电话
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/** 
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/** 
	 * 父母、配偶、子女、兄弟／姐妹、其他
	 */
	@ApiField("contact_relation")
	private String contactRelation;

	/** 
	 * 任职部门
	 */
	@ApiField("department")
	private String department;

	/** 
	 * 直亲关系
	 */
	@ApiField("direct_relation")
	private String directRelation;

	/** 
	 * 直亲手机号
	 */
	@ApiField("direct_relation_mobile")
	private String directRelationMobile;

	/** 
	 * 直亲姓名
	 */
	@ApiField("direct_relation_name")
	private String directRelationName;

	/** 
	 * 教育程度
	 */
	@ApiField("education_degree")
	private String educationDegree;

	/** 
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 住宅地址
	 */
	@ApiField("house")
	private String house;

	/** 
	 * 住宅性质
	 */
	@ApiField("house_type")
	private String houseType;

	/** 
	 * 行业类型
	 */
	@ApiField("industry_type")
	private String industryType;

	/** 
	 * 邮寄地址 1：住宅地址 2：工作地址
	 */
	@ApiField("mailing_address")
	private String mailingAddress;

	/** 
	 * 婚姻状况
	 */
	@ApiField("marriage_status")
	private String marriageStatus;

	/** 
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 姓名拼音
	 */
	@ApiField("name_spell")
	private String nameSpell;

	/** 
	 * 职业说明
	 */
	@ApiField("occupation")
	private String occupation;

	/** 
	 * 用户在商端的身份标识
如果在接口的入参中存在该参数，芝麻网关会自动转化成roleId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 职位级别
	 */
	@ApiField("position_level")
	private String positionLevel;

	/** 
	 * 税后年收入
	 */
	@ApiField("taxed_income")
	private String taxedIncome;

	/** 
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 现单位工作年限
	 */
	@ApiField("worked_years")
	private String workedYears;

	/** 
	 * 芝麻风控产品集联合结果
	 */
	@ApiField("zm_risk")
	private String zmRisk;

	/** 
	 * 芝麻分
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setAge(String age) {
		this.age = age;
	}
	public String getAge( ) {
		return this.age;
	}

	public void setCertCity(String certCity) {
		this.certCity = certCity;
	}
	public String getCertCity( ) {
		return this.certCity;
	}

	public void setCertIndate(String certIndate) {
		this.certIndate = certIndate;
	}
	public String getCertIndate( ) {
		return this.certIndate;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelId( ) {
		return this.channelId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName( ) {
		return this.cityName;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyAddress( ) {
		return this.companyAddress;
	}

	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public String getCompanyContact( ) {
		return this.companyContact;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyType( ) {
		return this.companyType;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getContactMobile( ) {
		return this.contactMobile;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName( ) {
		return this.contactName;
	}

	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
	}
	public String getContactRelation( ) {
		return this.contactRelation;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment( ) {
		return this.department;
	}

	public void setDirectRelation(String directRelation) {
		this.directRelation = directRelation;
	}
	public String getDirectRelation( ) {
		return this.directRelation;
	}

	public void setDirectRelationMobile(String directRelationMobile) {
		this.directRelationMobile = directRelationMobile;
	}
	public String getDirectRelationMobile( ) {
		return this.directRelationMobile;
	}

	public void setDirectRelationName(String directRelationName) {
		this.directRelationName = directRelationName;
	}
	public String getDirectRelationName( ) {
		return this.directRelationName;
	}

	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}
	public String getEducationDegree( ) {
		return this.educationDegree;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setHouse(String house) {
		this.house = house;
	}
	public String getHouse( ) {
		return this.house;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getHouseType( ) {
		return this.houseType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getIndustryType( ) {
		return this.industryType;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public String getMailingAddress( ) {
		return this.mailingAddress;
	}

	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public String getMarriageStatus( ) {
		return this.marriageStatus;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNameSpell(String nameSpell) {
		this.nameSpell = nameSpell;
	}
	public String getNameSpell( ) {
		return this.nameSpell;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getOccupation( ) {
		return this.occupation;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}
	public String getPositionLevel( ) {
		return this.positionLevel;
	}

	public void setTaxedIncome(String taxedIncome) {
		this.taxedIncome = taxedIncome;
	}
	public String getTaxedIncome( ) {
		return this.taxedIncome;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWorkedYears(String workedYears) {
		this.workedYears = workedYears;
	}
	public String getWorkedYears( ) {
		return this.workedYears;
	}

	public void setZmRisk(String zmRisk) {
		this.zmRisk = zmRisk;
	}
	public String getZmRisk( ) {
		return this.zmRisk;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
