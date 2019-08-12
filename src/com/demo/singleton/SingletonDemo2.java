package com.demo.singleton;

/**
 * SingletonDemo2:单例模式---懒汉式
 * 优点:延迟加载(资源利用合理,用的时候才new)
 * 缺点:synchronized加了线程相对安全效率低,不加线程不安全效率高
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo2 {

    /**
     * 1:类初始化(既然是懒汉式,那就懒得不急着new对象)
     */
    private static SingletonDemo2 instance;

    /**
     * 2:私有化构造器
     */
    private SingletonDemo2() {
    }

    /**
     * 3:提供获取单实例方法(静态工厂方法)
     * 这里加synchronized和不加是对线程安全的考虑,不加线程不安全,调用效率高一些,反之线程安全效率低
     * 这个地方可以优化,可以产生衍生版本,这个是屌丝版本哈
     */
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

}

/**
 * Test02:单例模式---懒汉式
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

class Test02 {
    public static void main(String[] args) {
        SingletonDemo2 instance = SingletonDemo2.getInstance();
        SingletonDemo2 instance2 = SingletonDemo2.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        //true
        System.out.println(instance == instance2);

    }

}
