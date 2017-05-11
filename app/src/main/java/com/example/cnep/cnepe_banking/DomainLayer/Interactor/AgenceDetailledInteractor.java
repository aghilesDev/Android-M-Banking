package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IAgenceDetailleInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceViewModel;

/**
 * Created by Aghiles on 2017-04-29.
 */

public class AgenceDetailledInteractor implements IAgenceDetailleInteractor {

    private CallBack callBack;
    private AgenceViewModel agence;

    public AgenceDetailledInteractor(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void OnInitializing(int codeAgence) {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {

                agence=new AgenceViewModel(200,"Test","test","quelaue part n'importe ou","0789653248","Test@gmail.com");
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callBack.toInitialize(agence);

            }
        };

        task.execute();

    }
}
