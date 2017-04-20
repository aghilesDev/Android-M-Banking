package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCreditInteractor;
import com.example.cnep.cnepe_banking.Models.CreditView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditInteractor implements IListCreditInteractor {

    CallBack presenter;

    public ListCreditInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    ArrayList<CreditView> credits;
    @Override
    public void LoadCreditsRequest() {

        credits=new ArrayList<>();

        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... params) {

                try {
                    Thread.sleep(2000);
                    credits.add(new CreditView("25","5255220555",58956,45632,"20/10/2014","Aucun"));
                    credits.add(new CreditView("266","5255220458",58956,45632,"20/10/2014","Aucun"));
                    credits.add(new CreditView("20","548520555",58956,45632,"20/10/2014","Aucun"));


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }








                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.LoadCreditsReponse(credits);


            }
        }.execute();


    }


}
