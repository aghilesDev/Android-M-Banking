package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListAllAgencesInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListAllAgencesInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContratAllAgences;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-23.
 */

public class ListAllAgencesPresenter extends BasePresenter<ContratAllAgences.View> implements ContratAllAgences.ActionView,IListAllAgencesInteractor.CallBack{

    IListAllAgencesInteractor interactor=new ListAllAgencesInteractor(this);

    public ListAllAgencesPresenter(ContratAllAgences.View view) {
        this.attachView(view);
    }

    @Override
    public void NoConnectionFound() {
        view.noConnection();

    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public void onInitialize() {

        interactor.onInitializing();

    }

    @Override
    public void LoadMoreAgences(String wilaya) {

       if(wilaya.equalsIgnoreCase("Tous"))
            interactor.loadMoreAgences();
        else
            interactor.loadMoreAgences(wilaya);
    }

    @Override
    public void toInitialize(ArrayList<AgenceResumeView> agences, ArrayList<String> wilayas,boolean hasMore) {
        wilayas.add(0,"Tous");//on ajoute la possibilité d'afficher toutes les agences.
        view.Initializing(agences,wilayas,hasMore);

    }

    @Override
    public void receiveMoreAgences(ArrayList<AgenceResumeView> agences,boolean hasMore) {
        view.showMoreAgences(agences,hasMore);

    }
}
