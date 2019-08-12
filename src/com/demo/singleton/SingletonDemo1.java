package com.demo.singleton;

/**
 * SingletonDemo1:单例模式---饿汉式
 * 优点:线程安全
 * 缺点:没有延迟加载的优势(即容易咋成资源浪费)
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo1 {

    /**
     * 1 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的.这里使用的private封装对象(主要是安全层面的访
     *   问修饰符,和一般的属性封装为private是一样的,没有什么特别的意思)
     *   static修饰是为了实例化对象的时候的方便使用类名.方法名的方式得到这个类的单例对象
     */
    private static SingletonDemo1 instance = new SingletonDemo1();

    /**
     * 2 私有构造器(在本类的如果要继续new对象可以,private,public修饰构造器没有区别,但是外部调用该类,必须使用private修饰以防止外部
     * new出新对象,所以这里必须是private修饰构造器)
     */
    private SingletonDemo1() {
    }

    /**
     * 3 公开调用方法,方法没有同步(加锁)，调用效率高！(必须要提供给外部一个方法创建这个类的单例(唯一)对象的方法,因为第一步static修饰类属性的
     * (就是一个对象),所以这里也必须使用static修饰返回的对象)
     */
    public static SingletonDemo1 getInstance() {
        return instance;
    }

    //不要在本类使用main方法测试,因为本类private是控制不了为私有,所以在其他类测试哈
}

/**
 * test01:测试类,为了方便观察测试,直接写在这里测试
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
class Test01 {
    public static void main(String[] args) {
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        SingletonDemo1 instance2 = SingletonDemo1.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        //true
        System.out.println(instance == instance2);

    }
}
