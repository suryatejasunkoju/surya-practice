package com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop;

import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.decorators.Cheese;
import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.decorators.Mushroom;

public class PizzaShop
{
    public static void run()
    {
        System.out.println("Pizza shop running");
        BasePizza margaritaBasePizza = new Margarita();
        System.out.println("1.++++++"+margaritaBasePizza);
        margaritaBasePizza = new Cheese(margaritaBasePizza);
        System.out.println("2.++++++"+margaritaBasePizza);
        margaritaBasePizza = new Mushroom(margaritaBasePizza);
        System.out.println("3.++++++"+margaritaBasePizza);
        margaritaBasePizza = new Cheese(margaritaBasePizza);
        System.out.println("4.++++++"+margaritaBasePizza);


        BasePizza vegDelightBasePizza = new VegDelight();
        System.out.println("5.++++++"+vegDelightBasePizza);
        vegDelightBasePizza = new Cheese(vegDelightBasePizza);
        System.out.println("6.++++++"+vegDelightBasePizza);
        vegDelightBasePizza = new Mushroom(vegDelightBasePizza);
        System.out.println("7.++++++"+vegDelightBasePizza);
        vegDelightBasePizza = new Cheese(vegDelightBasePizza);
        System.out.println("8.++++++"+vegDelightBasePizza);
    }
}
