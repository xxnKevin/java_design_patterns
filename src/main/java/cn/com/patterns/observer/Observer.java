package cn.com.patterns.observer;

/**
 * 观察者接口
 * @author liwenyi
 *
 */
public interface Observer {
	/**
	 * 主题变化,调用notify时,观察者调用此方法
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temperature,float humidity,float pressure);
}
