package com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.observables;

import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.observers.DisplayObserver;

public interface WeatherObservable
{
    void registerObserver(DisplayObserver observer);

    void removeObserver(DisplayObserver observer);

    void notifyObservers();

    void setTemperature(float temperature);

    float getTemperature();
}
