package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.Button;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.concrete_products.button.MacButton;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.concrete_products.textfield.MacTextField;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.TextField;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory_of_factory.GUIFactory;

public class MacGUIFactory implements GUIFactory
{
    public Button createButton() {
        return new MacButton();
    }
    public TextField createTextField() {
        return new MacTextField();
    }
    @Override
    public String toString() {
        return "MacGUIFactory";
    }
}
