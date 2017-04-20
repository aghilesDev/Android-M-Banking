package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

/**
 * Created by Aghiles on 2017-03-25.
 */

public interface IloginInteractor {

    public void loginCase(String identifiantClient,String motDePasse);


    public interface CallBack{

        public void loginAuthorized();
        public void loginNotAuthorized();

    }
}
