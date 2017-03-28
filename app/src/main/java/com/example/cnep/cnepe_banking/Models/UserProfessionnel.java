package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-26.
 */

public class UserProfessionnel extends User {
    private String nom;
    private String prenom;
    private String date_Naissance;
    private String lieu_Naissance;
    private String situation_Familiale;
    private String email;
    private String sexe;
    private String adresse;

    public UserProfessionnel(int ID, String userId, String type, String telephone, String nom, String prenom, String date_Naissance, String lieu_Naissance, String situation_Familiale, String email, String sexe, String adresse) {
        super(ID, userId, type, telephone);
        this.nom = nom;
        this.prenom = prenom;
        this.date_Naissance = date_Naissance;
        this.lieu_Naissance = lieu_Naissance;
        this.situation_Familiale = situation_Familiale;
        this.email = email;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_Naissance() {
        return date_Naissance;
    }



    public String getLieu_Naissance() {
        return lieu_Naissance;
    }



    public String getSituation_Familiale() {
        return situation_Familiale;
    }

    public void setSituation_Familiale(String situation_Familiale) {
        this.situation_Familiale = situation_Familiale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }



    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
