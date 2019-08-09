package com.demo.decorator;

/**
 * Client:装饰器测试
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------------来一个常规无装饰的操作------------------------");
        Car car = new Car();
        car.move();

        System.out.println("------------------增加新的功能，飞行---------------------------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("------------------增加新的功能，水里游--------------------------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("------------------增加两个新的功能，飞行，水里游-----------------");
        //这里也可以叫包装2下
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

//		JDK使用装饰器,下面的写法是不是很熟悉
//		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));

    }
}
