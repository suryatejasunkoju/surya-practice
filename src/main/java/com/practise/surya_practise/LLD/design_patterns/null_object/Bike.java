package com.practise.surya_practise.LLD.design_patterns.null_object;

public class Bike implements Vehicle {
    @Override
    public Integer getSpeed() {
        return 80;
    }

    @Override
    public String getName() {
        return "Bike";
    }
}
