package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IProfilInteractor;
import com.example.cnep.cnepe_banking.Models.User;
import com.example.cnep.cnepe_banking.Models.UserParticulier;
import com.example.cnep.cnepe_banking.Models.UserProfessionnel;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-05-01.
 */

public class ProfileIntractor implements IProfilInteractor {

    private CallBack presenter;
    private User user;

    public ProfileIntractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onInitializing() {

        AsyncTask<Void,Void,Void> task= new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {

                user=new UserParticulier("8465165",User.PARTICULIER,"user@gmail.com","0765254587","auelaue part","Goumeziane","Aghiles","02/07/1996","tizi-ouzou","masculin");
                user=new UserProfessionnel("8465165",User.PROFESSIONNEL,"user@gmail.com","0765254587","Draa Ben Khedda,Tizi-Ouzou","Goumeziane","Aghiles","02/07/1996","tizi-ouzou","masculin","516" +
                        "21646515","9845898151");
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.toInitialize(user);
            }
        };
        task.execute();

    }

    @Override
    public void loginOut() {

        presenter.logedOut();

    }
}
