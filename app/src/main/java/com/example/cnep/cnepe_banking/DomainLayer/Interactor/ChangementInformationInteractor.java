package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IChangementinformationInteractor;
import com.example.cnep.cnepe_banking.Models.RequestChangementInformation;

/**
 * Created by Aghiles on 2017-05-02.
 */

public class ChangementInformationInteractor implements IChangementinformationInteractor<RequestChangementInformation> {

    private IChangementinformationInteractor.CallBack callBack;


    public ChangementInformationInteractor(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void loginOut() {

    }

    @Override
    public void executeRequest(RequestChangementInformation requete) {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callBack.requestExecuted();
            }
        }.execute();

    }
}
