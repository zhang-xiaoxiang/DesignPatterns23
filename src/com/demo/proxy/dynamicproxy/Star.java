package com.demo.proxy.dynamicproxy;
/**
 * Star:代理接口
 * (万事万物接口开头,面向接口编程,先明确要干什么,怎么干是后面实现类的事情,这样有利于解耦,
 * 比如同样是面谈的实现,需要换个面谈方式那不是还得修改代理类?这里直接定义成接口,那么代理要换个代理只需要换个代理实现类就行了
 * 不需要对代理接口进行修改,达到开闭原则,开放拓展,但是修改接口这个代理接口Star不允许)
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public interface Star {
	/**
	 * 面谈
	 */
	void confer();
	/**
	 * 签合同
	 */
	void signContract();
	/**
	 * 订票
	 */
	void bookTicket();
	/**
	 * 唱歌
	 */
	void sing();
	/**
	 * 收钱
	 */
	void collectMoney();
}
