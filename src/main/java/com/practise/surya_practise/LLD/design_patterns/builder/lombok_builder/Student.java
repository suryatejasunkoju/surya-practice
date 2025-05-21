package com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder;


import lombok.Builder;

@Builder
public class Student
{
    private String studentId;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    private String course;
    private String university;
    private String graduationYear;
}
