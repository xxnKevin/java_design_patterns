package cn.com.patterns.decorator.spicessub;

import cn.com.patterns.decorator.Beverage;
import cn.com.patterns.decorator.CondimentDecorator;

/**
 * 具体的装饰着会包含 一个 饮料超级组件的引用,
 * 装饰的作用就是扩展增强了饮料类型的方法
 * @author liwenyi
 *
 */
public class Mocha extends CondimentDecorator{
	public Beverage beverage;
	
	public Mocha(Beverage beverage){	//实例化具体的调味装饰者时，必须指定装饰的对象类型
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.0;
	}

}
