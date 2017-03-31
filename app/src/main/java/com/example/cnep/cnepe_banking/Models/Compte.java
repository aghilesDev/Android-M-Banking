package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-27.
 */

public class Compte extends EntityBase {

    public String compteId;
    public String type;
    public double solde;
    public boolean opposition;
    public String date_Creation;
    public String date_Cloture;
    public String motif_Cloture;
    public String rib;
    public int clientId;



    public Compte(int ID, String compteId, String type, double solde, boolean opposition, String date_Creation, String date_Cloture, String motif_Cloture, String rib, int clientId) {
        super(ID);
        this.compteId = compteId;
        this.type = type;
        this.solde = solde;
        this.opposition = opposition;
        this.date_Creation = date_Creation;
        this.date_Cloture = date_Cloture;
        this.motif_Cloture = motif_Cloture;
        this.rib = rib;
        this.clientId = clientId;
    }

    public String getCompteId() {
        return compteId;
    }

    public String getType() {
        return type;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isOpposition() {
        return opposition;
    }

    public String getDate_Creation() {
        return date_Creation;
    }

    public String getDate_Cloture() {
        return date_Cloture;
    }

    public String getMotif_Cloture() {
        return motif_Cloture;
    }

    public String getRib() {
        return rib;
    }

    public int getClientId() {
        return clientId;
    }
}
