package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-03-26.
 */

public class Client extends EntityBase{

    public String identifiantClient;
    public int agenceId;
    public int userId;
    public boolean bloque;

    public Client(int ID, String identifiantClient, int agenceId, int userId, boolean bloque) {
        super(ID);
        this.identifiantClient = identifiantClient;
        this.agenceId = agenceId;
        this.userId = userId;
        this.bloque = bloque;
    }

    public String getIdentifiantClient() {
        return identifiantClient;
    }



    public int getAgenceId() {
        return agenceId;
    }



    public int getUserId() {
        return userId;
    }



    public boolean isBloque() {
        return bloque;
    }


}
