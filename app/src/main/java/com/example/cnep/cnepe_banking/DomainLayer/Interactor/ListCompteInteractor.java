package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCompteInteractor;
import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListCompteInteractor implements IListCompteInteractor {
    CallBack presenter;

    public ListCompteInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void LoadCompteRequest(int codeAgence) {
        ArrayList<CompteView> comptes=new ArrayList<>();
        comptes.add(new CompteView("0156487952","2495452965949949","EPARGNE",50000));
        comptes.add(new CompteView("6825283836","9842984849426369","CHEQUE",75000));
        comptes.add(new CompteView("5818752288","5874754757967979","EPARGNE",25000));
        comptes.add(new CompteView("9527197512","8638622853266886","CHEQUE",65083));
        comptes.add(new CompteView("7452949798","4947984479849479","CHEQUE",85649.548));
        presenter.LoadComptesReponse(comptes);
    }
}
