package com.demo.decorator;

/**
 * ICar:抽象构建,面向接口编程,不管三七二十一,来个接口明确要干什么哈
 * 就是实现一个毫无装饰的移动的功能
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public interface ICar {
    /**
     * 毫无装饰的陆地上跑的功能
     */
    void move();
}

/**
 * 具体构件角色(真实对象),接口迟早要用于实现的,那这里车就来实现车子移动的接口
 */
class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}

/**
 * Decorator装饰角色
 */
class SuperCar implements ICar {
    /**
     * 子类需要使用,所以使用protected
     * 又是一个典型的接口做属性,典型的开闭原则
     */
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    /**
     * 原功能两保留
     */
    @Override
    public void move() {
        car.move();
    }
}

/**
 * ConcreteDecorator具体装饰角色
 */
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    /**
     * 这里进行装饰功能
     */
    public void fly() {
        System.out.println("天上飞！");
    }

    @Override
    public void move() {
        super.move();
        //拓展功能,装饰
        fly();
    }

}

/**
 * ConcreteDecorator具体装饰角色
 */
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    /**
     * 这里进行装饰功能
     */
    public void swim() {
        System.out.println("水上游！");
    }

    @Override
    public void move() {
        super.move();
        //拓展功能,装饰
        swim();
    }

}

/**
 * ConcreteDecorator具体装饰角色
 */
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    /**
     * 这里进行装饰功能
     */
    public void autoMove() {
        System.out.println("自动跑！");
    }

    @Override
    public void move() {
        super.move();
        //拓展功能,装饰
        autoMove();
    }

}



