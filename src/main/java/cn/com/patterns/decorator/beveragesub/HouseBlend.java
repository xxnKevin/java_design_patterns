package cn.com.patterns.decorator.beveragesub;

import cn.com.patterns.decorator.Beverage;

/**
 * 具体的一种饮料--综合咖啡
 * @author liwenyi
 *
 */
public class HouseBlend extends Beverage{
	public HouseBlend(){
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 3.2;
	}

}
