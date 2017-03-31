package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class CompteView {
    public String compteId;
    public String rib;
    public String type;
    public double solde;

    public CompteView(String compteId, String rib, String type, double solde) {
        this.compteId = compteId;
        this.rib = rib;
        this.type = type;
        this.solde = solde;
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
}
