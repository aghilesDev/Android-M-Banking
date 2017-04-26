package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NoConnectionException;
import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NotAuthorizedException;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListMouvementInteractor;
import com.example.cnep.cnepe_banking.Models.MouvementView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class ListMouvementInteractor implements IListMouvementInteractor{

    private CallBack presenter;
    private ArrayList<MouvementView> mouvements;


    public ListMouvementInteractor(CallBack presenter) {
        this.presenter = presenter;
    }


    @Override
    public void loadMouvementsRequest(final String numeroCompte) {

         mouvements= new ArrayList<>();
        new AsyncTask<Void, Void, Void>( ) {

            int error=0;

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(2000);

                    if(!presenter.isConnected())
                        throw new NoConnectionException();
                    if(false)
                        throw new NotAuthorizedException();

                    mouvements.add(new MouvementView("20/04/2017","virement",54651));
                    mouvements.add(new MouvementView("15/03/2017","virement",59651));
                    mouvements.add(new MouvementView("07/11/2016","virement",98496));
                    mouvements.add(new MouvementView("20/10/2016","virement",98498));


                } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (NoConnectionException e2)
                {
                    error=CONNECTION_ERROR;
                }catch (NotAuthorizedException e2)
                {
                    error=AUTHORIZATION_ERROR;

                }



                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                if(error==CONNECTION_ERROR)
                    presenter.NoConnectionFound();
                else if(error==AUTHORIZATION_ERROR)
                {
                    //service clear
                    presenter.logedOut();
                }else
                presenter.loadMouvementsReponse(mouvements);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);;







    }

    @Override
    public void loginOut() {
        presenter.logedOut();

    }
}
