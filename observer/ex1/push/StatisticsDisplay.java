package observer.ex1.push;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;

	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
