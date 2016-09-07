package cn.com.patterns.observer.jdk.api;

import java.util.Observable;

/**
 * 具体的一个可观察者(主题类)
 * 由于是继承Observable,所以不利于后续扩展,但是Observable实现了注册,取消注册,设置状态变更等操作,减少了代码的书写
 * @author liwenyi
 *
 */
public class WeatherDataOther extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
	public WeatherDataOther() {
		
	}
	
	/**
	 * 模拟数据,动态更新气象站的观测值
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
}
