package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("Adding observer=" + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removing observer=" + observer.getClass().getSimpleName());
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers of stock change:");
        for (Observer observer: observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public float getPrice() {
        return 0;
    }
}
