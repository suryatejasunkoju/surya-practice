package com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2;


import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.features.MilkDecorator;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.features.SugarDecorator;

public class CoffeeShop2
{
    public static void run()
    {
        Beverage expresso = new Expresso();
        System.out.println("1.========="+expresso);

        expresso = new SugarDecorator(expresso);//adding sugar to base class expresso
        System.out.println("2.========="+expresso);

        expresso = new MilkDecorator(expresso);//adding milk to base class expresso
        System.out.println("3.========="+expresso);

    }
}
