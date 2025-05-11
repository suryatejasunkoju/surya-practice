package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles;


import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
