package com.practise.surya_practise.LLD.design_patterns.null_object;

public class NullVehicle implements Vehicle
{
    @Override
    public Integer getSpeed() {
        return 0;
    }
    @Override
    public String getName() {
        return "";
    }
    @Override
    public String toString() {
        return "Null Vehicle";
    }
}
