package com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.observers;

import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.observables.WeatherStation;

public interface DisplayObserver
{
    void update(WeatherStation observer);
}
