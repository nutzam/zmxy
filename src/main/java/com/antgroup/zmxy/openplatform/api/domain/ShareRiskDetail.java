package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 共享风险信息详情
 *
 * @author auto create
 * @since 1.0, 2015-12-12 11:49:03
 */
public class ShareRiskDetail extends ZhimaObject {

	private static final long serialVersionUID = 1289537617478173313L;

	/** 
	 * 公司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/** 
	 * 当前是否逾期180+
	 */
	@ApiField("now_overdue_half_year")
	private Boolean nowOverdueHalfYear;

	/** 
	 * 当前是否逾期90+
	 */
	@ApiField("now_overdue_quarter")
	private Boolean nowOverdueQuarter;

	/** 
	 * 曾经是否逾期180+
	 */
	@ApiField("once_overdue_half_year")
	private Boolean onceOverdueHalfYear;

	/** 
	 * 曾经是否逾期90+
	 */
	@ApiField("once_overdue_quarter")
	private Boolean onceOverdueQuarter;

	/** 
	 * 逾期金额
	 */
	@ApiField("overdue_amt")
	private String overdueAmt;

	/** 
	 * 风险代码
借贷逾期对应的风险代码为：
01  逾期91-120天
02  逾期121-150天
03  逾期151-180天
04  逾期180天以上
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 风险名单类型
R001 借贷逾期
	 */
	@ApiField("risk_type")
	private String riskType;

	/** 
	 * 报送日期
	 */
	@ApiField("submit_date")
	private String submitDate;

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyType( ) {
		return this.companyType;
	}

	public void setNowOverdueHalfYear(Boolean nowOverdueHalfYear) {
		this.nowOverdueHalfYear = nowOverdueHalfYear;
	}
	public Boolean getNowOverdueHalfYear( ) {
		return this.nowOverdueHalfYear;
	}

	public void setNowOverdueQuarter(Boolean nowOverdueQuarter) {
		this.nowOverdueQuarter = nowOverdueQuarter;
	}
	public Boolean getNowOverdueQuarter( ) {
		return this.nowOverdueQuarter;
	}

	public void setOnceOverdueHalfYear(Boolean onceOverdueHalfYear) {
		this.onceOverdueHalfYear = onceOverdueHalfYear;
	}
	public Boolean getOnceOverdueHalfYear( ) {
		return this.onceOverdueHalfYear;
	}

	public void setOnceOverdueQuarter(Boolean onceOverdueQuarter) {
		this.onceOverdueQuarter = onceOverdueQuarter;
	}
	public Boolean getOnceOverdueQuarter( ) {
		return this.onceOverdueQuarter;
	}

	public void setOverdueAmt(String overdueAmt) {
		this.overdueAmt = overdueAmt;
	}
	public String getOverdueAmt( ) {
		return this.overdueAmt;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskCode( ) {
		return this.riskCode;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	public String getRiskType( ) {
		return this.riskType;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}
	public String getSubmitDate( ) {
		return this.submitDate;
	}

}
