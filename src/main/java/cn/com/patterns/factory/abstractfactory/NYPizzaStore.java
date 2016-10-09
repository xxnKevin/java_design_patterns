package cn.com.patterns.factory.abstractfactory;
import cn.com.patterns.factory.PizzaType;

public class NYPizzaStore extends AFPizzaStore{
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(PizzaType.cheese.name().equals(item)){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style cheese pizza");
		}else if(PizzaType.clam.name().equals(item)){
			pizza = new DoughPizza(ingredientFactory); 
			pizza.setName("New York Style dough pizza");
		}
		return pizza;
	}
}
