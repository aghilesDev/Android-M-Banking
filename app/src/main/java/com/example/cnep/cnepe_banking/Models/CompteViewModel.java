package com.example.cnep.cnepe_banking.Models;

import java.io.Serializable;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class CompteViewModel implements Serializable{
    public String compteId;
    public String rib;
    public String type;
    public String DateMaj;
    public double solde;
    private boolean commande;

    public CompteViewModel(String compteId, String rib, String type, String DateMaj , double solde, boolean commande) {
        this.compteId = compteId;
        this.rib = rib;
        this.type = type;
        this.DateMaj=DateMaj;
        this.solde = solde;
        this.commande=commande;
    }

    public boolean isCommande() {
        return commande;
    }

    public String getCompteId() {
        return compteId;
    }

    public String getRib() {
        return rib;
    }

    public String getType() {
        return type;
    }

    public double getSolde() {
        return solde;
    }

    public String getDateMaj() {
        return DateMaj;
    }

    public void setCommande(boolean commande) {
        this.commande = commande;
    }
}
