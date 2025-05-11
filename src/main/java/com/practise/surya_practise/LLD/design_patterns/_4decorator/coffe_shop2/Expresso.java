package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2;

public class Expresso implements Beverage
{

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }

    @Override
    public String toString() {
        return "{"+getDescription() + " : " + getCost()+"}";
    }
}
