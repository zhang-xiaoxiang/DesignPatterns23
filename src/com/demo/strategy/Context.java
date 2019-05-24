package com.demo.strategy;

/**
 * Context:策略模式上下文
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
	 */
	private Strategy strategy;

	/**
	 * 可以通过构造器来注入
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	/**
	 * 可以通过set方法来注入
	 * @param strategy
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void printPrice(double s){
		System.out.println("您该报价："+strategy.getPrice(s));
	}
	
	
}
