package com.practise.surya_practise.LLD.design_patterns._2strategy.issue;



public class StrategyIssue
{
    public static void run()
    {
        Vehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();
        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
