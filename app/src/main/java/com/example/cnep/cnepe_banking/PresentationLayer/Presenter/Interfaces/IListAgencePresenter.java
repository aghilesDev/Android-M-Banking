package com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.AgenceAdapter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Aghiles on 2017-03-30.
 */

public interface IListAgencePresenter {
    //from view to interactor
    public  void getWilayas();
    public void getAgences();
    public void getAgences(String wilaya);
    public void getMoreAgences();
    public void getMoreAgences(String wilaya);
    //from interactor to view
    public void sendWilayas(ArrayList<String> wilaya);
    public void sendAgences(ArrayList<AgenceResumeView> agences);
    public void sendMoreAgences(ArrayList<AgenceResumeView> agences);

}
