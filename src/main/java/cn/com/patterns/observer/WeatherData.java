package cn.com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个具体主题类
 * @author liwenyi
 *
 */
public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();	//初始化观察者数组
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >=0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		//主题发生变化主动调用观察者的update方法推送更新信息
		for(Observer observer:observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * 当气象站得到更新观测值是,提示观察者
	 */
	public void measurementsChanged(){
		notifyObserver();
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
}
