package com.practise.surya_practise.LLD.design_patterns._5factory;

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
