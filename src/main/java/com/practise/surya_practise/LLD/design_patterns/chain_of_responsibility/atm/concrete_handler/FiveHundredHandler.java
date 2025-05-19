package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler;

public class FiveHundredHandler implements Handler {
    public int denominationQuantity;
    public FiveHundredHandler(int denominationQuantity){
        this.denominationQuantity=denominationQuantity;
    }

    @Override
    public int getDenominationQuantity() {
        return denominationQuantity;
    }

    @Override
    public void setDenominationQuantity(int denominationQuantity) {
        this.denominationQuantity=denominationQuantity;
    }

    @Override
    public int getDenominationValue() {
        return 500;
    }
    @Override
    public String toString() {
        return "FiveHundredHandler{" +
                "denominationQuantity=" + denominationQuantity +
                "denominationValue=" + getDenominationValue() +
                '}';
    }
}
