package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.skynetrisk.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-13 18:51:23
 */
public class ZhimaCreditSkynetriskGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 2292294366474884286L;

	/** 
	 * 0-未命中；
1-低风；
2-中风险；
3-高风险
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevel( ) {
		return this.riskLevel;
	}

}
