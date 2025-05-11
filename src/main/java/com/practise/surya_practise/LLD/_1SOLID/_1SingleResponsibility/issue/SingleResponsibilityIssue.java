package com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.issue;

import com.practise.surya_practise.LLD._1SOLID._1SingleResponsibility.User;

public class SingleResponsibilityIssue
{
    public static void run(){
        UserService1 userService1 = new UserService1();
        userService1.registerUser(new User("surya"));
    }
}
