package cn.com.patterns.observer;

/**
 * 一个具体的观察者类
 * @author liwenyi
 *
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;	//引用一个主题接口
	
	public CurrentConditionsDisplay(Subject weatherData){	//初始化指定具体的主题接口
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void dispaly() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humiditay");
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		dispaly();
	}

}
