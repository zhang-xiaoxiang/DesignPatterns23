package com.demo.strategy;
/**
 * VIP0Strategy:普通会员策略
 *
 * @author zhangxiaoxiang
 * @date: 2019/05/24
 */
public class VIP0Strategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("普通会员 原价:"+standardPrice);
		return standardPrice;
	}

}
