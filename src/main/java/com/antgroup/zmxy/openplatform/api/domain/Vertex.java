package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 点表数据结构
 *
 * @author auto create
 * @since 1.0, 2016-06-17 14:44:15
 */
public class Vertex extends ZhimaObject {

	private static final long serialVersionUID = 4344452944233121735L;

	/** 
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 企业注册号
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 企业地址
	 */
	@ApiField("dom")
	private String dom;

	/** 
	 * 企业的状态
	 */
	@ApiField("ent_status")
	private String entStatus;

	/** 
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/** 
	 * 点表的ID
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 是否在关注名单内
	 */
	@ApiField("in_black_list")
	private String inBlackList;

	/** 
	 * 注册资本
	 */
	@ApiField("reg_cap")
	private String regCap;

	/** 
	 * 币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/** 
	 * 登记单位
	 */
	@ApiField("reg_org")
	private String regOrg;

	/** 
	 * 关联层级
	 */
	@ApiField("relation_level")
	private String relationLevel;

	/** 
	 * 风险指数
	 */
	@ApiField("risk_index")
	private String riskIndex;

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getDom( ) {
		return this.dom;
	}

	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}
	public String getEntStatus( ) {
		return this.entStatus;
	}

	public void setEntType(String entType) {
		this.entType = entType;
	}
	public String getEntType( ) {
		return this.entType;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setInBlackList(String inBlackList) {
		this.inBlackList = inBlackList;
	}
	public String getInBlackList( ) {
		return this.inBlackList;
	}

	public void setRegCap(String regCap) {
		this.regCap = regCap;
	}
	public String getRegCap( ) {
		return this.regCap;
	}

	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}
	public String getRegCapCur( ) {
		return this.regCapCur;
	}

	public void setRegOrg(String regOrg) {
		this.regOrg = regOrg;
	}
	public String getRegOrg( ) {
		return this.regOrg;
	}

	public void setRelationLevel(String relationLevel) {
		this.relationLevel = relationLevel;
	}
	public String getRelationLevel( ) {
		return this.relationLevel;
	}

	public void setRiskIndex(String riskIndex) {
		this.riskIndex = riskIndex;
	}
	public String getRiskIndex( ) {
		return this.riskIndex;
	}

}
