package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 每月对应的风险指数
 *
 * @author auto create
 * @since 1.0, 2017-01-16 15:19:23
 */
public class MonthRiskIndex extends ZhimaObject {

	private static final long serialVersionUID = 3495369325458181385L;

	/** 
	 * 月份，格式为yyyyMM
	 */
	@ApiField("month")
	private String month;

	/** 
	 * 风险指数，整数
	 */
	@ApiField("risk_index")
	private Long riskIndex;

	public void setMonth(String month) {
		this.month = month;
	}
	public String getMonth( ) {
		return this.month;
	}

	public void setRiskIndex(Long riskIndex) {
		this.riskIndex = riskIndex;
	}
	public Long getRiskIndex( ) {
		return this.riskIndex;
	}

}
