package observers;

import subject.Subject;

public class ExternalDisplay implements Observer , DisplayElement{

	private double temperature;
	private double humidity;
	private double pressure;
	
	private Subject weatherData;
	
	public ExternalDisplay(){}
	
	public ExternalDisplay(Subject subject){
		this();
		this.weatherData = subject;
		this.weatherData.registarObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("External Display :::: Temperature["+temperature+"], Humidity["+humidity+"],Pressure["+pressure+"]");
	}

	@Override
	public void update(double tem, double humidity, double pressure) {
		this.temperature = tem;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
