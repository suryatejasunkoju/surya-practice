package com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.concrete_products;

import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.abstract_products.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing::Circle");
    }
}
