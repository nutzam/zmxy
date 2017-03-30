package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告信用评分
 *
 * @author auto create
 * @since 1.0, 2016-03-12 20:33:48
 */
public class VisaScore extends ZhimaObject {

	private static final long serialVersionUID = 5727136712683239548L;

	/** 
	 * 英文等级
	 */
	@ApiField("en_level")
	private String enLevel;

	/** 
	 * 评估日期
	 */
	@ApiField("eval_date")
	private String evalDate;

	/** 
	 * 信用等级
	 */
	@ApiField("level")
	private String level;

	/** 
	 * 芝麻信用评分
	 */
	@ApiField("zm_score")
	private Long zmScore;

	public void setEnLevel(String enLevel) {
		this.enLevel = enLevel;
	}
	public String getEnLevel( ) {
		return this.enLevel;
	}

	public void setEvalDate(String evalDate) {
		this.evalDate = evalDate;
	}
	public String getEvalDate( ) {
		return this.evalDate;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel( ) {
		return this.level;
	}

	public void setZmScore(Long zmScore) {
		this.zmScore = zmScore;
	}
	public Long getZmScore( ) {
		return this.zmScore;
	}

}
