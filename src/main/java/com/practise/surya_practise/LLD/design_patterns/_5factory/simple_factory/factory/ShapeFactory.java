package com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.abstract_products.Shape;
import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.concrete_products.Circle;
import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.concrete_products.Rectangle;
import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.concrete_products.Square;

public class ShapeFactory
{
    public Shape getShape(String shapeType)
    {
        switch (shapeType)
        {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
