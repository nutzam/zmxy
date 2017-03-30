package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.ShareRiskDetail;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.sharerisk.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaCreditShareriskGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3513565481664697748L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户详细信息
	 */
	@ApiListField("details")
	@ApiField("share_risk_detail")
	private List<ShareRiskDetail> details;

	/** 
	 * 最近30天该用户被查询次数
	 */
	@ApiField("stat_month")
	private Long statMonth;

	/** 
	 * 最近90天该用户被查询次数
	 */
	@ApiField("stat_quarter")
	private Long statQuarter;

	/** 
	 * 最近3天该用户被查询次数
	 */
	@ApiField("stat_three_day")
	private Long statThreeDay;

	/** 
	 * 最近7天该用户被查询次数
	 */
	@ApiField("stat_week")
	private Long statWeek;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDetails(List<ShareRiskDetail> details) {
		this.details = details;
	}
	public List<ShareRiskDetail> getDetails( ) {
		return this.details;
	}

	public void setStatMonth(Long statMonth) {
		this.statMonth = statMonth;
	}
	public Long getStatMonth( ) {
		return this.statMonth;
	}

	public void setStatQuarter(Long statQuarter) {
		this.statQuarter = statQuarter;
	}
	public Long getStatQuarter( ) {
		return this.statQuarter;
	}

	public void setStatThreeDay(Long statThreeDay) {
		this.statThreeDay = statThreeDay;
	}
	public Long getStatThreeDay( ) {
		return this.statThreeDay;
	}

	public void setStatWeek(Long statWeek) {
		this.statWeek = statWeek;
	}
	public Long getStatWeek( ) {
		return this.statWeek;
	}

}
