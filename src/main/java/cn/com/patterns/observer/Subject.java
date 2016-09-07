package cn.com.patterns.observer;

/**
 * 主题接口,包含一个注册方法,一个删除注册者的方法,一个提示方法
 * @author liwenyi
 *
 */
public interface Subject {
	/**
	 * 注册成为观察者
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * 移除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * 当产生变化(自定义) 时通知观察者
	 */
	public void notifyObserver();
	
}
