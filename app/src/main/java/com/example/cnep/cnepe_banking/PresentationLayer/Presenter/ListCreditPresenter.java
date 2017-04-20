package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

import android.content.Context;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCreditInteractor;
import com.example.cnep.cnepe_banking.DomainLayer.Interactor.ListCreditInteractor;
import com.example.cnep.cnepe_banking.Models.CreditView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractCredits;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CreditAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCreditView;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditPresenter extends BasePresenter<ContractCredits.View> implements IListCreditInteractor.CallBack,ContractCredits.ActionView {
    IListCreditInteractor interactor;



    public ListCreditPresenter(ContractCredits.View view) {
        this.view = view;

        interactor=new ListCreditInteractor(this);
    }



    @Override
    public void LoadCreditsReponse(ArrayList<CreditView> credits) {
        view.onInitialCreditShow(credits);
    }

    @Override
    public void onIntialListRequest() {
        interactor.LoadCreditsRequest();

    }
}
