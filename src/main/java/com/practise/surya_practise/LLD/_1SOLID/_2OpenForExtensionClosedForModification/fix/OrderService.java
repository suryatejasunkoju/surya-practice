package com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix;


import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private Map<String, PaymentProcessor> paymentServiceMap;

    public OrderService(List<PaymentProcessor> paymentProcessorList){
        paymentServiceMap = paymentProcessorList.stream().collect(
                Collectors.toMap(
                        paymentProcessor -> paymentProcessor.getClass().getSimpleName().toLowerCase()
                        ,
                        paymentProcessor -> paymentProcessor
                )
        );
    }

    void placeOrder(String paymentType, double amount)
    {
        PaymentProcessor paymentProcessor = paymentServiceMap.get(paymentType);
        if(!ObjectUtils.isEmpty(paymentProcessor))
        {
            paymentProcessor.processPayment(amount);
        }
    }
}
