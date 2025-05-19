package com.practise.surya_practise;


import com.practise.surya_practise.LLD.design_patterns.builder.BuilderClient;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.ChainOfResponsibilityClient;
import com.practise.surya_practise.LLD.design_patterns.null_object.VehicleClient;
import com.practise.surya_practise.LLD.design_patterns.proxy.ProxyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SuryaPractiseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SuryaPractiseApplication.class, args);

//		SOLID Principles:
//		SingleResponsibilityIssue.run();
//		SingleResponsibilityFix.run();
//		OpenForExtensionClosedForModificationIssue.run();
//		OpenForExtensionClosedForModificationFix fix = new OpenForExtensionClosedForModificationFix();
//		fix.run();
//		OpenForExtensionClosedForModificationFix.run();


//		Design Patterns:

//		Strategy Design pattern:
//		StrategyIssue.run();
//		StrategyFix.run();

//		Observer Design Pattern:
//		ObserverUnlikeHeadFirstDesignPatterns.run();
//		Amazon.run();

//		Decorator pattern
//		CoffeeShop1.run();
//		CoffeeShop2.run();
//		PizzaShop.run();

//		Factory pattern
//		FactoryClient.run();
//		AbstractFactory.run();

//		Adapter pattern:
//		AdapterClient.run();

//		Null Object pattern:
//		VehicleClient.run();

//		ChainOfResponsibility pattern:
//		ChainOfResponsibilityClient.run();
//		Proxy pattern:
//		ProxyClient.run();

//		Builder pattern:
		BuilderClient.run();

	}
}
