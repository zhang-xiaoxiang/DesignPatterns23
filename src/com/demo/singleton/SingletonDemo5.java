package com.demo.singleton;

/**
 * SingletonDemo5:单例模式---枚举实现
 *
 * 优点:这个是线程最安全,抗并发能力最强的
 * 缺点:没有延时加载
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public enum SingletonDemo5 {

	/**
	 * 这个枚举元素，本身就是单例对象！天然单例
	 */
	INSTANCE;

	/**
	 * 添加自己需要的操作！
	 */
	public void singletonOperation(){
		System.out.println("枚举是天生的单例!");
	}
}

/**
 * Test05:枚举式实现单例模式测试
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
class Test05 {
	public static void main(String[] args) {
		SingletonDemo5 instance=SingletonDemo5.INSTANCE;
		SingletonDemo5 instance2=SingletonDemo5.INSTANCE;
		System.out.println(instance);
		System.out.println(instance2);
		//true
		System.out.println(instance==instance2);
	}
}

