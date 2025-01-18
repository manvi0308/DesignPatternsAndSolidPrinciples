package observerdesignpattern;
import java.util.*;

// Observer Interface
interface Observer {
	void update(String weather);
}


interface Subject{
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}

class WeatherStation implements Subject{
	private List<Observer> observers = new ArrayList<>();
	private String weather;
	@Override
	public
	void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}
	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(weather);
		}
	}
	
	public void setWeather(String newWeather) {
		this.weather = newWeather;
		notifyObservers();
	}
}

class PhoneDisplay implements Observer{
	private String weather;
	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}
	
	public void display() {
		System.out.println("Phone Display weather updated to " + weather);
	}
}

class TVDisplay implements Observer{
	private String weather;
	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}
	
	public void display() {
		System.out.println("TV Display weather updated to " + weather);
	}
}
public class WeatherApp {
	public static void main(String[] args) {
		WeatherStation ws = new WeatherStation();
		Observer phoneDisplay = new PhoneDisplay();
		Observer tvdisplay = new TVDisplay();
		
		ws.addObserver(phoneDisplay);
		ws.addObserver(tvdisplay);
		
		ws.setWeather("Sunny");

		
	}
}
