package cn.com.patterns.factory.abstractfac;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.com.patterns.factory.PizzaType;


public class AbstractFactoryTest {
	AbstractPizzaStore store;
	
	@Before
	public void setUpStart(){
		store = new ChicagoStylePizzaStore();
	}
	
	@Test
	public void testAbstractFactory(){
		System.out.println("--- abstarctFactory test ---");
		store.orderPizaa(PizzaType.cheese.name());
		store = new NYStylePizzaStore();
		store.orderPizaa(PizzaType.pepperoni.name());
	}
	
	@After
	public void setUpEnd(){
		store = null;
	}
}
