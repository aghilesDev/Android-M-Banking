package com.example.cnep.cnepe_banking.DomainLayer.Interactor;


import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.ICompteDetailledInteractor;
import com.example.cnep.cnepe_banking.Models.CompteViewModel;

/**
 * Created by Aghiles on 2017-04-30.
 */

public class CompteDetailledInteractor implements ICompteDetailledInteractor{

    private CallBack callBack;
    private CompteViewModel compte;

    public CompteDetailledInteractor(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void OnInitializing(String numCompte) {



        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {

                compte=new CompteViewModel("0156487952","2495452965949949","EPARGNE","22/04/2017",50000,true);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callBack.toInitialize(compte);

            }
        };

        task.execute();


    }

    @Override
    public void executeCommande(String rib, String motDePasse) {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {


                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                callBack.executedCommande();

            }
        };

        task.execute();

    }

    @Override
    public void loginOut() {
        callBack.logedOut();

    }
}
