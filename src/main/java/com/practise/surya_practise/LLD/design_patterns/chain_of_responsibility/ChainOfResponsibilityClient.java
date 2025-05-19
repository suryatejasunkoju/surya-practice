package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.AtmClient;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2.Atm2Client;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.LoggingClient;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.support_ticket_system.SupportTicketSystemClient;

public class ChainOfResponsibilityClient
{
    public static void run()
    {
        System.out.println("Chain of Responsibility Pattern:");
        //Chain of Responsibility:
        //client(sender) sends request to the first handler
        //if first handler can handle the request, it will handle it
        //if not, it will pass the request to the next handler
        //if no handler can handle the request, it will be handled by the default handler
        //if no default handler is present, the request will be ignored

        //Handler
        //  ├── handleRequest(request)
        //  └── setNext(handler: Handler)
        //
        //ConcreteHandler1 implements Handler
        //  ├── handleRequest(request)
        //  └── next: Handler
        //
        //ConcreteHandler2 implements Handler
        //  ├── handleRequest(request)
        //  └── next: Handler
        //
        //Client
        //  └── sendRequest(handler, request)

        //Ex:Filter chain in Java


//        AtmClient.run(); //my ATM example
        Atm2Client.run(); //ChatGPT ATM example

        //below 2 implementations are slightly different:
        // logging handler does some work & gives the request to the next handler
        // support ticket system handler just passes the request to the next handler if it can't handle it
//        LoggingClient.run();
//        SupportTicketSystemClient.run();

    }
}
