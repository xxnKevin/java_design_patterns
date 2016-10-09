package cn.com.patterns.factory.abstractfactory;

import cn.com.patterns.factory.abstractfactory.ingredient.Cheese;
import cn.com.patterns.factory.abstractfactory.ingredient.Dough;

/**
 * 抽象pizza类
 * 
 * @author liwenyi
 * 
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	/**
	 * 准备原料方法
	 */
	public abstract void prepare();
	
	public void bake() {
		System.out.println("--- bake ---");
	}

	public void cut() {
		System.out.println("--- cut ---");
	}

	public void box() {
		System.out.println("--- box ---");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return this.name;
	}
}
