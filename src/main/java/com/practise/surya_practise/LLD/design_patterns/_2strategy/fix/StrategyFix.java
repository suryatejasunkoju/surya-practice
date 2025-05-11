package com.practise.surya_practise.LLD.design_patterns._2strategy.fix;

import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles.*;

public class StrategyFix
{
    public static void run()
    {
            System.out.println("StrategyFix run:");
            Vehicle sportyVehicle = new SportyVehicle();
            sportyVehicle.drive();
            Vehicle passengerVehicle = new PassengerVehicle();
            passengerVehicle.drive();
            Vehicle offRoadVehicle = new OffRoadVehicle();
            offRoadVehicle.drive();
            Vehicle goodsVehicle = new GoodsVehicle();
            goodsVehicle.drive();
    }
}
