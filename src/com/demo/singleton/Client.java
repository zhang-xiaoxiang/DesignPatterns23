package com.demo.singleton;
/**
 * Client:客服端测试
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class Client {
	
	public static void main(String[] args) {
		SingletonDemo4 s1 = SingletonDemo4.getInstance();
		SingletonDemo4 s2 = SingletonDemo4.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(SingletonDemo5.INSTANCE==SingletonDemo5.INSTANCE);
		
		
	}
}
