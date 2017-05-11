package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

import com.example.cnep.cnepe_banking.Models.AgenceViewModel;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-23.
 */

public interface IListAllAgencesInteractor extends IConnectedInteractor{

    public void onInitializing();
    public void loadMoreAgences();
    public void loadMoreAgences(String wilaya);


    public interface CallBack extends  IConnectedInteractor.CallBack
    {
        public void toInitialize(ArrayList<AgenceViewModel> agences, ArrayList<String> wilayas, boolean hasMore);
        public void receiveMoreAgences(ArrayList<AgenceViewModel> agences, boolean hasMore);

    }
}
