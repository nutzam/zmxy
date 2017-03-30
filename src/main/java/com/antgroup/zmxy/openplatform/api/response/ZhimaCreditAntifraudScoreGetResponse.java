package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-17 20:46:17
 */
public class ZhimaCreditAntifraudScoreGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5583752628834787933L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 申请欺诈评分，分数范围是[0,100]的整数,分数越高信息越真实
	 */
	@ApiField("score")
	private Long score;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}

}
