package com.example.hams;

import android.location.Address;

import java.util.HashMap;

public class User {

    // Attributes
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;

    //Address should be a map of size 5 and store, address, postal code, country, province and city:
    private HashMap<String,String> address;

    public User(String firstName, String lastName, String username, String password,
                String phoneNumber, HashMap<String,String> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Constructor with no parameters
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.phoneNumber = "";
    }

    // Getters and Setters for each attribute

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HashMap<String, String> getAddress() {
        return address;
    }

    public void setAddress(HashMap<String,String> address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "User: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'';
    }

}