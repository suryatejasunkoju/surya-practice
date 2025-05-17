package com.practise.surya_practise.LLD.design_patterns.adapter;

import com.practise.surya_practise.LLD.design_patterns.adapter.adaptee.WeightMachineImpl;
import com.practise.surya_practise.LLD.design_patterns.adapter.adapter.WeightMachineAdapter;
import com.practise.surya_practise.LLD.design_patterns.adapter.adapter.WeightMachineAdapterImpl;

public class AdapterClient
{
    public static void run()
    {
        //Adapter Pattern is a structural design pattern.
        //It's a bridge between existing & expected interface.



        //Real World Examples of Adapter Pattern:
        //1.Mobile phone charging port is C-type. But socket in switch board has 3 pins.
        // So, charger which bridges the gap between C-type and 3 pins is an adapter.
        //2.Plants need nutrients in liquid form from soil, soil has nutrients in solid form.
        // Roots of plant act as adapter to convert solid nutrients into liquid form.
        //3.Humans think in language. But computer understands binary language. Programming language acts as adapter between human and computer.

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println("In AdapterClient, Weight in kgs: " + weightMachineAdapter.convertWeightFromPoundsToKgs());
    }
}
