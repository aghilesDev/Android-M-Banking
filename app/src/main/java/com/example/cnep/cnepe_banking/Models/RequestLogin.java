package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-05-15.
 */

public class RequestLogin {

    private  String identifiant;
    private String motDePasse;

    public RequestLogin(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isValideMotDepasse()
    {
        return true;
    }
    public boolean isValideIdentifiant()
    {
        return true;
    }

    public boolean isValide()
    {
        return true;
    }

    public boolean isComplete()
    {
        return true;
    }
}
