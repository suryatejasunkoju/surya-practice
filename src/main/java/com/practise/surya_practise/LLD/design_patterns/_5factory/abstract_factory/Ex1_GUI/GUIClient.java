package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.Button;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory_of_factory.GUIFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory.MacGUIFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.factory.WindowsGUIFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex1_GUI.abstract_products.TextField;

public class GUIClient
{
    public static void run()
    {
        //Here, GUIFactory is the abstract factory.
        // and WindowsGUIFactory and MacGUIFactory are concrete factories
        // that implement the GUIFactory interface.
        // The client code uses the GUIFactory interface to create GUI Factories
        // and the concrete factories create the specific GUI objects.
        System.out.println("Running GUIClient...");
        String osType = "Mac"; // This could be determined at runtime
        System.out.println("OS Type: " + osType);
        // Create a GUI factory
        GUIFactory factory = null;
        if (osType.equals("Windows")) {
            factory = new WindowsGUIFactory();
        }
        else if (osType.equals("Mac"))
        {
            factory = new MacGUIFactory();
        }
        else {
            throw new UnsupportedOperationException("Unsupported OS type: " + osType);
        }

        // Create a button and text field using the factory
        Button button = factory.createButton(); // This will create a WindowsButton or MacButton
        TextField textField = factory.createTextField(); // This will create a WindowsTextField or MacTextField
        System.out.println("Button: " + button);
        System.out.println("TextField: " + textField);
    }
}
