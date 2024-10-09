package com.example.tricountlevrai;
import java.util.List;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String password;
    private List<String> roles;

    public User(int id, String nom, String prenom, String email, String tel, String password, List<String> roles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.password = password;
        this.roles = roles;
    }

    // Getters et Setters

}