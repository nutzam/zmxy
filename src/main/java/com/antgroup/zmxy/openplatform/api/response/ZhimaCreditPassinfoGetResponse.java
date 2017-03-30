package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.InfoItem;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.passinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-30 14:33:47
 */
public class ZhimaCreditPassinfoGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 6212263628475659194L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 信息基础单元列表List<InfoItem>， 其中每个信息基础单元包含key,value, name三个属性
	 */
	@ApiListField("info_items")
	@ApiField("info_item")
	private List<InfoItem> infoItems;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setInfoItems(List<InfoItem> infoItems) {
		this.infoItems = infoItems;
	}
	public List<InfoItem> getInfoItems( ) {
		return this.infoItems;
	}

}
