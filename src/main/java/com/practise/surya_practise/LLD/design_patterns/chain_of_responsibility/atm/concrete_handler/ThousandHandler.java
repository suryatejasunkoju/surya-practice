package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler;

public class ThousandHandler implements Handler
{
    public int denominationQuantity;

    public ThousandHandler(int denominationQuantity){
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
        return 1000;
    }
    @Override
    public String toString() {
        return "ThousandHandler{" +
                "denominationQuantity=" + denominationQuantity +
                "denominationValue=" + getDenominationValue() +
                '}';
    }
}
