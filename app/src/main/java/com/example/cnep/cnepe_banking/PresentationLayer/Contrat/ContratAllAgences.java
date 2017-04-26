package com.example.cnep.cnepe_banking.PresentationLayer.Contrat;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-23.
 */

public interface ContratAllAgences {

    public interface ActionView extends ContratConnected.ActionView
    {
        public void onInitialize();
        public void LoadMoreAgences(String wilaya);
    }

    public interface View extends ContratConnected.View
    {
        public void Initializing(ArrayList<AgenceResumeView> agences,ArrayList<String> wilayas,boolean hasMore);
        public void showMoreAgences(ArrayList<AgenceResumeView> agences,boolean hasMore);
    }


}
