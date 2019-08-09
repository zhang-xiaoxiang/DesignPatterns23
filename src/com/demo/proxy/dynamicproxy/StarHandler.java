package com.demo.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * StarHandler:这是一个对JDK调用处理器的实现类,用于被代理的一个类,利用这个类可以JDK为其生成一个代理对象
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class StarHandler implements InvocationHandler {
	/**
	 * 这里仍然是要代理接口的,相当于唱歌业务流程始终是要有公司接单,实现演唱会,只是这里不是代理类直接接单
	 * 由评审团StarHandler来评估先代理
	 */
	Star realStar;

	/**
	 * 构造方法注入"演唱会订单"
	 * @param realStar
	 */
	public StarHandler(Star realStar) {
		this.realStar = realStar;
	}

	/**
	 * 重写JDK代理方法(使用反射生成响应对象)
	 * @param proxy 评估后具备代理资格的代理公司对象
	 * @param method 方法(真是对象需要执行的操作,唱歌)
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 评估后具备代理资格的代理公司对象
		Object object = null;
		
		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");

		//用反射的方式获取方法名称
		if(method.getName().equals("sing")){
			object = method.invoke(realStar, args);
		}
		
		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		return object;
	}

}
