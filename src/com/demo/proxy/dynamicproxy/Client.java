package com.demo.proxy.dynamicproxy;

import java.lang.reflect.Proxy;
/**
 * Client:客户端   测试动态代理
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class Client {
	public static void main(String[] args) {
		System.out.println("----------测试的动态代理-----------");
		Star realStar = new RealStar();
		//代理类
		StarHandler handler = new StarHandler(realStar);
		//利用JDK生成代理对象
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		proxy.sing();
	}
}