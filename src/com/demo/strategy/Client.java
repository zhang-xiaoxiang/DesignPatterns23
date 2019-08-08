package com.demo.strategy;
/**
 * Client:策略模式客户端---测试
 *
 * @author zhangxiaoxiang
 * @date: 2019/05/24
 */
public class Client {
	public static void main(String[] args) {

		System.out.println("测试策略1-----------------------------------------");
		/**
		 * 多态写法,左边接口接收,右边实现类(策略)
		 */
		Strategy vip0Strategy = new VIP0Strategy();
		/**
		 * 策略上下文只需要策略即可,比如VIP0Strategy()策略,就是普通用户就原价,兵来将挡水来土掩,见人说人话,见鬼说鬼话
		 */
		Context context0=new Context(vip0Strategy);
		/**
		 * 通过策略计算出价格
		 */
		vip0Strategy.getPrice(1000);

		System.out.println("测试策略2-----------------------------------------");
		Strategy vip1Strategy = new VIP1Strategy();
		Context context1 = new Context(vip1Strategy);
		vip1Strategy.getPrice(1000);
		System.out.println("怎么体现策略模式呢?现在需求是增加一种会员机制,老客户特大批量,那么显然打折力度更大," +
				"我们设置为6折,分别在未使用策略模式和使用了策略模式的基础上拓展,看那个更加易于拓展,方便维护");





	}
}
