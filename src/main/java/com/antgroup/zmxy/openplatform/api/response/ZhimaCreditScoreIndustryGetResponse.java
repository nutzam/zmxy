package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.score.industry.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-08 10:15:25
 */
public class ZhimaCreditScoreIndustryGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1525174571652127844L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 行业分；
	 */
	@ApiField("industry_score")
	private String industryScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIndustryScore(String industryScore) {
		this.industryScore = industryScore;
	}
	public String getIndustryScore( ) {
		return this.industryScore;
	}

}
