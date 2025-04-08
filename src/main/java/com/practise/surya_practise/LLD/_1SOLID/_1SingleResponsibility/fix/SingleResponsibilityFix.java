package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.fix;

import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.User;

public class SingleResponsibilityFix
{
    public static void run(){
        UserService userService = new UserService();
        userService.registerUser(new User("teja"));
    }
}
