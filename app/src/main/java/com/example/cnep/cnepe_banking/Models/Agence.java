package com.example.cnep.cnepe_banking.Models;

import com.example.cnep.cnepe_banking.Models.EntityBase;

/**
 * Created by Aghiles on 2017-03-23.
 */

public class Agence extends EntityBase {
    public String libelle;
    public String telephone;
    public String fax;
    public String ville;
    public String adresse;

    public Agence(int ID, String libelle, String telephone, String fax, String ville, String adresse) {
        super(ID);
        this.libelle = libelle;
        this.telephone = telephone;
        this.fax = fax;
        this.ville = ville;
        this.adresse = adresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }
}
