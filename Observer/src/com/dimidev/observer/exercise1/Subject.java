package com.dimidev.observer.exercise1;

public interface Subject {
    public void registerObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public void notifyObservers(); }
