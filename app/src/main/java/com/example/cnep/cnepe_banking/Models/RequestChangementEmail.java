package com.example.cnep.cnepe_banking.Models;

/**
 * Created by Aghiles on 2017-05-02.
 */

public class RequestChangementEmail extends RequestChangementInformation {




    public RequestChangementEmail(String information, String motDePasse) {
        super(_EMAIL, information, motDePasse);
    }


    @Override
    public boolean informationIsValide() {
        return getInformation().matches("[a-zA-Z][a-zA-Z0-9\\.-_]*[a-zA-Z0-9]@[a-zA-Z]\\.[a-z]{3}");
    }
}
