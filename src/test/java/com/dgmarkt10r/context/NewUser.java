package com.dgmarkt10r.context;

import com.github.javafaker.Faker;

public class NewUser {
    public String firstName;
    public String lastName;
    public String email;
    public String telephone;
    public String password;

    static Faker faker = new Faker();

    public NewUser() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.telephone = faker.phoneNumber().phoneNumber();
        this.password = faker.regexify("[a-zA-Zd!@#$%^&*()_+]{8,15}");
    }
}