package com.demo.proxy.staticproxy;

/**
 * RealStar:一个真实的歌手,在没有代理的情况下需要全部实现,又当爹又当妈
 * (显然不不合理,对歌手来说,除了唱歌,其他打杂的事情,面谈,签合同什么的都没有必要去做)
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
        //可以做空实现
        System.out.println("真实对象执行面谈===>RealStar.confer()");
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        //可以做空实现
        System.out.println("真实对象执行签合同===>RealStar.confer()");
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        //可以做空实现
        System.out.println("真实对象执行订票===>RealStar.confer()");
    }

    /**
     * 唱歌---歌手主要唱歌,其他事情(具体实现),可以不做(就是空实现)
     */
    @Override
    public void sing() {
        //这里唱歌是必须实现的,不然算什么歌手
        System.out.println("真实对象(周杰伦)执行唱歌===>RealStar.confer()");
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        //可以做空实现
        System.out.println("真实对象执行收钱===>RealStar.confer()");
    }


}
