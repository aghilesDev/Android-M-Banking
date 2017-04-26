package com.example.cnep.cnepe_banking.PresentationLayer.Contrat;

/**
 * Created by Aghiles on 2017-04-19.
 */

public interface ContractLogin {

    public interface ActionView extends ContratConnected.ActionView
    {
        public void attempToLogin(String identifiantClient,String motDepasse);
    }

    public interface View extends ContratConnected.View
    {
        public void loginSucced();
        public void loginFailed();
    }
}
