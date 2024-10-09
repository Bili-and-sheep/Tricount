package com.example.tricount;

public class CB {
    private String numeroCard;
    private String ccv;
    private String dateExpi;

    // Constructeur
    public CB(String numeroCard, String ccv, String dateExpi) {
        this.numeroCard = numeroCard;
        this.ccv = ccv;
        this.dateExpi = dateExpi;
    }

    // Getters et Setters
    public String getNumeroCard() {
        return numeroCard;
    }

    public void setNumeroCard(String numeroCard) {
        this.numeroCard = numeroCard;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getDateExpi() {
        return dateExpi;
    }

    public void setDateExpi(String dateExpi) {
        this.dateExpi = dateExpi;
    }

    @Override
    public String toString() {
        return "CB{" +
                "numeroCard='" + numeroCard + '\'' +
                ", ccv='" + ccv + '\'' +
                ", dateExpi='" + dateExpi + '\'' +
                '}';
    }
}
