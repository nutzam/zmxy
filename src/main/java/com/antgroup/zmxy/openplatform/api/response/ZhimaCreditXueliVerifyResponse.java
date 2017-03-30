package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.xueli.verify response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-08 10:08:01
 */
public class ZhimaCreditXueliVerifyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 6129192169752755243L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 学历类别验证结果。
CE1000 表示未知或无数据 
CE1001 表示正确 
CE1002 表示错误
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
	 * 毕业年份验证结果。
CE1000 表示未知或无数据 
CE1001 表示正确 
CE1002 表示错误
	 */
	@ApiField("edu_graduate_year_verify_result")
	private String eduGraduateYearVerifyResult;

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

	public void setEduGraduateYearVerifyResult(String eduGraduateYearVerifyResult) {
		this.eduGraduateYearVerifyResult = eduGraduateYearVerifyResult;
	}
	public String getEduGraduateYearVerifyResult( ) {
		return this.eduGraduateYearVerifyResult;
	}

}
