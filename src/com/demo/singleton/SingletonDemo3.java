package com.demo.singleton;

/**
 * SingletonDemo3:单例模式双重检查锁实现---懒汉模式衍生版本  volatile
 * volatile作用：以下会涉及到Java内存模型的知识
 * 禁止指令重排序。
 * 我们知道new Singleton()是一个非原子操作，编译器可能会重排序【构造函数可能在整个对象初始化完成前执行完毕，
 * 即赋值操作（只是在内存中开辟一片存储区域后直接返回内存的引用）在初始化对象前完成】。
 * 而线程B在线程A赋值完时判断instance就不为null了，此时B拿到的将是一个没有初始化完成的半成品。
 * 保证可见性。
 * 线程A在自己的工作线程内创建了实例，但此时还未同步到主存中；此时线程B在主存中判断instance还是null，
 * 那么线程B又将在自己的工作线程中创建一个实例，这样就创建了多个实例。
 * 顺便提一下，volatile禁止指令重排序只能保证volatile修饰的代码之后的代码不会在它之前执行。
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo3 {
    /**
     * 1:初始化对象null  volatile解决并发问题
     */
    private volatile static SingletonDemo3 instance = null;

    /**
     * 2:构造器私有化
     */
    private SingletonDemo3() {
    }

    /**
     * 3:提供获取单实例方法
     *
     * @return
     */
    public static SingletonDemo3 getInstance() {
        //第一重检查锁定
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        //第二重检查锁定
                        if (sc == null) {
                            //注意:非原子操作
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
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
