package cn.com.patterns.decorator.spicessub;

import cn.com.patterns.decorator.Beverage;
import cn.com.patterns.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "Soy" + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 1.2 + beverage.cost();
	}

}
