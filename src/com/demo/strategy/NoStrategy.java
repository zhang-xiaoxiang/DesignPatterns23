package com.demo.strategy;

/**
 * NoStrategy:没有策略的做法
 * 实现起来比较容易，符合一般开发人员的思路
 * 假如，类型特别多，算法比较复杂时，整个条件语句的代码就变得很长，难于维护。
 * 如果有新增类型，就需要频繁的修改此处的代码！
 * 不符合开闭原则！
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

		if (type.equals("普通客户小批量")) {
			System.out.println("不打折,原价");
			return price;
		} else if (type.equals("普通客户大批量")) {
			System.out.println("打九折");
			return price * 0.9;
		} else if (type.equals("老客户小批量")) {
			System.out.println("打八折");
			return price * 0.8;
		} else if (type.equals("老客户大批量")) {
			System.out.println("打七折");
			return price * 0.7;
		}
		return price;
	}

}
