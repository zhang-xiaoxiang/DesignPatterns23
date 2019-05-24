package com.demo.strategy;
/**
 * VPI3Strategy:三级会员策略
 * @author zhangxiaoxiang
 * @date 2019/5/25
 */
public class VPI3Strategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("三级会员七折:"+standardPrice*0.7);
		return standardPrice*0.7;
	}

}
