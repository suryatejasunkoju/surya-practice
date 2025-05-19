package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.abstract_handler;

import java.util.List;

public class Handler
{
    private final List<com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.Handler> handlerList;

    public Handler(List<com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.Handler> handlerList) {
        this.handlerList = handlerList;
    }


    public String handleRequest(int amount)
    {
        for (com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler.Handler handler : handlerList)
        {
            System.out.println("-->handler"+handler);
            int isRequestHandled = handler.handleRequest(amount);
            if (isRequestHandled==0){
                return "Request handled";
            }
        }
        return "Request not handled";
    }
}
