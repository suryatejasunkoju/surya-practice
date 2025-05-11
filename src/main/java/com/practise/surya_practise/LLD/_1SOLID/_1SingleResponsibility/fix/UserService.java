package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.fix;

import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.User;
import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
    private UserRepository userRepository=new UserRepository();

//    @Autowired
    private EmailService emailService=new EmailServiceImpl();

    void registerUser(User user) {
        System.out.println("Registering user: " + user.getName());
        userRepository.save(user);
        emailService.sendUserRegistrationEmail(user.getName());
    }
}
