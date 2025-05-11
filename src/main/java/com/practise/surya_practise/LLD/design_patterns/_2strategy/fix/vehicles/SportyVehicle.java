package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles;

import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives.SpecialDrive;

public class SportyVehicle extends Vehicle{
    public SportyVehicle() {
        super(new SpecialDrive());
        System.out.println("Sporty Vehicle Initialized");
    }
}
