package cn.com.patterns.decorator;

/**
 * 饮料抽象类组件
 * @author liwenyi
 *
 */
public abstract class Beverage {
	public String description = "";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();
}
