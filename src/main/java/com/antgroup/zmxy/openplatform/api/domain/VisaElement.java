package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告数值键值对
 *
 * @author auto create
 * @since 1.0, 2016-03-12 20:35:51
 */
public class VisaElement extends ZhimaObject {

	private static final long serialVersionUID = 5299128766475444746L;

	/** 
	 * 金额
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 月份
	 */
	@ApiField("month")
	private String month;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	public String getMonth( ) {
		return this.month;
	}

}
