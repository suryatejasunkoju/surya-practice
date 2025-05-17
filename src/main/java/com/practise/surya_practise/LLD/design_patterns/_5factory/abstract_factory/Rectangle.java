package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory;


public class Rectangle implements NonCurvedShape {
    @Override
    public void draw() {
        System.out.println("Drawing::NonCurvedShape::Rectangle");
    }
}
