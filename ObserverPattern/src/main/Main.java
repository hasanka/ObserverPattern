package main;

import observers.CurrentConditionalDisplay;
import observers.ExternalDisplay;
import observers.Observer;
import subject.WeatherData;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherDate = new WeatherData();	
		Observer o1 = new CurrentConditionalDisplay(weatherDate);
		Observer o2 = new ExternalDisplay(weatherDate);
		
		weatherDate.setMesurements(10, 20, 30);
		weatherDate.setMesurements(100, 50, 20);
	}

}
