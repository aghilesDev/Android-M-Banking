package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

/**
 * Created by Aghiles on 2017-04-06.
 */

public interface IListCreditInteractor {
    public void LoadCredits(String idUser);
    public void LoadMoreCredits(String idUser);
}
