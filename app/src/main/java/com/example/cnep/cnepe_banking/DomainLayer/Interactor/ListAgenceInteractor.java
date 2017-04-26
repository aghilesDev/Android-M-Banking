package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NoConnectionException;
import com.example.cnep.cnepe_banking.DomainLayer.Exceptions.NotAuthorizedException;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListAgenceInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListAgencePresenter;

import java.util.ArrayList;

import static com.example.cnep.cnepe_banking.R.layout.agences;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class ListAgenceInteractor implements IListAgenceInteractor {

    private CallBack presenter;
    private ArrayList<AgenceResumeView> agences;



    public ListAgenceInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loadWilayas() {
        ArrayList<String> villes=new ArrayList<>();
        villes.add("Alger");
        villes.add("Boumerdes");
        villes.add("Tizi-Ouzou");

        //presenter.sendWilayas(villes);
    }

    @Override
    public void LoadAgences() {
        ArrayList<AgenceResumeView> agences=new  ArrayList<>();
        agences.add(new AgenceResumeView(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
        agences.add(new AgenceResumeView(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
        agences.add(new AgenceResumeView(127,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
       //presenter.sendAgences(agences);
    }

    @Override
    public void LoadAgences(String wilaya) {
        ArrayList<AgenceResumeView> agences=new  ArrayList<>();
        agences.add(new AgenceResumeView(127,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
       // presenter.sendAgences(agences);
    }

    @Override
    public void LoadMoreAgences() {

    }

    @Override
    public void LoadMoreAgences(String wilaya) {

    }
    //nouveau

    @Override
    public void loadAgencesRequest() {
        agences=new  ArrayList<>();






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

                    agences.add(new AgenceResumeView(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceResumeView(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceResumeView(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceResumeView(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceResumeView(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));


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
                } else
                presenter.loadAgencesReponse(agences);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);;



    }

    @Override
    public void loginOut() {

        presenter.logedOut();
    }
}
