package cn.com.patterns.factory.factorymethod;

import cn.com.patterns.factory.Pizza;

/**
 * 工厂方法用来处理对象的创建,将实例化行为封装在子类
 * 而客户程序中关于超类的代码就和子类解耦
 * 这就是一个创建者,只是创建的方法定位抽象,等待子类实现,
 * 产品Pizza也是一个抽象类,具体的创建者可以自定义创建特定的Pizza
 * @author liwenyi
 *
 */
public abstract class AbstractPizzaStore {
	/**
	 * 抽象工厂方法必须返回一个产品,且应用于超类的方法中,但实际创建产品却和超类的方法分离
	 * @param type
	 * @return
	 */
	public abstract Pizza createPizza(String type);
	
	/**
	 * orderPizza 定义在父类,并不确定执行 creatPizza的子类,也就是定义orderPizza时不需要知道具体风格的pizza这样就可以解耦和
	 * 想得到哪一种pizza由具体的pizza店来执行creatPizza,确定pizza店就决定了pizza风格,具体pizza类型有顾客决定(type)
	 * @param type
	 * @return
	 */
	public Pizza orderPizaa(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
