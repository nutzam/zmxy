package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.RAINInfoCodeElement;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.mobile.rain.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-04 14:15:31
 */
public class ZhimaCreditMobileRainGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 3229573733781447851L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 手机号的风险代码，风险名称，风险描述，以list形式返回
	 */
	@ApiListField("info_codes")
	@ApiField("r_a_i_n_info_code_element")
	private List<RAINInfoCodeElement> infoCodes;

	/** 
	 * 手机号rain分。取值为[0,100]。得分越高，风险越高。
	 */
	@ApiField("rain_score")
	private Long rainScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setInfoCodes(List<RAINInfoCodeElement> infoCodes) {
		this.infoCodes = infoCodes;
	}
	public List<RAINInfoCodeElement> getInfoCodes( ) {
		return this.infoCodes;
	}

	public void setRainScore(Long rainScore) {
		this.rainScore = rainScore;
	}
	public Long getRainScore( ) {
		return this.rainScore;
	}

}
