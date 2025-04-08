package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.vehicles;


import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives.NormalDrive;

public class GoodsVehicle extends Vehicle{
    //adding new vehicle type is also easy
    public GoodsVehicle() {
        super(new NormalDrive());
    }
}
