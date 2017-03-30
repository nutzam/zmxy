package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 个人涉诉揭露
 *
 * @author auto create
 * @since 1.0, 2016-04-07 12:04:38
 */
public class LawsuitPersonRecord extends ZhimaObject {

	private static final long serialVersionUID = 2764746413839382839L;

	/** 
	 * null
	 */
	@ApiListField("bgt_list")
	@ApiField("ep_info")
	private List<EpInfo> bgtList;

	/** 
	 * null
	 */
	@ApiListField("cpws_list")
	@ApiField("ep_info")
	private List<EpInfo> cpwsList;

	/** 
	 * null
	 */
	@ApiListField("sxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> sxggList;

	/** 
	 * null
	 */
	@ApiListField("wdhmd_list")
	@ApiField("ep_info")
	private List<EpInfo> wdhmdList;

	/** 
	 * null
	 */
	@ApiListField("zxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> zxggList;

	public void setBgtList(List<EpInfo> bgtList) {
		this.bgtList = bgtList;
	}
	public List<EpInfo> getBgtList( ) {
		return this.bgtList;
	}

	public void setCpwsList(List<EpInfo> cpwsList) {
		this.cpwsList = cpwsList;
	}
	public List<EpInfo> getCpwsList( ) {
		return this.cpwsList;
	}

	public void setSxggList(List<EpInfo> sxggList) {
		this.sxggList = sxggList;
	}
	public List<EpInfo> getSxggList( ) {
		return this.sxggList;
	}

	public void setWdhmdList(List<EpInfo> wdhmdList) {
		this.wdhmdList = wdhmdList;
	}
	public List<EpInfo> getWdhmdList( ) {
		return this.wdhmdList;
	}

	public void setZxggList(List<EpInfo> zxggList) {
		this.zxggList = zxggList;
	}
	public List<EpInfo> getZxggList( ) {
		return this.zxggList;
	}

}
