package com.trello.qa.model;

public class User {
    String email;
    String passwrod;

    public String getEmail() {
        return email;

    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public User setPasswrod(String passwrod) {
        this.passwrod = passwrod;
        return this;
    }
}
