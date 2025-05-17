package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.GUIClient;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.DbClient;

public class AbstractFactory
{
    public static void run()
    {
        GUIClient.run();
        DbClient.run();
    }
}
