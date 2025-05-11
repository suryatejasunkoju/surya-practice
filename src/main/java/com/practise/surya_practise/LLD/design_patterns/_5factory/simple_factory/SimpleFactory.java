package com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory;

public class SimpleFactory
{
    public static void run(){

        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // Get an object of Square and call its draw method.
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}
