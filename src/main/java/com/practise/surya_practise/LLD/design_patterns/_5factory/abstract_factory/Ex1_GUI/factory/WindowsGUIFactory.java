package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.Button;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.TextField;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.concrete_products.button.WindowsButton;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.concrete_products.textfield.WindowsTextField;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory_of_factory.GUIFactory;

public class WindowsGUIFactory implements GUIFactory
{
    public Button createButton() {
        return new WindowsButton();
    }
    public TextField createTextField() {
        return new WindowsTextField();
    }
    @Override
    public String toString() {
        return "WindowsGUIFactory";
    }
}
