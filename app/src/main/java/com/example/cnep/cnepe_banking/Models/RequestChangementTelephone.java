package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-05-02.
 */

public class RequestChangementTelephone extends RequestChangementInformation {
    public RequestChangementTelephone(String information, String motDePasse) {
        super(_TELEPHONE, information, motDePasse);
    }

    @Override
    public boolean informationIsValide() {
        return true;
    }
}
