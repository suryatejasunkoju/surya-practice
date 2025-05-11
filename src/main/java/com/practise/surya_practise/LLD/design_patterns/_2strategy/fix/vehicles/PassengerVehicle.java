package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles;


import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
