package com.antgroup.zmxy.openplatform.api.domain;

import com.antgroup.zmxy.openplatform.api.ZhimaObject;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * 签证报告教育程度
 *
 * @author auto create
 * @since 1.0, 2016-03-09 15:57:30
 */
public class VisaEducation extends ZhimaObject {

	private static final long serialVersionUID = 5298633627496283993L;

	/** 
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 英文学历
	 */
	@ApiField("en_degree")
	private String enDegree;

	/** 
	 * 英文毕业时间
	 */
	@ApiField("en_graduate")
	private String enGraduate;

	/** 
	 * 英文毕业学校
	 */
	@ApiField("en_school")
	private String enSchool;

	/** 
	 * 毕业时间
	 */
	@ApiField("graduate")
	private String graduate;

	/** 
	 * 毕业学校
	 */
	@ApiField("school")
	private String school;

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setEnDegree(String enDegree) {
		this.enDegree = enDegree;
	}
	public String getEnDegree( ) {
		return this.enDegree;
	}

	public void setEnGraduate(String enGraduate) {
		this.enGraduate = enGraduate;
	}
	public String getEnGraduate( ) {
		return this.enGraduate;
	}

	public void setEnSchool(String enSchool) {
		this.enSchool = enSchool;
	}
	public String getEnSchool( ) {
		return this.enSchool;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}
	public String getGraduate( ) {
		return this.graduate;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool( ) {
		return this.school;
	}

}
