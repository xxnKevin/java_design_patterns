package cn.com.patterns.observer.jdk.api;

import org.junit.Before;
import org.junit.Test;

public class WeatherStationOther {
	private WeatherDataOther weatherData;

	@Before
	public void setUp(){
		weatherData = new WeatherDataOther();	//初始化主题类
	}
	
	@Test
	public void testWeatherStation(){
		CurrentConditionsDisplayOther display = new CurrentConditionsDisplayOther(weatherData);	//初始化观察者 并制定观察的主题类
		weatherData.setMeasurements(1.01f, 3.4f, 66.0f);	//当主题信息改变
		weatherData.setMeasurements(5.1f, 8.2f, 55.0f);
		weatherData.setMeasurements(3.9f, 7.5f, 46.0f);
	}
}
