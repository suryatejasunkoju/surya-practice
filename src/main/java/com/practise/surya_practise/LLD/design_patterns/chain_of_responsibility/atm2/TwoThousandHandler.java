package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2;

public class TwoThousandHandler extends ATMHandler {
    public void handle(int amount) {
        int numNotes = amount / 2000;
        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " x ₹2000 notes");
        }
        int remainder = amount % 2000;
        super.handle(remainder);
    }
}