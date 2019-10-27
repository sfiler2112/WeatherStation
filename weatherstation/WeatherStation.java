package weatherstation;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        weatherData.setMeasurements(80,75,60);
        weatherData.setMeasurements(90,75,80);
        weatherData.setMeasurements(85,95,80);
    }
}
