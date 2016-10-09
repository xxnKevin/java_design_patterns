package cn.com.patterns.factory.abstractfactory;

import cn.com.patterns.factory.abstractfactory.ingredient.Cheese;
import cn.com.patterns.factory.abstractfactory.ingredient.Dough;

/**
 * 原料工厂抽象接口,针对于同样做法的pizza不需要两个不同的工厂来生产,只需要定义两个不同的原来工厂,生产方式一样
 * 抽象工厂----提供一个接口,用于创建相关或者依赖对象的家族,而不需要指定具体类
 * 允许客户使用抽象的接口创造一组产品,而不需要知道
 * @author liwenyi
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
