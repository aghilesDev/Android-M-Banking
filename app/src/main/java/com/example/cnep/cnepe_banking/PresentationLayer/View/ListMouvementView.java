package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.Models.MouvementView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractMouvements;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListMouvementPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.MouvementAdapter;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class ListMouvementView extends AppCompatActivity implements ContractMouvements.View {
    private ContractMouvements.ActionView presenter;
    private MouvementAdapter adapter;
    private RecyclerView rv;

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mouvements);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_mouvements);
        setSupportActionBar(toolbar);
        setTitle("Mes Mouvements");
        rv=(RecyclerView)findViewById(R.id.ListMouvement);
        rv.setLayoutManager(new LinearLayoutManager(this));

        String compteId=getIntent().getStringExtra("compteId");
        Toast.makeText(getApplicationContext(),"numero de compte: "+compteId,Toast.LENGTH_SHORT);
        presenter=new ListMouvementPresenter(this);
        presenter.onIntialRequest("ddd");
    }

    @Override
    public void onIntialReponse(ArrayList<MouvementView> mouvements) {
        this.adapter=new MouvementAdapter(ListMouvementView.this,mouvements);
        rv.setAdapter(adapter);

    }
}
