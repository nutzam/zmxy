package com.antgroup.zmxy.openplatform.api.domain;

import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 企业涉诉记录
 *
 * @author auto create
 * @since 1.0, 2016-02-05 10:41:43
 */
public class LawsuitRecord extends ZhimaObject {

	private static final long serialVersionUID = 8393572556221852781L;

	/** 
	 * （企业涉诉）案件流程
	 */
	@ApiListField("ajlc_list")
	@ApiField("ep_info")
	private List<EpInfo> ajlcList;

	/** 
	 * （企业涉诉）曝光台
	 */
	@ApiListField("bgt_list")
	@ApiField("ep_info")
	private List<EpInfo> bgtList;

	/** 
	 * （企业涉诉）裁判文书
	 */
	@ApiListField("cpws_list")
	@ApiField("ep_info")
	private List<EpInfo> cpwsList;

	/** 
	 * （企业涉诉）法院公告
	 */
	@ApiListField("fygg_list")
	@ApiField("ep_info")
	private List<EpInfo> fyggList;

	/** 
	 * （企业涉诉）开庭公告
	 */
	@ApiListField("ktgg_list")
	@ApiField("ep_info")
	private List<EpInfo> ktggList;

	/** 
	 * （企业涉诉）失信公告
	 */
	@ApiListField("sxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> sxggList;

	/** 
	 * （企业涉诉）执行公告
	 */
	@ApiListField("zxgg_list")
	@ApiField("ep_info")
	private List<EpInfo> zxggList;

	public void setAjlcList(List<EpInfo> ajlcList) {
		this.ajlcList = ajlcList;
	}
	public List<EpInfo> getAjlcList( ) {
		return this.ajlcList;
	}

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

	public void setFyggList(List<EpInfo> fyggList) {
		this.fyggList = fyggList;
	}
	public List<EpInfo> getFyggList( ) {
		return this.fyggList;
	}

	public void setKtggList(List<EpInfo> ktggList) {
		this.ktggList = ktggList;
	}
	public List<EpInfo> getKtggList( ) {
		return this.ktggList;
	}

	public void setSxggList(List<EpInfo> sxggList) {
		this.sxggList = sxggList;
	}
	public List<EpInfo> getSxggList( ) {
		return this.sxggList;
	}

	public void setZxggList(List<EpInfo> zxggList) {
		this.zxggList = zxggList;
	}
	public List<EpInfo> getZxggList( ) {
		return this.zxggList;
	}

}
