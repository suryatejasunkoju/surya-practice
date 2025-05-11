package com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.decorators;

import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.BasePizza;

public abstract class ToppingDecorator extends BasePizza
{
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public abstract Double getCost();

//    @Override
//    public String toString() {
//        return basePizza.toString();
//    }
}
