package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer;

public class StockObserver implements Observer {
    @Override
    public void update()
    {
        System.out.println("Updating StockObserver");
    }
}
