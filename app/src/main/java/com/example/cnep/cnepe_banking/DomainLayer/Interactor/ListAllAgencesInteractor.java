package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import android.os.AsyncTask;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListAllAgencesInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceViewModel;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-23.
 */

public class ListAllAgencesInteractor implements IListAllAgencesInteractor {

    private CallBack presenter;

    public ListAllAgencesInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onInitializing() {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {

            ArrayList<AgenceViewModel> agences=new ArrayList<>();
            ArrayList<String> wilayas=new ArrayList<>();;

            @Override
            protected Void doInBackground(Void... params) {

                try {
                    Thread.sleep(2000);
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));


                    wilayas.add("Alger");
                    wilayas.add("Annaba");
                    wilayas.add("Boumerdes");
                    wilayas.add("Jijel");
                    wilayas.add("Oran");
                    wilayas.add("Setif");
                    wilayas.add("Tizi-Ouzou");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return null;
            }
            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.toInitialize(agences,wilayas,true);
            }
        };

        task.execute();




    }

    @Override
    public void loadMoreAgences() {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {

            ArrayList<AgenceViewModel> agences=new ArrayList<>();


            @Override
            protected Void doInBackground(Void... params) {

                try {
                    Thread.sleep(2000);
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));




                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.receiveMoreAgences(agences,true);
            }
        };
        task.execute();


    }

    @Override
    public void loadMoreAgences(String wilaya) {

        AsyncTask<Void,Void,Void> task=new AsyncTask<Void, Void, Void>() {

            ArrayList<AgenceViewModel> agences=new ArrayList<>();

            @Override
            protected Void doInBackground(Void... params) {

                try {
                    Thread.sleep(2000);
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(125,"Alger","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(124,"Benmhidi2","Alger","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(126,"boumerdes","Boumerdes","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(128,"Tizi-Ouzou","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));
                    agences.add(new AgenceViewModel(127,"Benmhidi","Tizi-Ouzou","10 rue ,place 1 er mai","021362156","agce@cnepbanque.dz"));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                presenter.receiveMoreAgences(agences,true);
            }
        };
        task.execute();


    }
}
