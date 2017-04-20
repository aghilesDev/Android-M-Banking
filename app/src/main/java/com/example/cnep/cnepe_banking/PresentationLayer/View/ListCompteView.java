package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractAgences;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractComptes;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CompteAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListAgenceView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCompteView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListCompteView extends AppCompatActivity implements ContractComptes.View{

    private ContractComptes.ActionView presenter;
    private RecyclerView rv;
    private CompteAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comptes);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_comptes);
        setSupportActionBar(toolbar);
        int codeAgence=getIntent().getIntExtra("codeAgence",0);
        setTitle("comptes de la "+codeAgence);
        rv=(RecyclerView)findViewById(R.id.ListComptes);
        rv.setLayoutManager(new LinearLayoutManager(this));
        presenter=new ListComptePresenter(this);
        presenter.onIntialListRequest(codeAgence);



       Toast.makeText(getApplicationContext(), "code Agence: "+codeAgence, Toast.LENGTH_SHORT).show();
    }




    @Override
    public void onInitialCompteShow(ArrayList<CompteView> comptes) {
        adapter=new CompteAdapter(ListCompteView.this,comptes);
        rv.setAdapter(adapter);

    }
}
