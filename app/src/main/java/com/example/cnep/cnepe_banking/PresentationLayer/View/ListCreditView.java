package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.ListCreditPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters.CreditAdapter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCreditView;
import com.example.cnep.cnepe_banking.R;

/**
 * Created by Aghiles on 2017-04-06.
 */

public class ListCreditView extends AppCompatActivity implements IListCreditView {
    private IListCreditPresenter presenter;
    private RecyclerView rv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);

        rv=(RecyclerView)findViewById(R.id.listCredits);
        rv.setLayoutManager(new LinearLayoutManager(this));
        presenter=new ListCreditPresenter(this,ListCreditView.this);
        presenter.getCredits("");



        Toast.makeText(getApplicationContext(), "idU: "/*a faire*/, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void setAdapter(CreditAdapter adapter) {
        rv.setAdapter(adapter);
    }
}
