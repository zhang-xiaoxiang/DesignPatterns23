package com.demo.strategy;

/**
 * NoStrategy:没有策略的做法
 * 实现起来比较容易，符合一般开发人员的思路
 * 假如，类型特别多，算法比较复杂时，整个条件语句的代码就变得很长，难于维护。
 * 如果有新增类型，就需要频繁的修改此处的代码！
 * 不符合开闭原则！---对这个类的修改要关闭,就是这个类要是写好了就不要去改他了,对类的功能的拓展要开放,显然只有面向接口编程才满足,
 * 所以策略模式Strategy这个接口(文中涉及到的)就应运而生了晒哈哈哈
 * @author zhangxiaoxiang
 * @date: 2019/05/24
 */
public class NoStrategy {
	/**
	 * 传入客服等级类型获取相应的价格
	 * @param type   会员类型(等级)
	 * @param price  响应的价格
	 * @return
	 */
	public double getPrice(String type, double price) {

		if ("普通客户小批量".equals(type)) {
			System.out.println("[未采用设计模式] 不打折,原价");
			return price;
		} else if ("普通客户大批量".equals(type)) {
			System.out.println("[未采用设计模式] 打九折");
			return price * 0.9;
		} else if ("老客户小批量".equals(type)) {
			System.out.println("[未采用设计模式] 打八折");
			return price * 0.8;
		} else if ("老客户大批量".equals(type)) {
			System.out.println("[未采用设计模式] 打七折");
			return price * 0.7;


		//拓展一种策略
		}else if("老客户特大批量".equals(type)){
			System.out.println("[未采用设计模式] 打六折");
			return price*0.6;
		}


		//乱传的也是当普通客户小批量(就是不打折)
		return price;
	}

}
