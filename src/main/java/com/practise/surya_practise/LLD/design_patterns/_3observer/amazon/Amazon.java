package com.practise.surya_practise.LLD.design_patterns._3observer.amazon;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable.IphoneObservableImpl;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable.Observable;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.EmailObserver;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.Observer;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer.SmsObserver;

public class Amazon
{
    public static void run()
    {
        Observable iphoneObservable = new IphoneObservableImpl();

        //creating observers
        Observer emailObserver = new EmailObserver(iphoneObservable, "surya@gmail.com");
        Observer smsObserver = new SmsObserver(iphoneObservable, "1234567890");

        // Registering observers
        iphoneObservable.registerObserver(smsObserver);
        iphoneObservable.registerObserver(emailObserver);

        iphoneObservable.setStockCount(123);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(143);
        iphoneObservable.setStockCount(1);
    }
}
