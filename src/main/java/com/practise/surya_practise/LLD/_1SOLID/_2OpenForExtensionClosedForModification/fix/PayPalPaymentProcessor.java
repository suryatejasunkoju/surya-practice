package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentProcessor implements PaymentProcessor
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of amount=" + amount+" with paypal");
    }
}
