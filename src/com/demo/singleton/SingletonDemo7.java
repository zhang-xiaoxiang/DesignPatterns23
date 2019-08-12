package com.demo.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * SingletonDemo7:单例模式---防止反射和反序列化漏(懒汉式衍生版本2)
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class SingletonDemo7 implements Serializable {
	/**
	 * 1类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	 */
	private static SingletonDemo7 instance;

	/**
	 * 2私有化构造器
	 */
	private SingletonDemo7(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}

	/**
	 * 3:提供一个单实例方法,方法同步，调用效率低！
	 * @return
	 */
	public static  synchronized SingletonDemo7 getInstance(){
		if(instance==null){
			instance = new SingletonDemo7();
		}
		return instance;
	}

	/**
	 * 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}

}
/**
 * Test06:防止反射和反序列化漏测试
 *
 * @author zhangxiaoxiang
 * @date 2019/8/12
 */
class Test07{
	public static void main(String[] args) {
		SingletonDemo7 instance = SingletonDemo7.getInstance();
		SingletonDemo7 instance2 = SingletonDemo7.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
		//true
		System.out.println(instance==instance2);
	}
}
