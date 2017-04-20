package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

import com.example.cnep.cnepe_banking.Models.MouvementView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public interface IListMouvementInteractor {
    public void loadMouvementsRequest(String numeroCompte);

    public interface CallBack
    {
        public void loadMouvementsReponse(ArrayList<MouvementView> mouvements);
    }
}
