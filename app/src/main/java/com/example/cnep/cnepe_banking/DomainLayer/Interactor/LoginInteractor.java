package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ILoginPresenter;

/**
 * Created by Aghiles on 2017-03-25.
 */

public class LoginInteractor implements IloginInteractor {


    ILoginPresenter presenter;


    public LoginInteractor(ILoginPresenter presenter)
    {
        this.presenter=presenter;
    }

    @Override
    public void loginCase(String identifiantClient, String motDePasse) {

        if(identifiantClient.equals("aghiles")&&motDePasse.equals("12345"))
            presenter.loginSucced();
        else
            presenter.loginFailed();

    }

    @Override
    public void loginCase(String identifiantClient, String email, String motDePasse) {

    }
}