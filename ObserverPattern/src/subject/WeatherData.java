package subject;

import java.util.ArrayList;

import observers.Observer;

public class WeatherData implements Subject {

	private double temp;
	private double pressure;
	private double humidity;

	private ArrayList<Observer> observers;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registarObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unregisterObserver(int index) {
		this.observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
	}

	public void mesurementChanged() {
		notifyObservers();
	}

	public void setMesurements(double temp, double pres, double humi) {
		this.temp = temp;
		this.pressure = pres;
		this.humidity = humi;
		mesurementChanged();
	}

}
