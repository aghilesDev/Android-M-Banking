package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.IloginInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.LoginInteractor;
import com.example.cnep.cnepe_banking.PresentationLayer.View.IloginView;

/**
 * Created by Aghiles on 2017-03-25.
 */

public class LoginPresenter implements ILoginPresenter {

    IloginInteractor interactor;
    IloginView view;

    public LoginPresenter(IloginView view)
    {
        this.view=view;
        this.interactor=new LoginInteractor(this);
    }

    @Override
    public void attempToLogin(String identifiantClient, String motDepasse) {

        System.out.println("hey");
    interactor.loginCase(identifiantClient,motDepasse);
    }

    @Override
    public void attempToLogin(String identifiantClient, String email, String motDepasse) {

    }

    @Override
    public void loginFailed() {
        view.loginFail();
    }

    @Override
    public void loginSucced() {
        view.login();
    }
}
