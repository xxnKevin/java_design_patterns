package cn.com.patterns.decorator.beveragesub;

import cn.com.patterns.decorator.Beverage;

/**
 * 具体的一种饮料--浓咖啡
 * @author liwenyi
 *
 */
public class Espresso extends Beverage{
	public Espresso(){
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 2.0;
	}

}
