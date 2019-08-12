package com.demo.singleton;

/**
 * SingletonDemo1:单例模式---饿汉式
 *
 * 优点:线程安全
 * 缺点:没有延迟加载的优势(即容易造成不分青红皂白new了个可能暂时无用的单例对象从而造成资源浪费)
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class SingletonDemo1 {

    /**
     * 1 类初始化(既然是饿汉那么上来就new了再说呗)
     * 这里说明一下为什么声明成static,1是语法要求Non-static field 'instance' cannot be referenced from a static context,
     * 为了给外部提供一个不是new出实例的方法,采用的是提供一个静态方法getInstance(),静态方法调动的必须是静态的变量;2是让外部不能以任何方式引用this 或super
     * 总之就是被迫的使用static,记住就行了哈
     */
    private static SingletonDemo1 instance = new SingletonDemo1();

    /**
     * 2 私有构造器
     * 这里说明一下private(在本类的如果要继续new对象可以,private,public修饰构造器没有区别,类的内部操作属性和方法统统具有可见性,
     * 但是外部调用该类,必须使用private修饰以防止外部new出新对象,所以这里必须是private修饰构造器,后面设计到的单例模式的其他方式都是这个操作,不在后文叙述)
     */
    private SingletonDemo1() {
    }

    /**
     * 3:提供获取单实例方法,方法没有同步(加锁)，调用效率高！
     * 说明一下,既然不让外部new对象,但是至少得给个方式让外部产生一个单实例吧,那么这里"被迫"使用静态方法,而且这也是最科学的
     */
    public static SingletonDemo1 getInstance() {
        return instance;
    }

    //强烈提示:不要在本类使用main方法测试,因为本类private是控制不了为私有,所以在其他类测试哈
}

/**
 * test01:测试类,为了方便观察测试,直接写在这里测试(也可以单独在外部写个测试类)
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
