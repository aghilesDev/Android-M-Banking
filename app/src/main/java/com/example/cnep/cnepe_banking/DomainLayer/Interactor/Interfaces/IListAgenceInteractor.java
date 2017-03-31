package com.example.cnep.cnepe_banking.DomainLayer.Interactor.Interfaces;

/**
 * Created by Aghiles on 2017-03-30.
 */

public interface IListAgenceInteractor {
    public void loadWilayas();
    public void LoadAgences();
    public void LoadAgences(String wilaya);
    public void LoadMoreAgences();
    public void LoadMoreAgences(String wilaya);
}
