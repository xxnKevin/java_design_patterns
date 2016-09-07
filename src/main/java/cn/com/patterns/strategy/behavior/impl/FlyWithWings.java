package cn.com.patterns.strategy.behavior.impl;

import cn.com.patterns.strategy.behavior.FlyBehavior;

/**
 * 带翅膀 可以飞
 * @author liwenyi
 *
 */
public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("---I am flying---");
	}

}
