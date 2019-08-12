package com.demo.singleton;


/**
 * SingletonDemo6:单例模式---枚举模式
 *
 * 优点:线程最安全
 *
 * @author zhangxiaoxiang
 * @date 2019/8/12
 */

public class SingletonDemo6 {
    /**
     * 1:初始化
     */
    private enum Singleton {
        /**
         * 枚举实例
         */
        INSTANCE;

        private SingletonDemo6 singleton;

        /**
         * JVM保证这个方法绝对只调用一次
         */
        Singleton() {
            singleton = new SingletonDemo6();
        }

        public SingletonDemo6 getInstance() {
            return singleton;
        }
    }

    /**
     * 2:私有构造函数
     */
    private SingletonDemo6() {
    }

    /**
     * 3:提供一个获取单实例的方法
     *
     * @return
     */
    public static SingletonDemo6 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

}

/**
 * Test06:枚举单例测试2
 *
 * @author zhangxiaoxiang
 * @date 2019/8/12
 */

class Test06 {
    public static void main(String[] args) {
        SingletonDemo6 instance = SingletonDemo6.getInstance();
        SingletonDemo6 instance2 = SingletonDemo6.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        //true
        System.out.println(instance == instance2);
    }
}
