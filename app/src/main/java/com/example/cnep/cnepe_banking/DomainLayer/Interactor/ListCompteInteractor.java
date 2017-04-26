package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NoConnectionException;
import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NotAuthorizedException;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCompteInteractor;
import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListCompteInteractor implements IListCompteInteractor {
    private CallBack presenter;
    private ArrayList<CompteView> comptes;


    public ListCompteInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void LoadCompteRequest(int codeAgence) {
        comptes=new ArrayList<>();




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

                    comptes.add(new CompteView("0156487952","2495452965949949","EPARGNE","22/04/2017",50000));
                    comptes.add(new CompteView("6825283836","9842984849426369","CHEQUE","22/04/2017",75000));
                    comptes.add(new CompteView("5818752288","5874754757967979","EPARGNE","22/04/2017",25000));
                    comptes.add(new CompteView("9527197512","8638622853266886","CHEQUE","22/04/2017",65083));
                    comptes.add(new CompteView("7452949798","4947984479849479","CHEQUE","22/04/2017",85649.548));


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
                presenter.LoadComptesReponse(comptes);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);;




    }

    @Override
    public void loginOut() {

        presenter.logedOut();

    }
}
