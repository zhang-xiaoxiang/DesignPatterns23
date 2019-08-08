package com.demo.strategy;

/**
 * Client:策略模式客户端---测试
 *
 * @author zhangxiaoxiang
 * @date: 2019/05/24
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("未使用模式-----------------------------------------");
        NoStrategy noStrategy=new NoStrategy();
        double price = noStrategy.getPrice("普通客户大批量", 1000);
        System.out.println(price);
        System.out.println("\n测试策略------------------------------------------");
        Context context0 = new Context(new VIP1Strategy());
        double resultPrice = context0.getReultPrice(1000);
        System.out.println(resultPrice);


        System.out.println("\n---怎么体现策略模式呢?比如现在需求是增加一种会员机制,  '老客户特大批量'  ,\n那么显然打折力度更大," +
                "我们设置为6折,分别在未使用策略模式和使用了策略模式的基础上拓展,看那个更加易于拓展,方便维护---\n");

        //首先这这里,作为客户端只能够传入 "老客户特大批量" 和价格1000元,但是计算代码再服务器NoStrategy类里面,如果不去修改服务器NoStrategy
        //	那么这里是无法实现的,策略模式也是一样的,那么回到服务器端思考,不用设计模式就要修改NoStrategy里面的if else之类的代码,使用策略模式
        //    就要增加新的策略实现,其实差不太多

        //新增策略后未使用模式(会修该策略核心类)
        NoStrategy noStrategy1=new NoStrategy();
        double price1 = noStrategy1.getPrice("老客户特大批量", 1000);
        System.out.println(price1);



        //新增策略后使用模式(不会修改策略接口,只是添加一个实现)
        Context context2=new Context(new VPI4Strategy()) ;
        double price2 = context2.getReultPrice(1000);
        System.out.println(price2);


        System.out.println("\n结论:修改服务器端已经写好了的类是极其不好的维护形式,因为这个类NoStrategy" +
                "\n可能在别的类中作为依赖或者叫做别的类引用了该类,在不明确的情况下,可能牵一发动全身,是不好的维护方式,使用了策略模式," +
                "\n我们对只是添加了一个策略接口的实现,低侵入式,不会对已有代码造成影响,低耦合");


    }
}
