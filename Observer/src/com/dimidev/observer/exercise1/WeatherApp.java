package com.dimidev.observer.exercise1;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Thermostat thermostat = new Thermostat();
        Tablet tablet = new Tablet();
        Smartphone smartphone = new Smartphone();

        weatherData.registerObserver(thermostat);
        weatherData.registerObserver(tablet);
        weatherData.registerObserver(smartphone);

        weatherData.setMeasurements(32, 12, 2);

        thermostat.display();
        tablet.display();
        smartphone.display();

        weatherData.removeObserver(thermostat);

        weatherData.setMeasurements(23,20,1);

        thermostat.display();   // was no longer updated, keeps old value
        tablet.display();
        smartphone.display();
    }
}
