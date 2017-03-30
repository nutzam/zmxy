package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告信用卡
 *
 * @author auto create
 * @since 1.0, 2016-03-18 18:19:48
 */
public class VisaCredit extends ZhimaObject {

	private static final long serialVersionUID = 6355392664244756656L;

	/** 
	 * 银行
	 */
	@ApiField("bank")
	private String bank;

	/** 
	 * 英文信用卡等级
	 */
	@ApiField("en_level")
	private String enLevel;

	/** 
	 * 信用卡等级
	 */
	@ApiField("level")
	private String level;

	/** 
	 * 额度
	 */
	@ApiField("limit")
	private Long limit;

	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank( ) {
		return this.bank;
	}

	public void setEnLevel(String enLevel) {
		this.enLevel = enLevel;
	}
	public String getEnLevel( ) {
		return this.enLevel;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel( ) {
		return this.level;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}
	public Long getLimit( ) {
		return this.limit;
	}

}
