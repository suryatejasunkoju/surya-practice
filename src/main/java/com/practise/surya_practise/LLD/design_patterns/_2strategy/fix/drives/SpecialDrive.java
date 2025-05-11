package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving a vehicle with special drive capability");
    }
}
