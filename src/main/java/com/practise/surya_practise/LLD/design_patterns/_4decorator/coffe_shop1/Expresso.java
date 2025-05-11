package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1;

public class Expresso extends Beverage//Base Class
{
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
