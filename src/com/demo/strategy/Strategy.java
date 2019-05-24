package com.demo.strategy;

/**
 * Strategy:策略接口
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
