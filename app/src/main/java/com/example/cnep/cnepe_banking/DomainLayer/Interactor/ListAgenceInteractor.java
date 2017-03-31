package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListAgenceInteractor;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListAgencePresenter;

import java.util.ArrayList;

import static com.example.cnep.cnepe_banking.R.layout.agences;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class ListAgenceInteractor implements IListAgenceInteractor {

    IListAgencePresenter presenter;

    public ListAgenceInteractor(IListAgencePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loadWilayas() {
        ArrayList<String> villes=new ArrayList<>();
        villes.add("Alger");
        villes.add("Boumerdes");
        villes.add("Tizi-Ouzou");

        presenter.sendWilayas(villes);
    }

    @Override
    public void LoadAgences() {
        ArrayList<AgenceResumeView> agences=new  ArrayList<>();
        agences.add(new AgenceResumeView(125,"Alger"));
        agences.add(new AgenceResumeView(126,"boumerdes"));
        agences.add(new AgenceResumeView(127,"Tizi-Ouzou"));
        presenter.sendAgences(agences);
    }

    @Override
    public void LoadAgences(String wilaya) {
        ArrayList<AgenceResumeView> agences=new  ArrayList<>();
        agences.add(new AgenceResumeView(127,"Tizi-Ouzou"));
        presenter.sendAgences(agences);
    }

    @Override
    public void LoadMoreAgences() {

    }

    @Override
    public void LoadMoreAgences(String wilaya) {

    }
}
