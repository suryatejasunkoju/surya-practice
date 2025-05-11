package com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observables;

import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.LikeHeadFirstDesignPatterns.observers.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    float temperature=0;
    private List<DisplayObserver> observerList=new ArrayList<>();

//    public WeatherStation(List<DisplayObserver> observerList)
//    {
//        this.observerList = observerList;
//        System.out.println("WeatherStation created with " + observerList.size() + " observers.");
//    }

    @Override
    public void registerObserver(DisplayObserver observer) {
        System.out.println("Registering observer: " + observer.getClass().getSimpleName());
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer) {
        System.out.println("Removing observer: " + observer.getClass().getSimpleName());
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers of temperature change...");
        for (DisplayObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setTemperature(float temperature)
    {
        this.temperature=temperature;
        System.out.println("============Temperature updated to " + temperature);
        System.out.println("observerList=" + observerList);
        notifyObservers();
    }

    @Override
    public float getTemperature() {
        return this.temperature;
    }
}
