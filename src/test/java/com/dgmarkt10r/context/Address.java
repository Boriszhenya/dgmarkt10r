package com.dgmarkt10r.context;

public class Address {
    public String firstName;
    public String lastName;
    public String company;
    public String address1;
    public String address2;
    public String city;
    public String postCode;
    public String country;
    public String regionState;

    public Address(String firstName, String lastName, String company, String address1, String address2, String city, String postCode, String country, String regionState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.regionState = regionState;
    }
}