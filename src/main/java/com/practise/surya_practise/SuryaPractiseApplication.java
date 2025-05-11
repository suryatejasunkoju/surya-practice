package com.practise.surya_practise;


import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.fix.SingleResponsibilityFix;
import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.issue.SingleResponsibilityIssue;
import com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.fix.OpenForExtensionClosedForModificationFix;
import com.practise.surya_practise.LLD._1SOLID._2OpenForExtensionClosedForModification.issue.OpenForExtensionClosedForModificationIssue;
import com.practise.surya_practise.LLD.design_patterns._2strategy.fix.StrategyFix;
import com.practise.surya_practise.LLD.design_patterns._3observer.amazon.Amazon;
import com.practise.surya_practise.LLD.design_patterns._3observer.weather_station.UnlikeHeadFirstDesignPatterns.ObserverUnlikeHeadFirstDesignPatterns;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop1.CoffeeShop1;
import com.practise.surya_practise.LLD.design_patterns._4decorator.coffe_shop2.CoffeeShop2;
import com.practise.surya_practise.LLD.design_patterns._4decorator.pizza_shop.PizzaShop;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SuryaPractiseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SuryaPractiseApplication.class, args);

//		SOLID Principles:
		SingleResponsibilityIssue.run();
		SingleResponsibilityFix.run();
		OpenForExtensionClosedForModificationIssue.run();
//		OpenForExtensionClosedForModificationFix fix = new OpenForExtensionClosedForModificationFix();
//		fix.run();


//		Design Patterns:

//		Strategy Design pattern:
		StrategyFix.run();

//		Observer Design Pattern:
		ObserverUnlikeHeadFirstDesignPatterns.run();
		Amazon.run();

//		Decorator pattern
		CoffeeShop1.run();
		CoffeeShop2.run();
		PizzaShop.run();

//		Factory pattern

	}
}
