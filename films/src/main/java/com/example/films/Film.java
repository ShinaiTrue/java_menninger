package com.example.films;

public class Film {
    int rang;
    String id;
    String nom;
    int annee;
    String acteur;

    public int getRang() {
        return rang;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }

    public String getActeur() {
        return acteur;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }
}
