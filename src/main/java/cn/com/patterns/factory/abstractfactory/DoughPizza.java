package cn.com.patterns.factory.abstractfactory;

public class DoughPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public DoughPizza(PizzaIngredientFactory ingredientFactory){
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
