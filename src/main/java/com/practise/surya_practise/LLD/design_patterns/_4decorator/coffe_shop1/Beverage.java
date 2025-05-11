package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1;

public abstract class Beverage
{
    public abstract String getDescription();
    public abstract Double getCost();

    @Override
    public String toString() {
        return "{ desc="+this.getDescription()+", cost="+this.getCost()+"}";
    }
}
