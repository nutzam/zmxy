package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.xueji.verify response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-06 15:11:11
 */
public class ZhimaCreditXuejiVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4533594393266821595L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 学历类别验证结果。 CE1000 表示未知或无数据 CE1001 表示正确 CE1002 表示错误
	 */
	@ApiField("edu_category_verify_result")
	private String eduCategoryVerifyResult;

	/** 
	 * 院校名称验证结果。 
CE1000 表示未知或无数据
 CE1001 表示正确
 CE1002 表示错误
	 */
	@ApiField("edu_college_verify_result")
	private String eduCollegeVerifyResult;

	/** 
	 * 学习层次验证结果。 
CE1000 表示未知或无数据
CE1001 表示正确
CE1002 表示错误
	 */
	@ApiField("edu_degree_verify_result")
	private String eduDegreeVerifyResult;

	/** 
	 * 入学年份验证结果。
CE1000 表示未知或无数据 
CE1001 表示正确 
CE1002 表示错误
	 */
	@ApiField("edu_enrollment_year_verify_result")
	private String eduEnrollmentYearVerifyResult;

	/** 
	 * 毕业年份验证结果。 
CE1000 表示未知或无数据
CE1001 表示正确
CE1002 表示错误
	 */
	@ApiField("edu_graduate_year_verify_result")
	private String eduGraduateYearVerifyResult;

	/** 
	 * 学籍是否存在
true 存在
false 不存在
	 */
	@ApiField("exist")
	private Boolean exist;

	/** 
	 * 毕业年份。只有当学籍存在，且各项校验值都正确的情况下，才会返回该字段。
	 */
	@ApiField("graduate_year")
	private String graduateYear;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setEduCategoryVerifyResult(String eduCategoryVerifyResult) {
		this.eduCategoryVerifyResult = eduCategoryVerifyResult;
	}
	public String getEduCategoryVerifyResult( ) {
		return this.eduCategoryVerifyResult;
	}

	public void setEduCollegeVerifyResult(String eduCollegeVerifyResult) {
		this.eduCollegeVerifyResult = eduCollegeVerifyResult;
	}
	public String getEduCollegeVerifyResult( ) {
		return this.eduCollegeVerifyResult;
	}

	public void setEduDegreeVerifyResult(String eduDegreeVerifyResult) {
		this.eduDegreeVerifyResult = eduDegreeVerifyResult;
	}
	public String getEduDegreeVerifyResult( ) {
		return this.eduDegreeVerifyResult;
	}

	public void setEduEnrollmentYearVerifyResult(String eduEnrollmentYearVerifyResult) {
		this.eduEnrollmentYearVerifyResult = eduEnrollmentYearVerifyResult;
	}
	public String getEduEnrollmentYearVerifyResult( ) {
		return this.eduEnrollmentYearVerifyResult;
	}

	public void setEduGraduateYearVerifyResult(String eduGraduateYearVerifyResult) {
		this.eduGraduateYearVerifyResult = eduGraduateYearVerifyResult;
	}
	public String getEduGraduateYearVerifyResult( ) {
		return this.eduGraduateYearVerifyResult;
	}

	public void setExist(Boolean exist) {
		this.exist = exist;
	}
	public Boolean getExist( ) {
		return this.exist;
	}

	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}
	public String getGraduateYear( ) {
		return this.graduateYear;
	}

}
