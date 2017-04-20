package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.cnep.cnepe_banking.Models.CreditView;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractCredits;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CreditAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCreditView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditView extends AppCompatActivity implements IListCreditView, ContractCredits.View {
    private ContractCredits.ActionView presenter;
    private RecyclerView rv;
    private CreditAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_credits);
        setSupportActionBar(toolbar);
        setTitle("Mes credits");

        rv=(RecyclerView)findViewById(R.id.listCredits);
        rv.setLayoutManager(new LinearLayoutManager(this));
        presenter=new ListCreditPresenter(this);
        presenter.onIntialListRequest();

    }
    @Override
    public void setAdapter(CreditAdapter adapter) {
        rv.setAdapter(adapter);
    }

    @Override
    public void onInitialCreditShow(ArrayList<CreditView> credits) {
        adapter=new CreditAdapter(credits);
        rv.setAdapter(adapter);
    }
}
