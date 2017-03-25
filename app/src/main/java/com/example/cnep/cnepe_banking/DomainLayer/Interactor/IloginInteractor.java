package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

/**
 * Created by Aghiles on 2017-03-25.
 */

public interface IloginInteractor {

    public void loginCase(String identifiantClient,String motDePasse);
    public  void loginCase(String identifiantClient,String email,String motDePasse);
}
