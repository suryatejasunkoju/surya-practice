package com.practise.surya_practise.LLD.design_patterns.null_object;

public class VehicleClient {

    public static void run()
    {
        // Null Object Pattern:
        // 1. Null Object is an object that has no value
        // Null Object exhibits default behavior or no behavior at all



        System.out.println("Null Object Pattern Example\n");
//        It will give NullPointerException,
//        or we have to handle null cases in every method call using Vehicle like below:

//        Vehicle vehicle = null;
//        System.out.println("1.vehicle=null");
//        if (vehicle!=null) {
//            System.out.println("1.Vehicle Name: " + vehicle.getName());
//            System.out.println("1.Vehicle Speed: " + vehicle.getSpeed());
//        }

        //here, we are using Factory Pattern along with Null Object Pattern
//        Vehicle vehicle = VehicleFactory.getVehicle("train");
//        System.out.println("2.vehicle="+vehicle);
//        System.out.println("2.Vehicle Name: " + vehicle.getName());
//        System.out.println("2.Vehicle Speed: " + vehicle.getSpeed());
    }
}
