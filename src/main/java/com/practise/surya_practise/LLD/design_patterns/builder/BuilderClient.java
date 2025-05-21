package com.practise.surya_practise.LLD.design_patterns.builder;

import com.practise.surya_practise.LLD.design_patterns.builder.actual_builder.ActualBuilderClient;
import com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder.Company;
import com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder.LombokBuilderClient;
import com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder.Student;
import com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder.User;

public class BuilderClient
{
    public static void run()
    {
        //telescoping constructor antipattern:
        //When a class has multiple constructors with different number of parameters, it is called telescoping constructor anti-pattern.
        //This is a bad design pattern, because it makes the code hard to read and maintain.
        //It is hard to remember the order of parameters and their types.
        //It is hard to add new parameters in the middle of the constructor.
        //It is hard to create a new object with default values for some parameters.

        //Builder Pattern:
        // creational design pattern used to create complex objects step by step.
        //solves the problem of telescoping constructor antipattern.
        //solves the problem of making fields mandatory.
        //solves the problem of making fields immutable.

//        Key Participants:
//        Builder Interface: Defines an interface for creating parts of the Product object.
//        It specifies the steps involved in building the object.
//        Concrete Builder: Implements the Builder interface to construct and assemble parts of a
//        specific representation of the Product. Each concrete builder is responsible for creating a
//        specific type of the Product.
//        Product: The complex object being constructed.
//        Director (Optional): A class that is responsible for defining the order in which the builder
//        steps should be executed. It takes a Builder instance and guides the construction process.
//        The client can also directly interact with the Concrete Builder without using a Director.

        //pros & cons:
        //Pros:
        //You can construct objects step-by-step, defer construction steps or run steps recursively.
        // You can reuse the same construction code when building various representations of products.
        // Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
        //cons:
        //The overall complexity of the code increases since the pattern requires creating multiple new classes.


        //Builder pattern vs Decorator pattern:
        //
        System.out.println("Builder Pattern Example");
//        LombokBuilderClient.run();
        ActualBuilderClient.run();
    }
}
