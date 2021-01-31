package com.dimidev.observer.exercise1;

public class Smartphone implements WeatherObserver{
    float temperature, humidity, pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display(){
        System.out.println(this.getClass().getSimpleName()
                + " temperature: " + temperature + "°C, humidity: " + humidity + "% and pressure: " + pressure + "B.");
    }
}
