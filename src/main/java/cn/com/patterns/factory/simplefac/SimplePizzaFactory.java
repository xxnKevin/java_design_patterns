package cn.com.patterns.factory.simplefac;

import cn.com.patterns.factory.Pizza;
import cn.com.patterns.factory.PizzaType;

/**
 * 严格来说,简单工厂并不算是一种设计模式,是一种编程习惯
 * 根据给定的类型变量创建不同的实例,貌似能做到运行时动态改变,
 * 但新增一种类型时,需要改变创造方法
 * 但是它将创建的代码统一管理起来了只需修改此处即可
 * @author liwenyi
 *
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type ==null){
			return pizza;
		}else{
			if(type.equals(PizzaType.cheese.name())){
				pizza = new CheesePizza();
			}else if(type.equals(PizzaType.pepperoni.name())){
				pizza = new PepperoniPizza();
			}else if(type.equals(PizzaType.clam.name())){
				pizza = new ClamPizza();
			}else if(type.equals(PizzaType.veggie.name())){
				pizza = new VeggiePizza();
			}
			return pizza;
		}
	}
}
