package com.example.cnep.cnepe_banking.PresentationLayer.Contrat;

import com.example.cnep.cnepe_banking.Models.MouvementView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public interface ContractMouvements {

    public interface ActionView
    {
        public void onIntialRequest(String numeroCompte);
    }
    public interface View
    {
        public void onIntialReponse(ArrayList<MouvementView> mouvements);

    }
}
