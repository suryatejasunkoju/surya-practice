package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.fix;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService
{

    @Override
    public void sendUserRegistrationEmail(String email) {
        System.out.println("Sending registration email to: " + email);
    }
}
