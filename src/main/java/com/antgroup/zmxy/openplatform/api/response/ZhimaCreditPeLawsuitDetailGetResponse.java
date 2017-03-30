package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.EpElement;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-18 17:45:07
 */
public class ZhimaCreditPeLawsuitDetailGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3538298197571387349L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 个人涉诉信息元素
	 */
	@ApiListField("lawsuit_detail")
	@ApiField("ep_element")
	private List<EpElement> lawsuitDetail;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitDetail(List<EpElement> lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}
	public List<EpElement> getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
