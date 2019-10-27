package weatherstation;

public class CurrentDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public CurrentDisplay(WeatherData wd){
        weatherData = wd;
        weatherData.registerObserver(this);
    }

    public void update(){
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }

    public void display(){
        System.out.println("Current weather measurements (temperature/humidity/pressure): " + temperature + "/" + humidity + "/" + pressure);
    }
}
