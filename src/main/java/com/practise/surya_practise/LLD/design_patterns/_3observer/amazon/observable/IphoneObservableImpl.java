package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements Observable
{
    private List<Observer> observerList = new ArrayList<>();
    private int stockCount=0;

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
        for (Observer observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount)
    {
        System.out.println("OldStock="+stockCount+", newStock="+newStockCount+"=======================");
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
