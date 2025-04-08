package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles;

import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives.DriveStrategy;

public class Vehicle
{
    //Vehicle has a drive strategy interface & Child classes will implement the interface using constructor with super()
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy = driveStrategy;
        System.out.println("Vehicle Initialized");
    }
    public void drive()
    {
        //calling drive method of the drive strategy interface
        driveStrategy.drive();
    }
}
