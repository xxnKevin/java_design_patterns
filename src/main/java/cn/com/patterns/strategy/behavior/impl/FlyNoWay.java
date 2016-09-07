package cn.com.patterns.strategy.behavior.impl;

import cn.com.patterns.strategy.behavior.FlyBehavior;

/**
 * 不会飞
 * @author liwenyi
 *
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("----I can't fly---");
	}
	
}
