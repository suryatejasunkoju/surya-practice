package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.issue;

public class OpenForExtensionClosedForModificationIssue
{
    public static void run()
    {
        OrderService1 orderService1 = new OrderService1();
        orderService1.placeOrder("paypal", 1000.56);
    }
}
