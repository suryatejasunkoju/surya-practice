package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.features;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.Beverage;

public class MilkDecorator extends AddOnDecorator
{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+" + Milk";
    }
    @Override
    public Double getCost() {
        Double milkCost = 0.5;
        System.out.println("milkCost="+milkCost);
        return beverage.getCost() + milkCost;
    }
}
