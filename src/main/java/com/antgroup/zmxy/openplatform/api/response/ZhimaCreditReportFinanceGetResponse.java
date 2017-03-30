package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.report.finance.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-22 17:41:59
 */
public class ZhimaCreditReportFinanceGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5181534141582919847L;

	/** 
	 * 近1年常用收货地址数：
1个 - A 
2个 - B 
3个 - C 
4个及以上 - D 
缺失值 - N
	 */
	@ApiField("address_count")
	private String addressCount;

	/** 
	 * 地址稳定性时长：
A     5年及以上 
B     3（含）~5年
C    1（含）~3年
D    1年以内 
N    缺失值
	 */
	@ApiField("address_stability")
	private String addressStability;

	/** 
	 * 反映最近1年的支付宝账号活跃情况：
190及以上 - A 
85~189 - B 
30~84 - C 
1~29 - D 
缺失值或0 - N
	 */
	@ApiField("alipay_activity")
	private String alipayActivity;

	/** 
	 * 最近1年的支付宝平台的相关细分业务场景的活跃情况：
9个及以上 - A 
6~8个 - B 
3~5个 - C 
1~2个 - D 
缺失值或0 - N
	 */
	@ApiField("alipay_scene")
	private String alipayScene;

	/** 
	 * 活动区域稳定性
1个 - A 
2个 - B 
3个 - C 
4个及以上 - D 
缺失值 - N
	 */
	@ApiField("area_stability")
	private String areaStability;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 根据近1年的消费金额、类目、商品等推断整体消费档次并分层：
8及以上 - A 
6（含）~8 - B 
4（含）~6 - C 
4以内 - D 
缺失值 - N
	 */
	@ApiField("consume_level")
	private String consumeLevel;

	/** 
	 * 最近1年的月消费水平的持续性、稳定性水平：
0（不含）~0.5 - A 
0.5（含）~1 - B 
1（含）~2 - C 
2及以上 - D
	 */
	@ApiField("consume_stability")
	private String consumeStability;

	/** 
	 * 和用户资金往来最密切的人群的平均芝麻信用评分:
700及以上 - A
650（含）~700 - B
600（含）~650 - C
550（含）~600 - D
550（不含）以下 - N
	 */
	@ApiField("contacts_credit")
	private String contactsCredit;

	/** 
	 * 反映最近1年的用户人脉关系的变动情况:
80%及以上 - A
50%（含）~80% - B
20%（含）~50% - C
0%（含）~20% - D
缺失值 - N(2%)
	 */
	@ApiField("contacts_stability")
	private String contactsStability;

	/** 
	 * 用户绑定信用卡账户的历史时长：
3年及以上 - A 
2年（含）~3年 - B 
1年（含）~2年 - C 
1年以内 - D
缺失值 - N
	 */
	@ApiField("credit_history")
	private String creditHistory;

	/** 
	 * 法院执行网公布的失信被执行人名单
	 */
	@ApiField("deadbeat")
	private Boolean deadbeat;

	/** 
	 * 用户在具体的信用交易场景下，产生信用交易并完成正常履约。这些场景包括：免押金租车、信用贷款、消费分期、小额消费现金贷款等：
2个及以上 - A 
1个 - B 
缺失值 - N
	 */
	@ApiField("honesty_scene")
	private String honestyScene;

	/** 
	 * 兴趣标签，如：宠物一族、花卉一族等
	 */
	@ApiField("interest")
	private String interest;

	/** 
	 * 近1年曾用手机号码数：
A    1个
B    2个
C    3个  
D    4个及以上  
N    缺失值
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/** 
	 * 手机稳定性：
A     5年及以上 
B     3（含）~5年
C     1（含）~3年
D     1年以内
N     缺失值
	 */
	@ApiField("mobile_stability")
	private String mobileStability;

	/** 
	 * 最近1年的月均水费、电费、煤气费等公用事业费的消费分层:
500及以上 - A 
300（含）~500 - B 
200（含）~300 - C 
100（含）~200 - E 
0（不含）~100 - D 
缺失值或0 - N
	 */
	@ApiField("pay_level")
	private String payLevel;

	/** 
	 * 用户是否发生过实名消费场景下的支付交易，如购买机票、预定酒店、购买彩票等
	 */
	@ApiField("realname_consume")
	private Boolean realnameConsume;

	/** 
	 * 根据资金往来关系，按照影响力算法推断的用户的社会交往及社会关系的影响能力指数:
30及以上 - A 
20（含）~30 - B 
10（含）~20 - C 
5（含）~10 - D 
缺失值或0（含）~N
	 */
	@ApiField("sns_influence")
	private String snsInfluence;

	public void setAddressCount(String addressCount) {
		this.addressCount = addressCount;
	}
	public String getAddressCount( ) {
		return this.addressCount;
	}

	public void setAddressStability(String addressStability) {
		this.addressStability = addressStability;
	}
	public String getAddressStability( ) {
		return this.addressStability;
	}

	public void setAlipayActivity(String alipayActivity) {
		this.alipayActivity = alipayActivity;
	}
	public String getAlipayActivity( ) {
		return this.alipayActivity;
	}

	public void setAlipayScene(String alipayScene) {
		this.alipayScene = alipayScene;
	}
	public String getAlipayScene( ) {
		return this.alipayScene;
	}

	public void setAreaStability(String areaStability) {
		this.areaStability = areaStability;
	}
	public String getAreaStability( ) {
		return this.areaStability;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setConsumeLevel(String consumeLevel) {
		this.consumeLevel = consumeLevel;
	}
	public String getConsumeLevel( ) {
		return this.consumeLevel;
	}

	public void setConsumeStability(String consumeStability) {
		this.consumeStability = consumeStability;
	}
	public String getConsumeStability( ) {
		return this.consumeStability;
	}

	public void setContactsCredit(String contactsCredit) {
		this.contactsCredit = contactsCredit;
	}
	public String getContactsCredit( ) {
		return this.contactsCredit;
	}

	public void setContactsStability(String contactsStability) {
		this.contactsStability = contactsStability;
	}
	public String getContactsStability( ) {
		return this.contactsStability;
	}

	public void setCreditHistory(String creditHistory) {
		this.creditHistory = creditHistory;
	}
	public String getCreditHistory( ) {
		return this.creditHistory;
	}

	public void setDeadbeat(Boolean deadbeat) {
		this.deadbeat = deadbeat;
	}
	public Boolean getDeadbeat( ) {
		return this.deadbeat;
	}

	public void setHonestyScene(String honestyScene) {
		this.honestyScene = honestyScene;
	}
	public String getHonestyScene( ) {
		return this.honestyScene;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterest( ) {
		return this.interest;
	}

	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}
	public String getMobileCount( ) {
		return this.mobileCount;
	}

	public void setMobileStability(String mobileStability) {
		this.mobileStability = mobileStability;
	}
	public String getMobileStability( ) {
		return this.mobileStability;
	}

	public void setPayLevel(String payLevel) {
		this.payLevel = payLevel;
	}
	public String getPayLevel( ) {
		return this.payLevel;
	}

	public void setRealnameConsume(Boolean realnameConsume) {
		this.realnameConsume = realnameConsume;
	}
	public Boolean getRealnameConsume( ) {
		return this.realnameConsume;
	}

	public void setSnsInfluence(String snsInfluence) {
		this.snsInfluence = snsInfluence;
	}
	public String getSnsInfluence( ) {
		return this.snsInfluence;
	}

}
