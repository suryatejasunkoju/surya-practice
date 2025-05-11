package com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.decorators;

import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.BasePizza;

public class Cheese extends ToppingDecorator
{
    public Cheese(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public Double getCost() {
        return basePizza.getCost() + 10.0;
    }
}
