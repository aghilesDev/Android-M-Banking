package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-27.
 */

public class Mouvement extends EntityBase {

    public String mouvementId;
    public double montant;
    public String date_Transaction;
    public String code_Operation;
    public double solde_Avant;
    public double solde_Nouveau;

    public Mouvement(int ID, String mouvementId, double montant, String date_Transaction, String code_Operation, double solde_Avant, double solde_Nouveau) {
        super(ID);
        this.mouvementId = mouvementId;
        this.montant = montant;
        this.date_Transaction = date_Transaction;
        this.code_Operation = code_Operation;
        this.solde_Avant = solde_Avant;
        this.solde_Nouveau = solde_Nouveau;
    }

    public String getMouvementId() {
        return mouvementId;
    }

    public double getMontant() {
        return montant;
    }

    public String getDate_Transaction() {
        return date_Transaction;
    }

    public String getCode_Operation() {
        return code_Operation;
    }

    public double getSolde_Avant() {
        return solde_Avant;
    }

    public double getSolde_Nouveau() {
        return solde_Nouveau;
    }
}
