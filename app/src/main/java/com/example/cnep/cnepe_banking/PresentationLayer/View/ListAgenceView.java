package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.cnep.cnepe_banking.Models.Agence;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListAgencePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListAgencePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.AgenceAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListAgenceView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class ListAgenceView extends AppCompatActivity implements IListAgenceView,View.OnClickListener {

    private IListAgencePresenter presenter;
    private  Spinner dropdown;
    private String willaya;
    private RecyclerView rv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new ListAgencePresenter(ListAgenceView.this,this);

        setContentView(R.layout.agences);
        rv=(RecyclerView)findViewById(R.id.List);
        rv.setLayoutManager(new LinearLayoutManager(this));
        presenter.getAgences();//initialiser le recyclerView

        dropdown = (Spinner)findViewById(R.id.spinner);
        presenter.getWilayas();//initialiser le spinner
        Button bRechercher=(Button)findViewById(R.id.bRechercher);
        bRechercher.setOnClickListener(this);

    }


    @Override
    public void setAdapter(AgenceAdapter adapter) {//on initialise le recyclerView a partir de presenter
        rv.setAdapter(adapter);

    }

    @Override
    public void setWilayas(ArrayList<String> wilayas) {//on initialise le spinner à partir du presenter

        wilayas.add(0,"Tous");//on ajoute la possibilité d'afficher toutes les agences.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, wilayas);
        dropdown.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        willaya=(String)dropdown.getSelectedItem();
        if(willaya.equalsIgnoreCase("Tous"))//si tout est selectionner on affiche toutes les agences.
            presenter.getAgences();
        else
            presenter.getAgences(willaya);
    }
}
