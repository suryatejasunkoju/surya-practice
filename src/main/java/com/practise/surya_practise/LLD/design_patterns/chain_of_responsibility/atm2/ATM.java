package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2;

public class ATM {
    private final ATMHandler handlerChain;

    public ATM() {
        // Setup the chain: 2000 -> 500 -> 100
        this.handlerChain = new TwoThousandHandler();
        ATMHandler fiveHundred = new FiveHundredHandler();
        ATMHandler hundred = new HundredHandler();

        handlerChain.setNext(fiveHundred);
        fiveHundred.setNext(hundred);
    }

    public void withdraw(int amount) {
        System.out.println("Processing withdrawal of ₹" + amount);
        handlerChain.handle(amount);
    }
}
