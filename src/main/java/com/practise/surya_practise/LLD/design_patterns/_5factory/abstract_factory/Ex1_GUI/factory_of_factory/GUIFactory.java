package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory_of_factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.Button;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}
