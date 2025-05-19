package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.support_ticket_system.abstract_handler;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.support_ticket_system.SupportTicket;

public abstract class SupportHandler
{

    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract void handle(SupportTicket ticket);
}
