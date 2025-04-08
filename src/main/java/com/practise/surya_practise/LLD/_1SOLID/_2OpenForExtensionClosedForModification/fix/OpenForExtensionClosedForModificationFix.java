package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix;


import org.springframework.beans.factory.annotation.Autowired;

public class OpenForExtensionClosedForModificationFix
{
    @Autowired
    private  OrderService orderService;
    public void run()
    {
        orderService.placeOrder("paypal", 1000.56);
    }
}
