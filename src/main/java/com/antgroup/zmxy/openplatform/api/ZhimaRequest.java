package com.antgroup.zmxy.openplatform.api;

import java.util.Map;

/**
 * 请求接口。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface ZhimaRequest<T extends ZhimaResponse> {

    /**
     * 获取TOP的API名称。
     * 
     * @return API名称
     */
    public String getApiMethodName();

    /**
     * 获取所有的Key-Value形式的文本请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数值</li>
     * </ul>
     * 
     * @return 文本请求参数集合
     */
    public Map<String, String> getTextParams();

    /**
     * 得到当前接口的版本
     * 
     * @return API版本
     */
    public String getApiVersion();

    /**
     * 设置当前API的版本信息
     * 
     * @param apiVersion API版本
     */
    public void setApiVersion(String apiVersion);

    /**
     * 获取渠道类型
     * 
     * @return 渠道类型
     */
    public String getChannel();

    /**
     * 设置渠道类型
     * 
     * @param channel 渠道类型
     */
    public void setChannel(String channel);

    /**
     * 获取调用平台（zmop, top, aop等，默认为zmop）
     * 
     * @return 调用平台
     */
    public String getPlatform();

    /**
     * 设置调用平台（zmop, top, aop等，默认为zmop）
     * 
     * @param platform 调用平台
     */
    public void setPlatform(String platform);

    /**
     * 获取场景信息
     * 
     * @return 场景
     */
    public String getScene();

    /**
     * 设置场景信息
     * 
     * @param scene 场景
     */
    public void setScene(String scene);

    /**
     * 获取系统级额外参数
     * 
     * @return 额外参数
     */
    public String getExtParams();

    /**
     * 设置系统级额外参数
     * 
     * @param extParams 额外参数
     */
    public void setExtParams(String extParams);

    /**
     * 得到当前API的响应结果类型
     * 
     * @return 响应类型
     */
    public Class<T> getResponseClass();

}
