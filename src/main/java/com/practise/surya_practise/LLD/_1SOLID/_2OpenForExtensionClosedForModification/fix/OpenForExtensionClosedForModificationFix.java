package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenForExtensionClosedForModificationFix
{
    @Autowired
    private  OrderService orderService;

    public void run()
    {
        orderService.placeOrder("paypal", 1000.56);
    }
}
