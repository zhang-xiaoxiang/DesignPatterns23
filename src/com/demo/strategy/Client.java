package com.demo.strategy;
/**
 * Client:策略模式客户端
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

	}
}
