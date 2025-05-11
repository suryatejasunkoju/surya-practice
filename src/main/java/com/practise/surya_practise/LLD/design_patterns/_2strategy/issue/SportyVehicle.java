package com.practise.surya_practise.LLD.design_patterns._2strategy.issue;

public class SportyVehicle extends Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle with special drive capability");
        //same implementation is duplicated in OffRoadVehicle class.
    }
}
