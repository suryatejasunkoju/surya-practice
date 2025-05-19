package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2;

public abstract class ATMHandler {
    protected ATMHandler next;

    public void setNext(ATMHandler next) {
        this.next = next;
    }

    public void handle(int amount) {
        if (next != null) {
            next.handle(amount);
        }
    }
}
