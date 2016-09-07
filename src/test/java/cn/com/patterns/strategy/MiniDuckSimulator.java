package cn.com.patterns.strategy;

import org.junit.Before;
import org.junit.Test;

import cn.com.patterns.strategy.behavior.impl.Squeak;

public class MiniDuckSimulator {
	public Duck duck;
	
	@Before
	public void setUp(){
		duck = new MallardDuck();
	}
	@Test
	public void testMallardDuck(){
		duck.performFly();
		duck.perfromQuack();
		duck.setQuackBehavior(new Squeak());	//dynamic set duck behavior
		duck.perfromQuack();
	}
}
