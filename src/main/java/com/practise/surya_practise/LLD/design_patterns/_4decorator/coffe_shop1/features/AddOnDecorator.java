package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1.features;

import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1.Beverage;

public abstract class AddOnDecorator extends Beverage//AddOnDecorator is a Beverage
{
    protected Beverage beverage;//AddOnDecorator has a Beverage

    AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
