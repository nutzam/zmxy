package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 履约管理还款计划的分期数据
 *
 * @author auto create
 * @since 1.0, 2016-09-27 14:40:08
 */
public class Installment extends ZhimaObject {

	private static final long serialVersionUID = 2495847892489889673L;

	/** 
	 * 账期描述,描述状态或逾期天数
	 */
	@ApiField("installment_desc")
	private String installmentDesc;

	/** 
	 * 客户在合作伙伴处的某一个分期id,由合作伙伴根据自身业 务定义
	 */
	@ApiField("installment_id")
	private String installmentId;

	/** 
	 * 用户在合作伙伴处的某一分期状态: 
WAITING_REPAY:待还款
OVERDUE:已逾期
REPAID_WAITING_CONFIRM :已还款,待商户确认
CONFIRM_COMPLETE:已销账
CONFIRM_FAILED:销账失败
	 */
	@ApiField("installment_status")
	private String installmentStatus;

	public void setInstallmentDesc(String installmentDesc) {
		this.installmentDesc = installmentDesc;
	}
	public String getInstallmentDesc( ) {
		return this.installmentDesc;
	}

	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}
	public String getInstallmentId( ) {
		return this.installmentId;
	}

	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}
	public String getInstallmentStatus( ) {
		return this.installmentStatus;
	}

}
