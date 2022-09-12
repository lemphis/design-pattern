package observer.push;

public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;

	public ForecastDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecast: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
