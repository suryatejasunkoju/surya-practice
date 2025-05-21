package com.practise.surya_practise.LLD.design_patterns;


import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.StrategyFix;
import com.practise.surya_practise.LLD.design_patterns._2strategy.issue.StrategyIssue;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.Amazon;
import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.ObserverUnlikeHeadFirstDesignPatterns;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1.CoffeeShop1;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.CoffeeShop2;
import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.PizzaShop;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.AbstractFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.simple_factory.FactoryClient;
import com.practise.surya_practise.LLD.design_patterns.adapter.AdapterClient;
import com.practise.surya_practise.LLD.design_patterns.builder.BuilderClient;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.ChainOfResponsibilityClient;
import com.practise.surya_practise.LLD.design_patterns.null_object.VehicleClient;
import com.practise.surya_practise.LLD.design_patterns.proxy.ProxyClient;

public class DesignPatternsClient
{
    // Design Patterns are standard solutions to common software design problems.
    // They provide a way to structure code, making it more reusable, maintainable, and scalable.
    // Design Patterns are guidelines for how to solve a problem in a way that can be reused in many different situations.


    // Design Patterns are categorized into three main types:
    // 1. Creational Design Patterns:
    //Definition:
    // Creational design patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
    // They increase flexibility and reuse of existing code.


    // 2. Structural Design Patterns
    //Definition:
    // Structural design patterns deal with object composition, creating relationships between objects to form larger structures.
    // They help ensure that if one part of a system changes, the entire system doesn't need to change.

    // 3. Behavioral Design Patterns
    //Definition:
    // Behavioral design patterns deal with object collaboration and responsibility delegation.
    // They help define how objects interact in a system, focusing on communication between objects.
    // They help make complex control flows manageable and understandable.



    // 1. Creational Design Patterns:
    //    - Singleton Pattern
    //    - Factory Pattern
    //    - Abstract Factory Pattern
    //    - Builder Pattern
    //    - Prototype Pattern
    // 2. Structural Design Patterns:
    //    - Adapter Pattern
    //    - Bridge Pattern
    //    - Composite Pattern
    //    - Decorator Pattern
    //    - Facade Pattern
    //    - Flyweight Pattern
    //    - Proxy Pattern
    // 3. Behavioral Design Patterns:
    //    - Chain of Responsibility Pattern
    //    - Command Pattern
    //    - Interpreter Pattern
    //    - Iterator Pattern
    //    - Mediator Pattern
    //    - Memento Pattern
    //    - Observer Pattern
    //    - State Pattern
    //    - Strategy Pattern
    //    - Template Method Pattern
    //    - Visitor Pattern



    //### ✅ **Important Design Patterns:
    //1. Strategy Pattern
    //2. Observer Pattern
    //3. Decorator Pattern
    //4. Factory Pattern
    //5. Abstract Factory Pattern
    //6. Chain of Responsibility Pattern
    //7. Proxy Pattern
    //8. Null Object Pattern
    //9. State Pattern
    //10. Composite Pattern
    //11. Adapter Pattern
    //12. Singleton Pattern
    //13. Builder Pattern
    //14. Prototype Pattern
    //15. Bridge Pattern
    //16.Façade Pattern-Splitwise simplification algo

    //### 📄 **Other Design Patterns
    //2. Flyweight Pattern
    //3. Command Pattern
    //4. Interpreter Pattern
    //5. Iterator Pattern
    //6. Mediator Pattern
    //7. Memento Pattern

	public static void run() {
		//		Design Patterns:
//		Strategy Design pattern:
		StrategyIssue.run();
		StrategyFix.run();

//		Observer Design Pattern:
		ObserverUnlikeHeadFirstDesignPatterns.run();
		Amazon.run();

//		Decorator pattern
		CoffeeShop1.run();
		CoffeeShop2.run();
		PizzaShop.run();

//		Factory pattern
		FactoryClient.run();
		AbstractFactory.run();

//		Adapter pattern:
		AdapterClient.run();

//		Null Object pattern:
		VehicleClient.run();

//		ChainOfResponsibility pattern:
		ChainOfResponsibilityClient.run();
//		Proxy pattern:
		ProxyClient.run();

//		Builder pattern:
		BuilderClient.run();

	}
}
