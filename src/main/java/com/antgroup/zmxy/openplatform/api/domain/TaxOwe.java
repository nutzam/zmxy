package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 欠税信息
 *
 * @author auto create
 * @since 1.0, 2017-03-16 22:40:31
 */
public class TaxOwe extends ZhimaObject {

	private static final long serialVersionUID = 3764272427712453558L;

	/** 
	 * null
	 */
	@ApiListField("tax_owe")
	@ApiField("ep_element")
	private List<EpElement> taxOwe;

	public void setTaxOwe(List<EpElement> taxOwe) {
		this.taxOwe = taxOwe;
	}
	public List<EpElement> getTaxOwe( ) {
		return this.taxOwe;
	}

}
