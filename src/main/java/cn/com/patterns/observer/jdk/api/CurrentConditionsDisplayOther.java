package cn.com.patterns.observer.jdk.api;

import java.util.Observable;
import java.util.Observer;

import cn.com.patterns.observer.DisplayElement;

/**
 * 具体的一个观察者类
 * @author liwenyi
 *
 */
public class CurrentConditionsDisplayOther implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Observable observable;	//引用一个主题类(可观察者类)

	public CurrentConditionsDisplayOther(Observable observable){	//初始化指定具体的主题类
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void dispaly() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humiditay");
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherDataOther){
			WeatherDataOther weatherDate = (WeatherDataOther) observable;
			this.temperature = weatherDate.getTemperature();
			this.humidity = weatherDate.getHumidity();
			dispaly();
		}
	}

}
