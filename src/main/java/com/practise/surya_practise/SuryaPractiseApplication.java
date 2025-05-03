package com.practise.surya_practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.function.Function;


@SpringBootApplication
public class SuryaPractiseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SuryaPractiseApplication.class, args);
//		generateJwtSecret();

//		SOLID Principles:
//		SingleResponsibilityIssue.run();
//		SingleResponsibilityFix.run();
//		OpenForExtensionClosedForModificationIssue.run();
//		OpenForExtensionClosedForModificationFix fix = new OpenForExtensionClosedForModificationFix();
//		fix.run();


//		Design Patterns:
		
//		StrategyFix.run();
//		ObserverUnlikeHeadFirstDesignPatterns.run();
//		observerPatternLikeHeadFirstDesignPatterBook();

		List<String> phoneNoList= List.of(
				"+971524399016"
		);
		for (int i = 0; i < phoneNoList.size(); i++) {
			String mobile = phoneNoList.get(i);
			String otp = generateOtpWithMobile(mobile);
			System.out.println(mobile+" : "+otp);
		}
	}
	public static String generateOtpWithMobile(String mobile)
	{
		try {
			// Step 1: Normalize the mobile number (remove spaces, dashes, etc.)
			String normalizedMobile = mobile.replaceAll("[^0-9]", "");

			// Step 2: Create a hash of the mobile number using SHA-256
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = digest.digest(normalizedMobile.getBytes(StandardCharsets.UTF_8));

			Function<Object, Long> bytesToLong = (obj) -> {
				byte[] bytes = (byte[]) obj;
				long value = 0L;
				for (int i = 0; i < Math.min(bytes.length, 8); i++) {
					value = (value << 8) + (bytes[i] & 0xff);
				}
				return value;
			};
			// Step 3: Convert the hash to a positive long value
			long hashValue = Math.abs(bytesToLong.apply(hashBytes));

			// Step 4: Generate a 4-digit OTP by taking modulo and ensuring 4 digits
			int otp = (int) (hashValue % 10000); //for 4 digits

			// Step 5: Pad with leading zeros if necessary to ensure 6 digits
			return String.format("%04d", otp);

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error generating OTP: " + e.getMessage());
		}
	}
}
