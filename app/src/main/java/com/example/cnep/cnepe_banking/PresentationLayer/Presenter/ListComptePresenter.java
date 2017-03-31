package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import android.content.Context;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCompteInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListCompteInteractor;
import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCompteView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListComptePresenter implements IListComptePresenter {
    private IListCompteView view;
    private IListCompteInteractor interactor;
    private Context context;

    public ListComptePresenter(IListCompteView view, Context context) {
        this.view = view;
        this.context = context;
        this.interactor=new ListCompteInteractor(this);
    }

    @Override
    public void getComptes(int codeAgence) {
        interactor.LoadCompte(codeAgence);
    }

    @Override
    public void setComptes(ArrayList<CompteView> comptes) {

        //faire l'adapter puis implementer cette methode afin de le transférer à la vue
    }
}
