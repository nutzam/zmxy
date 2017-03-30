package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 云图边表结构
 *
 * @author auto create
 * @since 1.0, 2016-06-17 14:59:44
 */
public class Edge extends ZhimaObject {

	private static final long serialVersionUID = 3414636652846518473L;

	/** 
	 * 认缴出资比例
	 */
	@ApiField("funded_ratio")
	private String fundedRatio;

	/** 
	 * 节点I的ID
	 */
	@ApiField("i_node_id")
	private String iNodeId;

	/** 
	 * 边表ID
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 节点J的ID
	 */
	@ApiField("j_node_id")
	private String jNodeId;

	/** 
	 * 强弱程度
	 */
	@ApiField("level")
	private String level;

	/** 
	 * 强弱程度指数
	 */
	@ApiField("level_index")
	private String levelIndex;

	/** 
	 * 币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/** 
	 * 关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	/** 
	 * 认缴出资额
	 */
	@ApiField("sub_conam")
	private String subConam;

	public void setFundedRatio(String fundedRatio) {
		this.fundedRatio = fundedRatio;
	}
	public String getFundedRatio( ) {
		return this.fundedRatio;
	}

	public void setiNodeId(String iNodeId) {
		this.iNodeId = iNodeId;
	}
	public String getiNodeId( ) {
		return this.iNodeId;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setjNodeId(String jNodeId) {
		this.jNodeId = jNodeId;
	}
	public String getjNodeId( ) {
		return this.jNodeId;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel( ) {
		return this.level;
	}

	public void setLevelIndex(String levelIndex) {
		this.levelIndex = levelIndex;
	}
	public String getLevelIndex( ) {
		return this.levelIndex;
	}

	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}
	public String getRegCapCur( ) {
		return this.regCapCur;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getRelationType( ) {
		return this.relationType;
	}

	public void setSubConam(String subConam) {
		this.subConam = subConam;
	}
	public String getSubConam( ) {
		return this.subConam;
	}

}
