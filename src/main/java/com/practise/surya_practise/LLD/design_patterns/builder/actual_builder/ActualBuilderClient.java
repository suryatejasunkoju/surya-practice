package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class ActualBuilderClient
{
    public static void run()
    {
        //Builder Pattern using @Builder lombok annotation
        //lombok creates StudentBuilder static class, hover on "Student.builder()" in below line.
        System.out.println("Actual Builder Pattern Example");
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();


        // Build a car
        director.makeSportsCar(carBuilder);
        Car sportsCar = carBuilder.getResult();
        System.out.println("sportsCar:"+sportsCar);

        // Build a manual
        director.makeSportsCar(manualBuilder);
        Manual sportsManual = manualBuilder.getResult();
        System.out.println("sportsManual:"+sportsManual);

        // Build a car
        director.makeSUV(carBuilder);
        Car suvCar = carBuilder.getResult();
        System.out.println("suvCar:"+suvCar);

        // Build a manual
        director.makeSUV(manualBuilder);
        Manual suvManual = manualBuilder.getResult();
        System.out.println("suvManual:"+suvManual);
    }
}
