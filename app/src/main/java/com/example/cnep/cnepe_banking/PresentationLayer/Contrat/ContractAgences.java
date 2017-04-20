package com.example.cnep.cnepe_banking.PresentationLayer.Contrat;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Aghiles on 2017-04-18.
 */

public interface ContractAgences {

    public interface ActionView
    {
        public  void onIntialListRequest();
        public void allAgencesRequest();
        public  void AgencesRequest(String wilaya);
    }

    public interface  View
    {
        public void onInitialAgenceShow(ArrayList<AgenceResumeView> agences, ArrayList<String> wilayas);
        public  void showsAgences(ArrayList<AgenceResumeView> agences);

    }



}
