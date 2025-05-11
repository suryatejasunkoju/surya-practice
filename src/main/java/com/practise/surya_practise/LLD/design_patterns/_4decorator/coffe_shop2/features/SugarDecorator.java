package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.features;

import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.Beverage;

public class SugarDecorator extends AddOnDecorator
{
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " + Sugar";
    }

    @Override
    public Double getCost() {
        Double sugarCost = 0.1;
        System.out.println("sugarCost="+sugarCost);
        return beverage.getCost() + sugarCost;
    }
}
