package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.features;


import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.Beverage;

public abstract class AddOnDecorator implements Beverage//AddOnDecorator is a Beverage
{
    protected Beverage beverage;//AddOnDecorator has a Beverage

    AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "{"+getDescription() + " : " + getCost()+"}";
    }
}