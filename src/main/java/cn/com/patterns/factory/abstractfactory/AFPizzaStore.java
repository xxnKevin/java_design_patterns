package cn.com.patterns.factory.abstractfactory;

public abstract class AFPizzaStore {
	public abstract Pizza createPizza(String item);
	public Pizza orderPizaa(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
