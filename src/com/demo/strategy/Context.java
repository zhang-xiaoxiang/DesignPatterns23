package com.demo.strategy;

/**
 * Context:策略模式上下文---策略接收器,专门接收策略实现的算法
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化。
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同策略对象，动态的切换不同的算法.
 * @author zhangxiaoxiang
 * @date: 2019/05/24
 */
public class Context {
	/**
	 * 当前采用的算法对象
	 * 面向接口,组合编程,少用继承
	 * 简言之复杂类型(类,接口等)做属性
	 */
	private Strategy strategy;

	/**
	 * 选择策略Strategy实现类
	 * 有参构造器(不写无参构造器,那么new 策略实现保证必须传一种策略,这里set方法也不用设置,
	 * 设置了也没用(要设置set方法那么还是把无参构造也写出来才会有用,所以set伴随无参构造的感觉)
	 * 这样同时也知道了为什么有参构造器设置了为什么无参构造器就失效了,JDK这样设计是有一定道理的,哈哈)
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public double getReultPrice(double price){
		return this.strategy.getPrice(price);
	}
}
