package com.antgroup.zmxy.openplatform.api.request;

import java.util.Map;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaMerchantImageUploadResponse;

/**
 * ALIPAY API: zhima.merchant.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 14:53:50
 */
public class ZhimaMerchantImageUploadRequest implements ZhimaRequest<ZhimaMerchantImageUploadResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片的二进制内容,最大支持2M，需要对图片的二进制流做Base64处理转化成字符串
	 */
	private String imageContent;

	/** 
	* 芝麻二级商户图标后缀：bmp, jpg, jpeg, png, gif
	 */
	private String imageType;

	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}
	public String getImageContent() {
		return this.imageContent;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType() {
		return this.imageType;
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
		return "zhima.merchant.image.upload";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("image_content", this.imageContent);
		txtParams.put("image_type", this.imageType);
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

	public Class<ZhimaMerchantImageUploadResponse> getResponseClass() {
		return ZhimaMerchantImageUploadResponse.class;
	}
}
