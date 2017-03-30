package com.antgroup.zmxy.openplatform.api.request;

import java.util.HashMap;
import java.util.Map;

import com.antgroup.zmxy.openplatform.api.FileItem;
import com.antgroup.zmxy.openplatform.api.ZhimaUploadRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaDataBatchFeedbackResponse;

/**
 * ALIPAY API: zhima.data.batch.feedback request
 * 
 * @author auto create
 * @since 1.0, 2016-08-01 16:12:33
 */
public class ZhimaDataBatchFeedbackRequest implements ZhimaUploadRequest<ZhimaDataBatchFeedbackResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 扩展参数
	 */
	private String bizExtParams;

	/** 
	* 单条数据的数据列，多个列以逗号隔开
	 */
	private String columns;

	/** 
	* 反馈的json格式的文件，其中{"records":  是每个文件的固定开头。
	 */
	private FileItem file;

	/** 
	* 是反馈文件的数据编码，如果文件格式是UTF-8，则填写UTF-8，如果文件格式是GBK，则填写GBK
	 */
	private String fileCharset;

	/** 
	* 文件描述信息
	 */
	private String fileDescription;

	/** 
	* 反馈的数据类型，目前只支持json_data
	 */
	private String fileType;

	/** 
	* 主键列使用反馈字段进行组合，也可以使用反馈的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no,pay_month或者order_no,bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键列
	 */
	private String primaryKeyColumns;

	/** 
	* 文件数据记录条数
	 */
	private String records;

	/** 
	* 芝麻系统中配置的值，由芝麻信用提供，需要匹配，测试反馈和正式反馈使用不同的type_id。
其中测试type_id与反馈字段模板会通过邮件统一提供给合作伙伴，在测试反馈通过之后，再通过邮件提供正式反馈type_id给合作伙伴。
	 */
	private String typeId;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams() {
		return this.bizExtParams;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getColumns() {
		return this.columns;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}
	public FileItem getFile() {
		return this.file;
	}

	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}
	public String getFileCharset() {
		return this.fileCharset;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFileDescription() {
		return this.fileDescription;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setPrimaryKeyColumns(String primaryKeyColumns) {
		this.primaryKeyColumns = primaryKeyColumns;
	}
	public String getPrimaryKeyColumns() {
		return this.primaryKeyColumns;
	}

	public void setRecords(String records) {
		this.records = records;
	}
	public String getRecords() {
		return this.records;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeId() {
		return this.typeId;
	}
	private String channel;
	private String platform;	
	private String scene;
	private String extParams;

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setChannel(String channel){
		this.channel=channel;
	}

    public String getChannel(){
    	return this.channel;
    }
 
	public void setPlatform(String platform){
		this.platform=platform;
	}

    public String getPlatform(){
    	return this.platform;
    }
    
    public void setScene(String scene){
		this.scene=scene;
	}

    public String getScene(){
    	return this.scene;
    }
    
    public void setExtParams(String extParams){
		this.extParams=extParams;
	}

    public String getExtParams(){
    	return this.extParams;
    }
    
	public String getApiMethodName() {
		return "zhima.data.batch.feedback";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("biz_ext_params", this.bizExtParams);
		txtParams.put("columns", this.columns);
		txtParams.put("file_charset", this.fileCharset);
		txtParams.put("file_description", this.fileDescription);
		txtParams.put("file_type", this.fileType);
		txtParams.put("primary_key_columns", this.primaryKeyColumns);
		txtParams.put("records", this.records);
		txtParams.put("type_id", this.typeId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new ZhimaHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
		return params;
	}

	public Class<ZhimaDataBatchFeedbackResponse> getResponseClass() {
		return ZhimaDataBatchFeedbackResponse.class;
	}
}
