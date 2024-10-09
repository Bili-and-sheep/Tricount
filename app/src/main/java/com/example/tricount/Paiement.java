package com.example.tricount;

import java.util.Date;

public class Paiement {
    private int id;
    private String nom;
    private double montantPaiement;
    private Date date;
    private String enseigne;

    public Paiement(int id, String nom, double montantPaiement, Date date, String enseigne) {
        this.id = id;
        this.nom = nom;
        this.montantPaiement = montantPaiement;
        this.date = date;
        this.enseigne = enseigne;
    }

    // Getters et Setters
}