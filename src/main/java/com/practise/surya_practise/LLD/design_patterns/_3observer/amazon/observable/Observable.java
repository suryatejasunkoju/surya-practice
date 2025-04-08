package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.StockObserver;

public interface Observable {

    void registerObserver(StockObserver stockObserver);

    void removeObserver(StockObserver stockObserver);

    void notifyObservers();

    void setStockCount(int price);

    int getStockCount();
}
