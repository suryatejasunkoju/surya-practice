package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2;

public class FiveHundredHandler extends ATMHandler {
    public void handle(int amount) {
        int numNotes = amount / 500;
        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " x ₹500 notes");
        }
        int remainder = amount % 500;
        super.handle(remainder);
    }
}