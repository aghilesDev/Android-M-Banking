package com.example.cnep.cnepe_banking.DomainLayer.Interactor;

import com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces.IListCreditInteractor;
import com.example.cnep.cnepe_banking.Models.CreditView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditInteractor implements IListCreditInteractor {

    CallBack presenter;

    public ListCreditInteractor(CallBack presenter) {
        this.presenter = presenter;
    }

    @Override
    public void LoadCreditsRequest() {
        ArrayList<CreditView> credits=new ArrayList<>();
        credits.add(new CreditView("25","5255220555",58956,45632,"20/10/2014","Aucun"));
        credits.add(new CreditView("266","5255220458",58956,45632,"20/10/2014","Aucun"));
        credits.add(new CreditView("20","548520555",58956,45632,"20/10/2014","Aucun"));
        presenter.LoadCreditsReponse(credits);

    }


}
