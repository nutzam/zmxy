package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.ep.individual.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-26 15:19:59
 */
public class ZhimaCreditEpIndividualScoreGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 8466215773476442558L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 被查询个体经营户的经营成长分，分值在[1000,2000]之间，如果无法打分则是N/A
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
