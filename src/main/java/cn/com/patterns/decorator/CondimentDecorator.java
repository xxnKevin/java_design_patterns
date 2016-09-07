package cn.com.patterns.decorator;

/**
 * 调料抽象装饰者
 * 装饰者必须继承 被装饰者,是的被装饰者 经过装饰之后的类型还是相同父类型
 * 装饰体现了继承也可以动态扩展程序,运行时修饰程序行为,将需要扩展的行为定义为抽象方法
 * @author liwenyi
 *
 */
public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
