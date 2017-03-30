package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.domain.LawsuitRecord;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.ep.lawsuit.record.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-05 16:40:41
 */
public class ZhimaCreditEpLawsuitRecordGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7221153567282381541L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业涉诉记录
	 */
	@ApiField("lawsuit_record")
	private LawsuitRecord lawsuitRecord;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitRecord(LawsuitRecord lawsuitRecord) {
		this.lawsuitRecord = lawsuitRecord;
	}
	public LawsuitRecord getLawsuitRecord( ) {
		return this.lawsuitRecord;
	}

}
