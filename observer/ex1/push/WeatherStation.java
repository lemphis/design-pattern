package observer.ex1.push;

/* Main Class */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4F);
		weatherData.setMeasurements(82, 70, 29.2F);
		weatherData.setMeasurements(88, 90, 29.2F);
	}

}
