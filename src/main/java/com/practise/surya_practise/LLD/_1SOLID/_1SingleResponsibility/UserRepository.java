package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility;

import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    public void save(User user) {
        System.out.println("User saved to the database: " + user);
    }
}
