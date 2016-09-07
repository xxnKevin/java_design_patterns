package cn.com.patterns.factory.simplefac;

import org.junit.Before;
import org.junit.Test;

import cn.com.patterns.factory.PizzaType;

public class SimpleFactoryTest {
	SimplePizzaFactory factory;
	PizzaStore store;
	
	@Before
	public void setUp(){
		factory = new SimplePizzaFactory();
		store = new PizzaStore(factory);
	}
	
	@Test
	public void testOrder(){
		System.out.println("--- SimpleFactory test---");
		store.orderPizza(PizzaType.cheese.name());
	}
	
}
