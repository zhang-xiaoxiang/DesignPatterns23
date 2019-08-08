package com.demo.strategy;

/**
 * Strategy:策略接口,这个是返回价格的策略,不同的VIP等级需要返回不同的价格,那么就需要不同的实现
 * @author zhangxiaoxiang
 * @date 2019/5/24
 */
public interface Strategy {
	/**
	 * 通过策略获取价格
	 * @param standardPrice
	 * @return
	 */
	 double getPrice(double standardPrice);
}
