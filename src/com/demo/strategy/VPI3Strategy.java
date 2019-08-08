package com.demo.strategy;
/**
 * VPI3Strategy:三级会员策略
 * @author zhangxiaoxiang
 * @date 2019/5/25
 */
public class VPI3Strategy implements Strategy {
	/**
	 * 输入一个价格,经过VIP3Strategy策略计算价格
	 * @param standardPrice
	 * @return
	 */
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("三级会员七折:"+standardPrice*0.7);
		return standardPrice*0.7;
	}

}
