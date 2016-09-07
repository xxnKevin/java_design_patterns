package cn.com.patterns.factory.abstractfac;

import cn.com.patterns.factory.Pizza;
import cn.com.patterns.factory.PizzaType;

public class NYStylePizzaStore extends AbstractPizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type ==null){
			return pizza;
		}else{
			if(type.equals(PizzaType.cheese.name())){
				pizza = new NYStyleCheesePizza();
			}else if(type.equals(PizzaType.pepperoni.name())){
				pizza = new NYStylePepperoniPizza();
			}else if(type.equals(PizzaType.clam.name())){
				pizza = new NYStyleClamPizza();
			}else if(type.equals(PizzaType.veggie.name())){
				pizza = new NYStyleVeggiePizza();
			}
			return pizza;
		}
	}

}
