package com.demo.proxy.staticproxy;
/**
 * ProxyStar:代理对象,这是个对某个类(对象)进行增强的
 * @author zhangxiaoxiang
 * @date 2019/8/9
 */

public class ProxyStar implements Star {
	/**
	 * 专业的事情教给专业的人去做,比如在这里就是相当于请歌手唱歌
	 * 注意这里接口做属性,组合比实现类(应用)做属性好的多,因为接口做属性可以请很多歌手唱歌(提现多态),
	 * 但是是实现类做属性(面向实现编程)耦合度太高,换个歌手又得修改这个类,开闭原则是尽量不要修改这个类,所以这里
	 * 是使用Star,而不是 private RealStar star
	 * ---静态代理代理的是接口就是出自这里
	 */
	private Star star;

	/**
	 * 怎么请?这里使用构造方法请,用set方法也行
	 * @param star
	 */
	public ProxyStar(Star star) {
		this.star = star;
	}


	/**
	 * 面谈---代理对象专业的人处理其他事情,相当于打杂,对专业的人来说,相当于增强了
	 */
	@Override
	public void confer() {
		System.out.println("代理面谈===>ProxyStar.bookTicket()");
	}

	/**
	 * 签合同---代理对象专业的人处理其他事情,相当于打杂,对专业的人来说,相当于增强了
	 */
	@Override
	public void signContract() {
		System.out.println("代理签合同===>ProxyStar.bookTicket()");
	}

	/**
	 * 订票---代理对象专业的人处理其他事情,相当于打杂,对专业的人来说,相当于增强了
	 */
	@Override
	public void bookTicket() {
		System.out.println("代理订票===>ProxyStar.bookTicket()");
	}

	/**
	 * 唱歌===专业的人做专业的事
	 */
	@Override
	public void sing() {
		System.out.println("*******代理对象不抢主角光环*******");
		star.sing();
	}

	/**
	 * 收钱---代理对象专业的人处理其他事情,相当于打杂,对专业的人来说,相当于增强了
	 */
	@Override
	public void collectMoney() {
		System.out.println("代理收钱===>ProxyStar.bookTicket()");
	}



}
