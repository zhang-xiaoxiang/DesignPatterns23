package com.demo.proxy.staticproxy;

/**
 * RealStar:一个真实的实现类,需要代理接口的所有行为
 * (但是对歌手来说,除了唱歌,其他打杂的事情,面谈,签合同什么的都没有必要去做)
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class RealStar implements Star {
    /**
     * 面谈
     */
    @Override
    public void confer() {

        System.out.println("真实对象执行面谈===>RealStar.confer()");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        System.out.println("真实对象执行签合同===>RealStar.confer()");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        System.out.println("真实对象执行订票===>RealStar.confer()");
    }

    /**
     * 唱歌---歌手主要唱歌,其他事情(具体实现),可以不做(就是空实现)
     */
    @Override
    public void sing() {
        System.out.println("真实对象(周杰伦)执行唱歌===>RealStar.confer()");
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        System.out.println("真实对象执行收钱===>RealStar.confer()");
    }


}
