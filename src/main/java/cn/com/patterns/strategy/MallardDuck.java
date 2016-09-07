package cn.com.patterns.strategy;

import cn.com.patterns.strategy.behavior.impl.FlyWithWings;
import cn.com.patterns.strategy.behavior.impl.Quack;

/**
 * 鸭子的子类
 * @author liwenyi
 *
 */
public class MallardDuck extends Duck{
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("---I am really Mallard duck---");
	}

}
