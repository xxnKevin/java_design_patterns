package cn.com.patterns.strategy.behavior.impl;

import cn.com.patterns.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{
	
	/**
	 * 无声
	 */
	@Override
	public void quack() {
		System.out.println("---silence---");
	}

}
