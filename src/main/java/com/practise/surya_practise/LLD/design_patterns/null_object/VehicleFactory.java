package com.practise.surya_practise.LLD.design_patterns.null_object;

public class VehicleFactory
{
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return new NullVehicle();
        }
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }
        else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

//        return null;
        //here we have to return null but we are returning null object
        //so that we can avoid null pointer exception in the client code
        //which is using this factory
        return new NullVehicle();
    }
}
