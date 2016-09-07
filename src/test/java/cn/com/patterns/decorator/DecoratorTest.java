package cn.com.patterns.decorator;

import org.junit.Before;
import org.junit.Test;

import cn.com.patterns.decorator.beveragesub.Espresso;
import cn.com.patterns.decorator.spicessub.Mocha;
import cn.com.patterns.decorator.spicessub.Soy;

public class DecoratorTest {
	public Beverage beverage;
	
	@Before
	public void setUp(){
		beverage = new Espresso();
	}
	
	@Test
	public void testDecorator(){
		System.out.println("描述---"+beverage.getDescription() +"   价格---:"+beverage.cost());
		beverage = new Mocha(beverage);
		System.out.println("装饰之后------  描述---"+beverage.getDescription() +"   价格---:"+beverage.cost());
		beverage = new Soy(beverage);
		System.out.println("装饰之后------  描述---"+beverage.getDescription() +"   价格---:"+beverage.cost());
	}
}
