package com.antgroup.zmxy.openplatform.api.domain;

import java.util.Date;
import java.util.List;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;

/**
 * 企业关注名单详细信息
 *
 * @author auto create
 * @since 1.0, 2016-03-11 10:18:32
 */
public class ZmEpWatchListDetail extends ZhimaObject {

	private static final long serialVersionUID = 7532593643234966993L;

	/** 
	 * 风险信息行业编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 风险编码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 企业名称，可能为空
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/** 
	 * 数据刷新时间
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

	/** 
	 * 当企业进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/** 
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 行业名单风险类型
	 */
	@ApiField("type")
	private String type;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}
	public List<ZmWatchListExtendInfo> getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}
	public Date getRefreshTime( ) {
		return this.refreshTime;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getStatement( ) {
		return this.statement;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
