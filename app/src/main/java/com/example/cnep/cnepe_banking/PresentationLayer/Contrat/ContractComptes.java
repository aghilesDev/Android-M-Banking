package com.example.cnep.cnepe_banking.PresentationLayer.Contrat;

import com.example.cnep.cnepe_banking.Models.CompteView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-18.
 */

public interface ContractComptes {


    public interface ActionView
    {
        public  void onIntialListRequest(int codeAgence);
    }


    public interface View
    {
        public void onInitialCompteShow(ArrayList<CompteView> comptes);
    }


}
