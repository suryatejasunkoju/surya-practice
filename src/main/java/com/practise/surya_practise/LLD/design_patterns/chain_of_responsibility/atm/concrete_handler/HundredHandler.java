package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler;

public class HundredHandler implements Handler
{

    public int denominationQuantity;
    public HundredHandler(int denominationQuantity){
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
        return 100;
    }
    @Override
    public String toString() {
        return "HundredHandler{" +
                "denominationQuantity=" + denominationQuantity +
                "denominationValue=" + getDenominationValue() +
                '}';
    }
}
