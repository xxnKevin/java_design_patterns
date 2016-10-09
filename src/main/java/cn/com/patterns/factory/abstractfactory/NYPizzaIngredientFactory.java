package cn.com.patterns.factory.abstractfactory;

import cn.com.patterns.factory.abstractfactory.ingredient.Cheese;
import cn.com.patterns.factory.abstractfactory.ingredient.Dough;
import cn.com.patterns.factory.abstractfactory.ingredient.ReggianoCheese;
import cn.com.patterns.factory.abstractfactory.ingredient.ThinCrustDough;

/**
 * 具体的原料工厂方法
 * @author liwenyi
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new Sauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

}
