package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable.Observable;

public class SmsStockStockObserver implements StockObserver {
    private Observable observable;
    private String mobileNo;

    public SmsStockStockObserver(Observable observable, String mobileNo) {
        this.observable = observable;
        this.mobileNo = mobileNo;
    }

    @Override
    public void update()
    {
        System.out.println("Updating Sms Stock Observer");
        String msg = "sending InStock Sms to";
        sendSms(mobileNo, msg);
    }

    private void sendSms(String mobileNo, String msg) {
        System.out.println(msg+mobileNo);
    }
}
