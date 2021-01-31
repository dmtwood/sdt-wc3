package com.dimidev.observer.exercise1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<WeatherObserver> weatherDataObservers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        weatherDataObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver newObserver) {
        weatherDataObservers.add(newObserver);
        System.out.println( this.getClass().getSimpleName() + " is registered as WeatherObserver now.");
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        weatherDataObservers.remove(observer);
        System.out.println( this.getClass().getSimpleName() + " is removed as WeatherObserver now.");
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : weatherDataObservers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public List<WeatherObserver> getWeatherDataObservers() {
        return weatherDataObservers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
