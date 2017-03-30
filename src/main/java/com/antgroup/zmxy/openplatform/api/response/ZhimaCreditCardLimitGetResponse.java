package com.antgroup.zmxy.openplatform.api.response;

import java.util.List;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiListField;
import com.antgroup.zmxy.openplatform.api.domain.ZmWatchListDetail;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;

/**
 * ALIPAY API: zhima.credit.card.limit.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-12 10:47:59
 */
public class ZhimaCreditCardLimitGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 4634798437181535521L;

	/** 
	 * 地址稳定性时长
5*365天及以上 - A 
3*365天（含）~5*365天 - B 
1*365天（含）~3*365天 - C 
1*365天 - D 
缺失值或0 - #
	 */
	@ApiField("address_stability")
	private String addressStability;

	/** 
	 * 支付宝账户活跃度
190及以上 - A 
85~189 - B 
30~84 - C 
1~29 - D 
缺失值或0 - #
	 */
	@ApiField("alipay_activity")
	private String alipayActivity;

	/** 
	 * 近1年支付宝活跃场景数
9个及以上 - A 
6~8个 - B 
3~5个 - C 
1~2个 - D 
缺失值或0 - #
	 */
	@ApiField("alipay_scene")
	private String alipayScene;

	/** 
	 * 活动区域稳定度
1个 - A 
2个 - B 
3个 - C 
4个及以上 - D 
缺失值或0 - #
	 */
	@ApiField("area_stability")
	private String areaStability;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 预测资产水平（还款能力）
