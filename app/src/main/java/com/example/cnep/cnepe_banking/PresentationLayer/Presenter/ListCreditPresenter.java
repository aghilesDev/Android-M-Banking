package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import android.content.Context;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCreditInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListCreditInteractor;
import com.example.cnep.cnepe_banking.Models.CreditView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CreditAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCreditView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditPresenter implements IListCreditPresenter {
    IListCreditInteractor interactor;
    Context context;
    IListCreditView view;

    public ListCreditPresenter(IListCreditView view,Context context) {
        this.view = view;
        this.context=context;
        interactor=new ListCreditInteractor(this);
    }

    @Override
    public void getCredits(String idUser) {
        interactor.LoadCredits(idUser);
    }

    @Override
    public void getMoreCredits(String idUser) {

    }

    @Override
    public void sendCredits(ArrayList<CreditView> credits) {
        CreditAdapter adapter=new CreditAdapter(context,credits);
        view.setAdapter(adapter);

    }

    @Override
    public void sendMoreCredits(ArrayList<CreditView> credits) {

    }
}
