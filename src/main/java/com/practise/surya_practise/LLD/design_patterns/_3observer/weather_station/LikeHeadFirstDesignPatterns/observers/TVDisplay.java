package com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observers;

import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observables.WeatherObservable;
import lombok.ToString;

@ToString
public class TVDisplay implements DisplayObserver
{
    private WeatherObservable observable;

    public TVDisplay(WeatherObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("TV Display: Temperature updated to " + observable.getTemperature());
    }
}
