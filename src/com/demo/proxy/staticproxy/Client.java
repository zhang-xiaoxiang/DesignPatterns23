package com.demo.proxy.staticproxy;
/**
 * Client:客户端   静态代理测试
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class Client {
	public static void main(String[] args) {
		System.out.println("----------------------测试静态代理-------------------");
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();

		//这里代理对象持有真实对象的一切,比如让代理的真实对象周杰伦唱歌,对周杰伦这个对象来说,他功能增强了,
		//上面的操作和下面的操作都算增强
		proxy.sing();

		proxy.collectMoney();
		
	}
}
