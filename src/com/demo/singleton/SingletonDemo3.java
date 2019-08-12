package com.demo.singleton;

/**
 * SingletonDemo3:单例模式---双重同步锁(懒汉模式衍生版本)
 * <p>
 * volatile作用：解决并发问题,以下会涉及到Java内存模型的知识
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo3 {
    /**
     * 1:初始化对象   使用volatile解决并发问题 单例对象 volatile + 双重检测机制 -> 禁止指令重排
     */
    private volatile static SingletonDemo3 instance = null;

    /**
     * 2:构造器私有化
     */
    private SingletonDemo3() {
    }

    /**
     * 3:提供获取单实例方法(就是个静态工厂方法哈)
     *
     * @return
     */
    public static SingletonDemo3 getInstance() {
        //第一重检查锁定
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                //第二重检查锁定
                if (instance == null) {
                    synchronized (SingletonDemo3.class) {
                        //注意:非原子操作
                        instance = new SingletonDemo3();
                    }
                }
            }
        }
        return instance;
    }
}

/**
 * Test03:双重检查锁测试
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
class Test03 {
    public static void main(String[] args) {
        SingletonDemo3 instance = SingletonDemo3.getInstance();
        SingletonDemo3 instance2 = SingletonDemo3.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        //true
        System.out.println(instance == instance2);
    }
}
