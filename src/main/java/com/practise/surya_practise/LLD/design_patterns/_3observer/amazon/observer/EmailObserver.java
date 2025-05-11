package com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observer;

import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.observable.Observable;

public class EmailObserver implements Observer
{
    private Observable observable;
    private String email;

    public EmailObserver(Observable observable, String email)
    {
        this.observable = observable;
        this.email = email;
    }


    @Override
    public void update()
    {
        System.out.println("Updating Email Stock Observer");
        String msg = "sending InStock Email to ";
        sendMail(email, msg);
    }

    private void sendMail(String email, String msg) {
        System.out.println(msg+email);
    }
}
