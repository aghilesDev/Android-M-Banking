package com.example.cnep.cnepe_banking.Models;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractMouvements;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class MouvementView{

    private String date;
    private String intitule;
    private float montant;

    public MouvementView(String date, String intitule, float montant) {
        this.date = date;
        this.intitule = intitule;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public String getIntitule() {
        return intitule;
    }

    public float getMontant() {
        return montant;
    }
}
