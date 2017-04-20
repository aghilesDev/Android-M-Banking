package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListMouvementInteractor;
import com.example.cnep.cnepe_banking.Models.MouvementView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class ListMouvementInteractor implements IListMouvementInteractor{

    CallBack presenter;
    ArrayList<MouvementView> mouvements;

    public ListMouvementInteractor(CallBack presenter) {
        this.presenter = presenter;
    }


    @Override
    public void loadMouvementsRequest(final String numeroCompte) {

         mouvements= new ArrayList<>();
        new AsyncTask<Void, Void, Void>( ) {

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(2000);

                    mouvements.add(new MouvementView("20/04/2017","virement",54651));
                    mouvements.add(new MouvementView("15/03/2017","virement",59651));
                    mouvements.add(new MouvementView("07/11/2016","virement",98496));
                    mouvements.add(new MouvementView("20/10/2016","virement",98498));


                } catch (InterruptedException e) {
                e.printStackTrace();
            }



                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.loadMouvementsReponse(mouvements);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);;







    }
}
