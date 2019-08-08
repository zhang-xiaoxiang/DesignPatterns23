package com.demo.strategy;
/**
 * VIP2Strategy:二级会员策略
 * @author zhangxiaoxiang
 * @date 2019/5/24
 */
public class VIP2Strategy implements Strategy {
	/**
	 * 输入一个价格,经过VIP2Strategy策略计算价格
	 * @param standardPrice
	 * @return
	 */
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("[策略模式]二级会员八折:"+standardPrice*0.8);
		return standardPrice*0.8;
	}

}
