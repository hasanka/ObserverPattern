package observers;

import subject.Subject;

public class CurrentConditionalDisplay implements DisplayElement , Observer {
	
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionalDisplay(){}
	
	public CurrentConditionalDisplay(Subject subject) {
		this();
		weatherData = subject;
		weatherData.registarObserver(this);
	}
	
	@Override
	public void update(double tem, double humidity, double pressure) {
		this.temperature = tem;
		this.humidity = humidity;
		display();
	}
	@Override
	public void display() {
		System.out.println("Current Display ::::: Temperature is [ " +temperature +" ] , humidity is [ " + humidity+" ]");
	}
	
}
