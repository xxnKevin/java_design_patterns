package cn.com.patterns.strategy.behavior.impl;

import cn.com.patterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior{
	
	/**
	 * 嘎嘎叫
	 */
	@Override
	public void quack() {
		System.out.println("---Quack---");
	}

}
