package com.practise.surya_practise.LLD.design_patterns.adapter.adapter;

import com.practise.surya_practise.LLD.design_patterns.adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter
{
    private final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine)
    {
        System.out.println("In WeightMachineAdapterImpl constructor");
        this.weightMachine = weightMachine;
    }

    @Override
    public double convertWeightFromPoundsToKgs()
    {
        System.out.println("In WeightMachineAdapterImpl, convertWeightFromPoundsToKgs");
        double weightInPounds = weightMachine.getWeightInPounds();
        //logic to  convert pounds to kgs
        double weightInKgs = weightInPounds * 0.45359237;
        System.out.println("In WeightMachineAdapterImpl, weightInKgs: " + weightInKgs);
        //Adapter is talking with Adaptee(WeightMachine) & responding to Client(AdapterClient) in a way that it understands.
        return weightInKgs;
    }
}
