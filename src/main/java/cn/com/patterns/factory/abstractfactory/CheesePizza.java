package cn.com.patterns.factory.abstractfactory;

/**
 * special CheesePizza extends Pizza 
 * @author liwenyi
 *
 */
public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;	//define ingredient factory
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("prepare function execute --- :"+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
}
