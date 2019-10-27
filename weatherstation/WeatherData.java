package weatherstation;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observerList;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
    }
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }
    public void notifyObservers() {
        if(!observerList.isEmpty()){
            for(Observer currentObserver:observerList){
                currentObserver.update();
            }
        }
    }

    public double getTemperature(){
        return temperature;
}

    public double getHumidity(){
        return humidity;
    }

    public double getPressure(){
        return pressure;
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void setTemperature(double newTemperature){
        temperature =  newTemperature;
        measurementsChanged();
    }

    public void setHumidity(double newHumidity){
        humidity =  newHumidity;
        measurementsChanged();
    }

    public void setPressure(double newPressure){
        pressure =  newPressure;
        measurementsChanged();
    }
}
