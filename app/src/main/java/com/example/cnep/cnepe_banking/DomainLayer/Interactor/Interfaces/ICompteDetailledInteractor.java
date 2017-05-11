package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

import com.example.cnep.cnepe_banking.Models.CompteViewModel;

/**
 * Created by Aghiles on 2017-04-30.
 */

public interface ICompteDetailledInteractor extends ILogedInteractor{

    public  void OnInitializing(String numCompte);
    public  void executeCommande(String rib,String motDePasse);



    public interface CallBack extends ILogedInteractor.CallBack
    {
        public void toInitialize(CompteViewModel compte);
        public void executedCommande();
        public void failedCommande();
    }
}
