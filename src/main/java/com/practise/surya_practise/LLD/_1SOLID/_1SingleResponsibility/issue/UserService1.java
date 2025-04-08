package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.issue;

import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.User;
import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {

//    @Autowired
    private UserRepository userRepository = new UserRepository();

    void registerUser(User user) {
        System.out.println("Registering user: " + user.getName());
        userRepository.save(user);
        sendUserRegistrationEmail(user);
    }

    private void sendUserRegistrationEmail(User user) {
        System.out.println("Sending registration email to: " + user.getName());
    }
}
