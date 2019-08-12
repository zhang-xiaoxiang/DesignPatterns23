package com.demo.singleton;

/**
 * SingletonDemo2:单例模式---懒汉式
 * 优点:延迟加载(资源利用合理)
 * 缺点:线程不安全
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo2 {

    /**
     * 1类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
     */
    private static SingletonDemo2 instance;

    /**
     * 2私有化构造器
     */
    private SingletonDemo2() {
    }

    /**
     * 3 提供获取实例方法
     * 方法同步(加锁synchronized)，调用效率低！
     * 为什么需要synchronized同步了?因为懒加载类初始化的时候没有及时new对象,所以试想一下,
     * 高并发下,无法确认那个先new 对象,保证不了单例,所以会导致线程不安全,因此必须加锁同步才行
     */
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

}

/**
 * Test02:单例模式---懒汉式  测试
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
