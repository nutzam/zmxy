package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 企业征信-中数工商企业信息查询
 *
 * @author auto create
 * @since 1.0, 2016-02-22 15:51:56
 */
public class CompanyInfo extends ZhimaObject {

	private static final long serialVersionUID = 2158562688971278414L;

	/** 
	 * 企业历史变更信息
	 */
	@ApiListField("alter_list")
	@ApiField("ep_info")
	private List<EpInfo> alterList;

	/** 
	 * 企业基本信息
	 */
	@ApiField("basic_info")
	private EpInfo basicInfo;

	/** 
	 * 行政处罚历史信息
	 */
	@ApiListField("case_info_list")
	@ApiField("ep_info")
	private List<EpInfo> caseInfoList;

	/** 
	 * 企业对外投资信息
	 */
	@ApiListField("entinv_list")
	@ApiField("ep_info")
	private List<EpInfo> entinvList;

	/** 
	 * 企业法定代表人其他公司任职信息
	 */
	@ApiListField("fr_position_list")
	@ApiField("ep_info")
	private List<EpInfo> frPositionList;

	/** 
	 * 企业法定代表人对外投资信息
	 */
	@ApiListField("frinv_list")
	@ApiField("ep_info")
	private List<EpInfo> frinvList;

	/** 
	 * 企业主要管理人员信息
	 */
	@ApiListField("person_list")
	@ApiField("ep_info")
	private List<EpInfo> personList;

	/** 
	 * 企业股东及出资信息
	 */
	@ApiListField("share_holder_list")
	@ApiField("ep_info")
	private List<EpInfo> shareHolderList;

	public void setAlterList(List<EpInfo> alterList) {
		this.alterList = alterList;
	}
	public List<EpInfo> getAlterList( ) {
		return this.alterList;
	}

	public void setBasicInfo(EpInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public EpInfo getBasicInfo( ) {
		return this.basicInfo;
	}

	public void setCaseInfoList(List<EpInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}
	public List<EpInfo> getCaseInfoList( ) {
		return this.caseInfoList;
	}

	public void setEntinvList(List<EpInfo> entinvList) {
		this.entinvList = entinvList;
	}
	public List<EpInfo> getEntinvList( ) {
		return this.entinvList;
	}

	public void setFrPositionList(List<EpInfo> frPositionList) {
		this.frPositionList = frPositionList;
	}
	public List<EpInfo> getFrPositionList( ) {
		return this.frPositionList;
	}

	public void setFrinvList(List<EpInfo> frinvList) {
		this.frinvList = frinvList;
	}
	public List<EpInfo> getFrinvList( ) {
		return this.frinvList;
	}

	public void setPersonList(List<EpInfo> personList) {
		this.personList = personList;
	}
	public List<EpInfo> getPersonList( ) {
		return this.personList;
	}

	public void setShareHolderList(List<EpInfo> shareHolderList) {
		this.shareHolderList = shareHolderList;
	}
	public List<EpInfo> getShareHolderList( ) {
		return this.shareHolderList;
	}

}
