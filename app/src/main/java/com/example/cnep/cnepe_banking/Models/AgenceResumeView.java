package com.example.cnep.cnepe_banking.Models;

import java.io.Serializable;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class AgenceResumeView implements Serializable{
    private int id;
    private String wilaya;
    private String libelle;
    private String adresse;
    private String telephone;
    private String email;

    public AgenceResumeView(int id, String libelle,String wilaya,String adresse,String telephone,String email) {
        this.id = id;
        this.wilaya = wilaya;
        this.libelle = libelle;
        this.adresse=adresse;
        this.telephone=telephone;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getWilaya() {
        return wilaya;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "id"+id+"\nwilaya"+wilaya+"\nlibelle"+libelle+"\nadresse"+adresse+"\ntelephone"+telephone+"\nemail"+email;
    }
}
