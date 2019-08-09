package com.demo.proxy.dynamicproxy;
/**
 * RealStar:一个真实的实现类,需要代理接口的所有行为
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class RealStar implements Star {

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }


}
