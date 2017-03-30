package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.risk.list response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-17 20:46:34
 */
public class ZhimaCreditAntifraudRiskListResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3642662196729433325L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 欺诈关注清单是否命中，yes标识命中，no标识未命中
	 */
	@ApiField("hit")
	private String hit;

	/** 
	 * 欺诈关注清单的RiskCode列表，对应的描述见产品文档
	 */
	@ApiListField("risk_code")
	@ApiField("string")
	private List<String> riskCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getHit( ) {
		return this.hit;
	}

	public void setRiskCode(List<String> riskCode) {
		this.riskCode = riskCode;
	}
	public List<String> getRiskCode( ) {
		return this.riskCode;
	}

}
