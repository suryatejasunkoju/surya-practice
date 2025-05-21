package com.practise.surya_practise.LLD.design_patterns.builder.lombok_builder;

import lombok.ToString;

@ToString
public class User
{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;

    public User(){}

    public User(String firstName, String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //static Builder class with same attributes as User class
    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;

        //instead of setters, we use attribute name as methods to set the values of UserBuilder class
        // but not User class & return UserBuilder object
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //build() method create new User object & set all fields from UserBuilder object
        public User build()
        {
            User user = new User();
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.email = this.email;
            user.phoneNumber = this.phoneNumber;
            user.address = this.address;
            return user;
        }
    }
    public static UserBuilder builder() {
        return new UserBuilder();
    }
}
