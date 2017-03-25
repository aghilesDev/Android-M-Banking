package com.example.cnep.cnepe_banking.PresentationLayer.Presenter;

/**
 * Created by Aghiles on 2017-03-25.
 */

public interface ILoginPresenter {
    public void attempToLogin(String identifiantClient,String motDepasse);
    public void attempToLogin(String identifiantClient,String email,String motDepasse);
    public void loginFailed();
    public void loginSucced();

}
