package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.contact.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-18 21:30:13
 */
public class ZhimaCreditContactGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 1672974521337521919L;

	/** 
	 * 返回的用户的地址信息。可能有多个地址，使用|分隔
	 */
	@ApiField("addresses")
	private String addresses;

	/** 
	 * 扩展字段，目前返回null
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的电话号码。可能存在多个，以|分隔
	 */
	@ApiField("mobiles")
	private String mobiles;

	/** 
	 * 1：返回信息多于用户传入的信息，例如，假设用户传入了一组手机/地址信息，查询返回的信息经过比对后信息多于用户传入的信息，则返回1 
0：无返回信息或者返回信息和用户传入信息一致
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
	public String getAddresses( ) {
		return this.addresses;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}
	public String getMobiles( ) {
		return this.mobiles;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
