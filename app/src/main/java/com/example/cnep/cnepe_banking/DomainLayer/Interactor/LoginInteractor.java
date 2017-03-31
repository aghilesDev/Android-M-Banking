package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IloginInteractor;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.ILoginPresenter;

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

        if(identifiantClient.equals("juba")&&email.equals("youbazair@gmail.com")&&motDePasse.equals("1234562"))
            presenter.loginSucced();
        else
            presenter.loginFailed();
    }
}
