package com.practise.surya_practise.LLD.design_patterns.null_object;

public class Car implements Vehicle {
    @Override
    public Integer getSpeed() {
        return 200;
    }

    @Override
    public String getName() {
        return "Car";
    }
}
