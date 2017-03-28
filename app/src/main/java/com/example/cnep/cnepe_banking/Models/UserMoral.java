package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-26.
 */

public class UserMoral extends User {
    private String Raison_Social;
    private String Fax;
    private String Email1;
    private String MotDePasse1;
    private String Email2;
    private String MotDePasse2;

    public UserMoral(int ID, String userId, String type, String telephone, String raison_Social, String fax, String email1, String motDePasse1, String email2, String motDePasse2) {
        super(ID, userId, type, telephone);
        Raison_Social = raison_Social;
        Fax = fax;
        Email1 = email1;
        MotDePasse1 = motDePasse1;
        Email2 = email2;
        MotDePasse2 = motDePasse2;
    }

    public String getRaison_Social() {
        return Raison_Social;
    }

    public void setRaison_Social(String raison_Social) {
        Raison_Social = raison_Social;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String email1) {
        Email1 = email1;
    }

    public String getMotDePasse1() {
        return MotDePasse1;
    }

    public void setMotDePasse1(String motDePasse1) {
        MotDePasse1 = motDePasse1;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String email2) {
        Email2 = email2;
    }

    public String getMotDePasse2() {
        return MotDePasse2;
    }

    public void setMotDePasse2(String motDePasse2) {
        MotDePasse2 = motDePasse2;
    }
}
