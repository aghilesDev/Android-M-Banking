package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListMouvementInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IloginInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListMouvementInteractor;
import com.example.cnep.cnepe_banking.Models.MouvementView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractMouvements;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class ListMouvementPresenter extends BasePresenter<ContractMouvements.View> implements ContractMouvements.ActionView,IListMouvementInteractor.CallBack {

    private IListMouvementInteractor interactor;

    public ListMouvementPresenter(ContractMouvements.View view) {
        this.attachView(view);
        interactor= new ListMouvementInteractor(this);
    }

    @Override
    public void onIntialRequest(String numeroCompte) {

        interactor.loadMouvementsRequest(numeroCompte);

    }

    @Override
    public void loadMouvementsReponse(ArrayList<MouvementView> mouvements) {

        view.onIntialReponse(mouvements);

    }
}
