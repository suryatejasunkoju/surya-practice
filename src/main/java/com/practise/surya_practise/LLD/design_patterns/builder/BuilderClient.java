package com.practise.surya_practise.LLD.design_patterns.builder;

public class BuilderClient
{
    public static void run()
    {
        System.out.println("Builder Pattern Example");
        //Builder Pattern using @Builder lombok annotation
        //lombok creates StudentBuilder static class, hover on "Student.builder()" in below line.
        Student student = Student.builder()
                .studentId("S123")
                .name("John Doe")
                .age(20)
                .address("123 Main St")
                .phoneNumber("123-456-7890")
                .email("johndoe@gmail.com")
                .course("Computer Science")
                .university("XYZ University")
                .graduationYear("2025")
                .build();
        System.out.println("student="+student);

        //Builder Pattern using Custom Builder Implementation
        User user1 = User.builder()
                .firstName("John")
                .lastName("Doe")
                .email("johndoe@gmail.com")
                .address("123 Main St")
                .phoneNumber("123-456-7890")
                .build();
        System.out.println("user1="+user1);
        User user2 = new User("Jane", "Doe", "johndoe@valeo.com", "123-456-7890", "123 Main St");
        System.out.println("user2="+user2);

        //Builder Pattern using Custom Builder Implementation
        //Here, we are making name & industry as mandatory fields, and rest optional.
        //Also, enforcing to use builder() method to create object by not exposing constructor.
        Company company1 = Company.builder("name1", "industry1")
                .address("address")
                .phoneNumber("98765")
                .valueProposition("valueProposition")
                .website("website")
                .build();
        System.out.println("company1="+company1);
        Company company2 = Company.builder("name2", "industry2")
                .build();
        System.out.println("company2="+company2);
    }
}
