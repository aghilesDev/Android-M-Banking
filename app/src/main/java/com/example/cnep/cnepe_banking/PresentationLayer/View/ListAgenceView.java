package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.cnep.cnepe_banking.Models.Agence;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractAgences;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListAgencePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListAgencePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.AgenceAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListAgenceView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class ListAgenceView extends AppCompatActivity implements ContractAgences.View,View.OnClickListener {


    private  Spinner dropdown;
    private String willaya;
    private RecyclerView rv;
    private AgenceAdapter adapter;
    private  ContractAgences.ActionView presenter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agences);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_agences);
        setSupportActionBar(toolbar);
        setTitle("Mes Agences");
        rv=(RecyclerView)findViewById(R.id.List);
        rv.setLayoutManager(new LinearLayoutManager(this));
        dropdown = (Spinner)findViewById(R.id.spinner);
        Button bRechercher=(Button)findViewById(R.id.bRechercher);
        bRechercher.setOnClickListener(this);

        presenter=new ListAgencePresenter(this);
        presenter.onIntialListRequest();

    }




    @Override
    public void onClick(View v) {
        willaya=(String)dropdown.getSelectedItem();
        if(willaya.equalsIgnoreCase("Tous"))//si tout est selectionner on affiche toutes les agences.

            presenter.allAgencesRequest();
        else
            presenter.AgencesRequest(willaya);
    }

    @Override
    public void onInitialAgenceShow(ArrayList<AgenceResumeView> agences,ArrayList<String> wilayas) {
        adapter=new AgenceAdapter(ListAgenceView.this,agences);
        rv.setAdapter(adapter);
        wilayas.add(0,"Tous");//on ajoute la possibilité d'afficher toutes les agences.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, wilayas);
        dropdown.setAdapter(adapter);

    }

    @Override
    public void showsAgences(ArrayList<AgenceResumeView> agences) {
        adapter.setList(agences);

    }


}
