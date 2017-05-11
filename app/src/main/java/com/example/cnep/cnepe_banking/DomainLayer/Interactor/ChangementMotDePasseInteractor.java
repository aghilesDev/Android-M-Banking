package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IChangementinformationInteractor;
import com.example.cnep.cnepe_banking.Models.RequestChangementInformation;
import com.example.cnep.cnepe_banking.Models.RequestChangementMotDePasse;

/**
 * Created by Aghiles on 2017-05-09.
 */

public class ChangementMotDePasseInteractor implements IChangementinformationInteractor<RequestChangementMotDePasse> {

    private IChangementinformationInteractor.CallBack callBack;
    RequestChangementMotDePasse requestChangementMotDePasse;

    public ChangementMotDePasseInteractor(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void loginOut() {


    }

    @Override
    public void executeRequest(final RequestChangementMotDePasse requete) {
        requestChangementMotDePasse=requete;

        AsyncTask<Void,Void,Void> task =new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {




                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callBack.requestExecuted();
            }
        };

        task.execute();

    }
}
