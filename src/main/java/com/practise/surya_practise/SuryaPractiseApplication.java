package com.practise.surya_practise;


import com.practise.surya_practise.DSA.DsaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SuryaPractiseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SuryaPractiseApplication.class, args);
//		SolidPrinciplesClient.run();
//		DesignPatternsClient.run();
		DsaClient.run();
	}
}
