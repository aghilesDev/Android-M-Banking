package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class AgenceResumeView {
    private int id;
    private String wilaya;
    private String libelle;

    public AgenceResumeView(int id, String libelle,String wilaya) {
        this.id = id;
        this.wilaya = wilaya;
        this.libelle = libelle;
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
}
