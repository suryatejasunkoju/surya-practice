package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.issue;

public class OrderService1 {

    //to add other payment methods, we need to modify this class

    PayPalPaymentService payPalPaymentService = new PayPalPaymentService();
    //change occurs here as well.


    void placeOrder(String paymentType, double amount)
    {
        if(paymentType.equalsIgnoreCase("paypal"))
        {
            payPalPaymentService.processPayment(amount);
        }
    }
}
