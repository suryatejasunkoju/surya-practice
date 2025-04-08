package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setPrice(float price);

    float getPrice();
}
