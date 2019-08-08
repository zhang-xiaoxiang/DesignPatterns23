package com.demo.strategy;

/**
 * Strategy:策略接口
 * 这个是对类NoStrategy改成面向接口的方式实现策略,不要像NoStrategy一样,
 * 直接写死策略的实现,而是使用这个接口先定义策略,功能实现后面再说
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