A	0
B	(0，200]
C	(200,400]
D	(400,600]
E	(600,800]
F	(800,1000]
G	(1000,1500]
H	(1500,2000]
I	(2000,3000]
J	(3000,4000]
K	(4000,5000]
L	(5000,10000]
M	(10000,HIGH)?
#	未知
	 */
	@ApiField("capital_fund")
	private String capitalFund;

	/** 
	 * 消费档次
8及以上 - A 
6（含）~8 - B 
4（含）~6 - C 
4以内 - D 
缺失值或0 - #
	 */
	@ApiField("consume_level")
	private String consumeLevel;

	/** 
	 * 高端类目交易客户
0	否
1	是
#	未知
	 */
	@ApiField("consume_luxury")
	private String consumeLuxury;

	/** 
	 * 预测月交易水平
A	0
B	(0，200]
C	(200,400]
D	(400,600]
E	(600,800]
F	(800,1000]
G	(1000,1500]
H	(1500,2000]
I	(2000,3000]
J	(3000,4000]
K	(4000,5000]
L	(5000,10000]
M	(10000,HIGH)
#	未知
	 */
	@ApiField("consume_monthly")
	private String consumeMonthly;

	/** 
	 * 预测笔均交易水平
A	0
B	(0，100]
C	(100,200]
D	(200,400]
E	(400,600]
F	(600,800]
G	(800,1000]
H	(1000,1500]
I	(1500,2000]
J	(2000,HIGH]
#	未知
	 */
	@ApiField("consume_single")
	private String consumeSingle;

	/** 
	 * 消费稳定度
0（不含）~0.5 - A 
0.5（含）~1 - B 
1（含）~2 - C 
2及以上 - D 
缺失值或0 - #
	 */
	@ApiField("consume_stability")
	private String consumeStability;

	/** 
	 * 近1年人脉圈稳定度
80%及以上 - A
50%（含）~80% - B
20%（含）~50% - C
0%（含）~20% - D
缺失值 - #(2%)
	 */
	@ApiField("contacts_stability")
	private String contactsStability;

	/** 
	 * 信用账户历史时长
3*365天及以上 - A 
2*365天（含）~3*365天 - B 
1*365天（含）~2*365天 - C 
1*365天以内 - D 
缺失值或0 - #
	 */
	@ApiField("credit_history")
	private String creditHistory;

	/** 
	 * 客户分群标识
1	无资金变动历史 and 注册时间小于3个月
2	无资金变动历史 and 注册时间大于等于3个月
3	有资金变动历史 and 近6个月无交易
4	有资金变动历史 and 注册时间小于3个月 and 近6个月交易次数小于3次
5	有资金变动历史 and 注册时间小于3个月 and 近6个月交易次数大于等于3次
6	有资金变动历史 and 注册时间大于等于3个月 and 近6个月交易次数小于6次
7	有资金变动历史 and 注册时间大于等于3个月小于6个月 and 近6个月交易次数大于等于6次
8	有资金变动历史 and 注册时间大于等于6个月 and 近6个月交易次数大于等于6次                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
#	未知
	 */
	@ApiField("cust_level")
	private String custLevel;

	/** 
	 * 是否法院老赖名单
是 - Y
否 - N
缺失值 - #
	 */
	@ApiField("deadbeat")
	private String deadbeat;

	/** 
	 * 已履约的信用场景数
2个及以上 - A 
1个 - B 
缺失值或0 - #
	 */
	@ApiField("honesty_scene")
	private String honestyScene;

	/** 
	 * 兴趣标签
如：宠物一族、花卉一族等
一个用户最多输出3个标签
	 */
	@ApiField("interest")
	private String interest;

	/** 
	 * 最近一年使用手机号码数
1个 - A 
2个 - B 
3个 - C 
4个及以上 - D 
缺失值或0 - #
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/** 
	 * 手机号稳定天数
5*365天及以上 - A 
3*365天（含）~5*365天 - B 
1*365天（含）~3*365天 - C 
1*365天以内 - D 
缺失值或0 - #
	 */
	@ApiField("mobile_stability")
	private String mobileStability;

	/** 
	 * 生活缴费层次
500及以上 - A 
300（含）~500 - B 
100（含）~300 - C
0（不含）~100 - D 
缺失值或0 - #
	 */
	@ApiField("pay_level")
	private String payLevel;

	/** 
	 * 社交影响力
30及以上 - A 
20（含）~30 - B 
10（含）~20 - C 
0（不含）~10 - D 
缺失值或0 - #
	 */
	@ApiField("sns_influence")
	private String snsInfluence;

	/** 
	 * 行业信息清单
	 */
	@ApiListField("watch_list")
	@ApiField("zm_watch_list_detail")
	private List<ZmWatchListDetail> watchList;

	/** 
	 * 用户芝麻信用分
350~950	从350到950之间的整数
#	未知
	 */
	@ApiField("zm_score")
	private String zmScore;

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

	public void setCapitalFund(String capitalFund) {
		this.capitalFund = capitalFund;
	}
	public String getCapitalFund( ) {
		return this.capitalFund;
	}

	public void setConsumeLevel(String consumeLevel) {
		this.consumeLevel = consumeLevel;
	}
	public String getConsumeLevel( ) {
		return this.consumeLevel;
	}

	public void setConsumeLuxury(String consumeLuxury) {
		this.consumeLuxury = consumeLuxury;
	}
	public String getConsumeLuxury( ) {
		return this.consumeLuxury;
	}

	public void setConsumeMonthly(String consumeMonthly) {
		this.consumeMonthly = consumeMonthly;
	}
	public String getConsumeMonthly( ) {
		return this.consumeMonthly;
	}

	public void setConsumeSingle(String consumeSingle) {
		this.consumeSingle = consumeSingle;
	}
	public String getConsumeSingle( ) {
		return this.consumeSingle;
	}

	public void setConsumeStability(String consumeStability) {
		this.consumeStability = consumeStability;
	}
	public String getConsumeStability( ) {
		return this.consumeStability;
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

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustLevel( ) {
		return this.custLevel;
	}

	public void setDeadbeat(String deadbeat) {
		this.deadbeat = deadbeat;
	}
	public String getDeadbeat( ) {
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

	public void setSnsInfluence(String snsInfluence) {
		this.snsInfluence = snsInfluence;
	}
	public String getSnsInfluence( ) {
		return this.snsInfluence;
	}

	public void setWatchList(List<ZmWatchListDetail> watchList) {
		this.watchList = watchList;
	}
	public List<ZmWatchListDetail> getWatchList( ) {
		return this.watchList;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
