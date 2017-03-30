package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 企业征信基本信息
 *
 * @author auto create
 * @since 1.0, 2016-02-04 14:49:18
 */
public class EpInfo extends ZhimaObject {

	private static final long serialVersionUID = 2521985654131882661L;

	/** 
	 * 企业征信基本信息
	 */
	@ApiListField("ep_element_list")
	@ApiField("ep_element")
	private List<EpElement> epElementList;

	public void setEpElementList(List<EpElement> epElementList) {
		this.epElementList = epElementList;
	}
	public List<EpElement> getEpElementList( ) {
		return this.epElementList;
	}

}
