package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements Observable
{
    private List<StockObserver> stockObserverList = new ArrayList<>();
    private int stockCount=0;

    @Override
    public void registerObserver(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
        System.out.println("Adding observer=" + stockObserver.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        System.out.println("Removing observer=" + stockObserver.getClass().getSimpleName());
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers of stock change:");
        for (StockObserver stockObserver : stockObserverList)
        {
            stockObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount)
    {
        if(this.stockCount==0 && newStockCount>0)
        {
            System.out.println("Stock count is greater than zero & earlier its zero. So, notify all observers");
            notifyObservers();
        }
        this.stockCount=newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
