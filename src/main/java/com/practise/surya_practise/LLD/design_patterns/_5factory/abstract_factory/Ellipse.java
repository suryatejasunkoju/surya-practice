package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory;

public class Ellipse implements CurvedShape{
    @Override
    public void draw() {
        System.out.println("Drawing::CurvedShape::Ellipse");
    }
}
