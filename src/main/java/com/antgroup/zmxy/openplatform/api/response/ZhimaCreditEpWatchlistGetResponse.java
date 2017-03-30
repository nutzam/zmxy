package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.ZmEpWatchListDetail;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.ep.watchlist.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 11:21:33
 */
public class ZhimaCreditEpWatchlistGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5745157551595699873L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业关注名单的详细信息
	 */
	@ApiListField("details")
	@ApiField("zm_ep_watch_list_detail")
	private List<ZmEpWatchListDetail> details;

	/** 
	 * true=命中 在关注名单中 false=未命中
	 */
	@ApiField("is_matched")
	private Boolean isMatched;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDetails(List<ZmEpWatchListDetail> details) {
		this.details = details;
	}
	public List<ZmEpWatchListDetail> getDetails( ) {
		return this.details;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}
	public Boolean getIsMatched( ) {
		return this.isMatched;
	}

}
