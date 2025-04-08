package com.practise.surya_practise.LLD.utils;

import java.security.SecureRandom;
import java.util.Base64;

public class Utility
{
    public static void generateJwtSecret() {
        byte[] key = new byte[64]; // 512-bit key
        new SecureRandom().nextBytes(key);
        String secret = Base64.getEncoder().encodeToString(key);
        System.out.println("JwtSecret=" + secret);
    }
}
