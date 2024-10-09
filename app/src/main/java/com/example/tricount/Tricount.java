package com.example.tricount;

import java.io.Serializable;

public class Tricount implements Serializable {
    private int id;          // Si tu veux avoir un identifiant
    private String name;
    private String date;
    private String type;

    // Constructeur qui accepte 2 paramètres
    public Tricount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Constructeur qui accepte 4 paramètres
    public Tricount(int id, String name, String date, String type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
