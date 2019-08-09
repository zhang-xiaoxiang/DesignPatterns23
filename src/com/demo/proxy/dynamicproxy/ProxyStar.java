package com.demo.proxy.dynamicproxy;

/**
 * ProxyStar:模拟动态生成的代理的类
 *
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */
public class ProxyStar implements Star {
    /**
     * 注入代理处理器类(动态代理是代理类这句话,就是来自这里),在静态代理这里是直接注入的private Star star 接口,就是代理的是接口
     * ---一句话代理类,这个类是动态的哈
     */
    StarHandler handler;

    /**
     * 使用构造方法实现注入,set方法也行,不赘述
     *
     * @param handler
     */
    public ProxyStar(StarHandler handler) {
        this.handler = handler;
    }

    /**
     * 面谈
     */
    @Override
    public void confer() {
        //		handler.invoke(this,当前方法 , args);
    }

    /**
     * 签合同
     */
    @Override
    public void signContract() {
        //		handler.invoke(this,当前方法 , args);
    }

    /**
     * 订票
     */
    @Override
    public void bookTicket() {
        //		handler.invoke(this,当前方法 , args);
    }

    /**
     * 唱歌
     */
    @Override
    public void sing() {
        //		handler.invoke(this,当前方法 , args);
    }

    /**
     * 收钱
     */
    @Override
    public void collectMoney() {
        //		handler.invoke(this,当前方法 , args);
    }


}
