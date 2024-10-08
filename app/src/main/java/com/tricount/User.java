package com.tricount;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String tel;
    private String password;
    private String roles;

    public User(int id, String firstName, String lastName, String tel, String password, String roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.password = password;
        this.roles = roles;
    }

    public String getFullName() {
        return this.id + " " + this.firstName + " " + this.lastName + " " + (this.firstName + "." + this.lastName).toLowerCase() + "@tricount.com" + " " + this.tel + " " + this.password + " " + this.roles;
    }
}