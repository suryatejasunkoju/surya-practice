package com.practise.surya_practise.LLD.design_patterns._2strategy.fix.drives;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving a vehicle with normal capacity");
    }
}
