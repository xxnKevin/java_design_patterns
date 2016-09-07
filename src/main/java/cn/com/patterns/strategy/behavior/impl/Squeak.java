package cn.com.patterns.strategy.behavior.impl;

import cn.com.patterns.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior{
	
	/**
	 * 吱吱叫
	 */
	@Override
	public void quack() {
		System.out.println("---Squeak---");
	}

}
