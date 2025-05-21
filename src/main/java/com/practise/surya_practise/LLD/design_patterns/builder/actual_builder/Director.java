package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class Director {
    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUVEngine");
        builder.setTripComputer();
        builder.setGPS();
    }
}
