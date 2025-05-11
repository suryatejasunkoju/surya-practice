package com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop;

public abstract class BasePizza
{
    public abstract Double getCost();

    @Override
    public String toString() {
        return "{ cost="+this.getCost()+"}";
    }
}
