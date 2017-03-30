package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.VisaElement;
import com.antgroup.zmxy.openplatform.api.domain.VisaBasicInfo;
import com.antgroup.zmxy.openplatform.api.domain.VisaContact;
import com.antgroup.zmxy.openplatform.api.domain.VisaCredit;
import com.antgroup.zmxy.openplatform.api.domain.VisaEducation;
import com.antgroup.zmxy.openplatform.api.domain.VisaScore;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.report.visa.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-21 13:53:08
 */
public class ZhimaCreditReportVisaGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4484118447343362225L;

	/** 
	 * 资产模块
	 */
	@ApiListField("balance")
	@ApiField("visa_element")
	private List<VisaElement> balance;

	/** 
	 * 用户基本信息
	 */
	@ApiField("basic")
	private VisaBasicInfo basic;

	/** 
	 * 联系方式
	 */
	@ApiField("contact")
	private VisaContact contact;

	/** 
	 * 消费水平模块
	 */
	@ApiListField("cost")
	@ApiField("visa_element")
	private List<VisaElement> cost;

	/** 
	 * 信贷等级模块
	 */
	@ApiField("credit")
	private VisaCredit credit;

	/** 
	 * 教育信息
	 */
	@ApiField("education")
	private VisaEducation education;

	/** 
	 * 缴费模块
	 */
	@ApiListField("fee")
	@ApiField("visa_element")
	private List<VisaElement> fee;

	/** 
	 * 还款模块
	 */
	@ApiListField("repay")
	@ApiField("visa_element")
	private List<VisaElement> repay;

	/** 
	 * 报告日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 芝麻分模块
	 */
	@ApiField("score")
	private VisaScore score;

	public void setBalance(List<VisaElement> balance) {
		this.balance = balance;
	}
	public List<VisaElement> getBalance( ) {
		return this.balance;
	}

	public void setBasic(VisaBasicInfo basic) {
		this.basic = basic;
	}
	public VisaBasicInfo getBasic( ) {
		return this.basic;
	}

	public void setContact(VisaContact contact) {
		this.contact = contact;
	}
	public VisaContact getContact( ) {
		return this.contact;
	}

	public void setCost(List<VisaElement> cost) {
		this.cost = cost;
	}
	public List<VisaElement> getCost( ) {
		return this.cost;
	}

	public void setCredit(VisaCredit credit) {
		this.credit = credit;
	}
	public VisaCredit getCredit( ) {
		return this.credit;
	}

	public void setEducation(VisaEducation education) {
		this.education = education;
	}
	public VisaEducation getEducation( ) {
		return this.education;
	}

	public void setFee(List<VisaElement> fee) {
		this.fee = fee;
	}
	public List<VisaElement> getFee( ) {
		return this.fee;
	}

	public void setRepay(List<VisaElement> repay) {
		this.repay = repay;
	}
	public List<VisaElement> getRepay( ) {
		return this.repay;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

	public void setScore(VisaScore score) {
		this.score = score;
	}
	public VisaScore getScore( ) {
		return this.score;
	}

}
