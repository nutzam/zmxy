package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 处罚信息
 *
 * @author auto create
 * @since 1.0, 2017-03-21 23:19:17
 */
public class Punishment extends ZhimaObject {

	private static final long serialVersionUID = 6445545342284592513L;

	/** 
	 * null
	 */
	@ApiListField("punishment")
	@ApiField("ep_element")
	private List<EpElement> punishment;

	public void setPunishment(List<EpElement> punishment) {
		this.punishment = punishment;
	}
	public List<EpElement> getPunishment( ) {
		return this.punishment;
	}

}
