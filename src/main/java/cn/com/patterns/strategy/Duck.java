package cn.com.patterns.strategy;

import cn.com.patterns.strategy.behavior.FlyBehavior;
import cn.com.patterns.strategy.behavior.QuackBehavior;

/**
 * 所有鸭子的抽象父类,鸭子的某些行为委托给行为接口类，每一个具体的鸭子都可以给他指定具体的行为
 * 鸭子的行为可以动态指定,当行为需求新增时,只需要新增行为接口以及实现方式,然后指定给鸭子即可,无需修改代码
 * 将鸭子行为抽象作为接口,面向接口编程,使用组合模式
 * 针对接口编程---:变量的声明类型应该是超类型,通常是一个抽象类或者接口,执行时会根据实际子类执行到真正的行为
 * 策略模式----:将行经常变动的行为独立抽象出来，作为属性放置于类中，并设置set方法。这样可以在运行时指定对象的行为
 * @author liwenyi
 *
 */
public abstract class Duck {
	public FlyBehavior flyBehavior;		//reference flyBehavior interface
	public QuackBehavior quackBehavior;	//reference quackBehavior interface

	public Duck() {
	}
	
	/**
	 * abstract display,special duck has special display
	 */
	public abstract void display();
	
	/**
	 * fly function,delegate FlyBehavor interface
	 */
	public void performFly(){
		flyBehavior.fly();
	}
	
	/**
	 * quack function,delegate QuackBehavor interface
	 */
	public void perfromQuack(){
		quackBehavior.quack();	//
	}
	
	/**
	 * swin function
	 */
	public void swin() {
		System.out.println("all duck float,even decopys");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
