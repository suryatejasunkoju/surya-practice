package com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observers;

import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observables.WeatherObservable;
import lombok.ToString;

@ToString
public class MobileDisplay implements DisplayObserver
{
    private WeatherObservable observable;

    public MobileDisplay(WeatherObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Mobile Display: Temperature updated to "+observable.getTemperature());
    }
}
