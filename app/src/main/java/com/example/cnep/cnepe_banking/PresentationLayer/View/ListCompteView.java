package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.IListComptePresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListAgenceView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IListCompteView;
import com.example.cnep.cnepe_banking.R;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class ListCompteView extends AppCompatActivity implements IListCompteView{

    private IListComptePresenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comptes);
        int codeAgence=getIntent().getIntExtra("codeAgence",0);




       Toast.makeText(getApplicationContext(), "code Agence: "+codeAgence, Toast.LENGTH_SHORT).show();
    }
}
