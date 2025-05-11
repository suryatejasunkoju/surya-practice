package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.issue;

public class PayPalPaymentService
{
    void processPayment(double amount) {
        System.out.println("Processing payment of amount=" + amount+" with paypal");
    }
}
