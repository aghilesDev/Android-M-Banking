package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import android.content.Context;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCompteInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListCompteInteractor;
import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractComptes;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CompteAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCompteView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListComptePresenter extends BasePresenter<ContractComptes.View> implements ContractComptes.ActionView,IListCompteInteractor.CallBack {

    private IListCompteInteractor interactor;
    private Context context;

    public ListComptePresenter(ContractComptes.View view) {
        this.attachView(view);
        this.interactor=new ListCompteInteractor(this);
    }



    @Override
    public void LoadComptesReponse(ArrayList<CompteView> comptes) {
        view.onInitialCompteShow(comptes);

    }

    @Override
    public void onIntialListRequest(int codeAgence) {
        interactor.LoadCompteRequest(codeAgence);

    }
}
