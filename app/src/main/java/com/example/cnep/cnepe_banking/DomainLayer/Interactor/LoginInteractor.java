package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DataLayer.TestRepository;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IloginInteractor;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.ILoginPresenter;

/**
 * Created by Aghiles on 2017-03-25.
 */

public class LoginInteractor implements IloginInteractor {


    CallBack presenter;
    String s = " no value";

    public LoginInteractor(CallBack presenter)
    {
        this.presenter=presenter;
    }

    @Override
    public void loginCase(String identifiantClient, String motDePasse) {



        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                TestRepository t= new TestRepository();
                s =t.getAgence();
                System.out.println("alors"+s);

                return null;
            }
        }.execute();







        if(identifiantClient.equals("aghiles")&&motDePasse.equals("12345"))
            presenter.loginAuthorized();
        else
            presenter.loginNotAuthorized();

    }


}
