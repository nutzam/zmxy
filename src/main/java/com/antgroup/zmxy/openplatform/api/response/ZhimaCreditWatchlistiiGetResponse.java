package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.ZmWatchListDetail;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.watchlistii.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 11:18:58
 */
public class ZhimaCreditWatchlistiiGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 2887775639192129137L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 行业关注名单信息列表。
备注：
1、level字段当前为保留字段，只返回0，当前请忽略该字段
2、各种编码由芝麻进行维护和升级，会存在新增编码的可能
	 */
	@ApiListField("details")
	@ApiField("zm_watch_list_detail")
	private List<ZmWatchListDetail> details;

	/** 
	 * true=命中 在关注名单中
false=未命中
	 */
	@ApiField("is_matched")
	private Boolean isMatched;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDetails(List<ZmWatchListDetail> details) {
		this.details = details;
	}
	public List<ZmWatchListDetail> getDetails( ) {
		return this.details;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}
	public Boolean getIsMatched( ) {
		return this.isMatched;
	}

}
