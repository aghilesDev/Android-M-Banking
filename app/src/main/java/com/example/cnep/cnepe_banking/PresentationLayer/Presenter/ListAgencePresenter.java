package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import android.content.Context;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListAgenceInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListAgenceInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListAgencePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.AgenceAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListAgenceView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class ListAgencePresenter implements IListAgencePresenter {

    private AgenceAdapter adapter;
    private IListAgenceInteractor interactor;
    private IListAgenceView view;
    private Context context;

    public ListAgencePresenter(Context context, IListAgenceView view) {
        this.context = context;
        this.view = view;
        interactor=new ListAgenceInteractor(this);

    }


//on envoie les demandes à l'interactor
    @Override
    public void getWilayas() {
    interactor.loadWilayas();
    }

    @Override
    public void getAgences() {

        interactor.LoadAgences();
    }

    @Override
    public void getAgences(String wilaya) {
    interactor.LoadAgences(wilaya);
    }

    @Override
    public void getMoreAgences() {//pas encore implémenter

    }

    @Override
    public void getMoreAgences(String wilayas) {//pas encore implémenter

    }

    //on reçois les infornation de l'interactor et on affecte les resultats à la view

    @Override
    public void sendWilayas(ArrayList<String> wilayas) {
    view.setWilayas(wilayas);
    }

    @Override
    public void sendAgences(ArrayList<AgenceResumeView> agences) {
           adapter = new AgenceAdapter(context, agences);
        view.setAdapter(adapter);
    }

    @Override
    public void sendMoreAgences(ArrayList<AgenceResumeView> agences) {

    }
}
