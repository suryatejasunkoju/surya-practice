package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenForExtensionClosedForModificationFix
{
    @Autowired
    private static OrderService orderService;

    public static void run()
    {
        orderService.placeOrder("paypal", 1000.56);
    }
}
