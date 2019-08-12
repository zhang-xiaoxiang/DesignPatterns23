package com.demo.singleton;
/**
 * SingletonDemo4:单例模式---静态内部类(饿汉模式衍生版本)
 *
 * (推荐使用)
 * 优点：线程安全，并且实现了延时加载(调用效率高)！
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo4 {
	/**
	 * 1:初始化对象(使用的静态内部类方式)
	 */
	private static class SingletonClassInstance {
		private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
	}

	/**
	 * 2:构造器私有化
	 */
	private SingletonDemo4(){
	}

	/**
	 * 3提供获取实例的方法,该方法没有同步，调用效率高！
	 * @return
	 */
	public static SingletonDemo4  getInstance(){
		return SingletonClassInstance.INSTANCE;
	}
}

/**
 * Test04:静态内部类实现单例模式测试
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
class Test04 {
	public static void main(String[] args) {
		SingletonDemo4 instance = SingletonDemo4.getInstance();
		SingletonDemo4 instance2 = SingletonDemo4.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
		//true
		System.out.println(instance == instance2);
	}
}

