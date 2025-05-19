package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.FiveHundredHandler;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.Handler;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.HundredHandler;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.ThousandHandler;

import java.util.ArrayList;
import java.util.List;

public class AtmClient
{
    public static void run()
    {
        List<Handler> handlerList = new ArrayList<>();
        handlerList.add(new ThousandHandler(40));
        handlerList.add(new FiveHundredHandler(20));
        handlerList.add(new HundredHandler(10));
        System.out.println("Handlers are created, handlerList=" + handlerList);

        com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.abstract_handler.Handler handler = new com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.abstract_handler.Handler(handlerList);
        String response = handler.handleRequest(1700);
        System.out.println("--->"+response);
        response = handler.handleRequest(11234);
        System.out.println("--->"+response);
        response = handler.handleRequest(1000);
        System.out.println("--->"+response);
        response = handler.handleRequest(500);
        System.out.println("--->"+response);
        response = handler.handleRequest(17987);
        System.out.println("--->"+response);
    }
}
