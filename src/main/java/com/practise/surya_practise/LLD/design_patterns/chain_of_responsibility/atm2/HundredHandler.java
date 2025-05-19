package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm2;

public class HundredHandler extends ATMHandler {
    public void handle(int amount) {
        int numNotes = amount / 100;
        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " x ₹100 notes");
        }
        int remainder = amount % 100;
        if (remainder != 0) {
            System.out.println("Cannot dispense ₹" + remainder + ". Invalid denomination.");
        }
    }
}