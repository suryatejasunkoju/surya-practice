package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    public void reset() {
        car = new Car();
    }

    public void setSeats(int number) {
        car.setSeats(number);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setTripComputer() {
        car.setTripComputer(true);
    }

    public void setGPS() {
        car.setGPS(true);
    }

    public Car getResult() {
        return car;
    }
}
