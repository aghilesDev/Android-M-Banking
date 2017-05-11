package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.DialogInterface;
import android.content.Intent;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.R;

public class Accueil extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        Button bCompte=(Button)findViewById(R.id.bComptes);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_accueille);
        setSupportActionBar(toolbar);
        setTitle("Accueil");



        bCompte.setOnClickListener(this);
        Button bCredits=(Button)findViewById(R.id.bCredits);
        bCredits.setOnClickListener(this);
        Button bProfile=(Button)findViewById(R.id.bProfile);
        bProfile.setOnClickListener(this);



        Button bAgences=(Button)findViewById(R.id.bAgences);
        bAgences.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Êtes-vous sur de vouloir quitter l'application ?");
        builder.setCancelable(false);
        builder.setPositiveButton("oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });

        builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            public void onClick(final DialogInterface dialog, final int id) {

                dialog.cancel();

            }
        });
        builder.show();
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bComptes)
        {
            Intent it=new Intent(Accueil.this,ListAgenceView.class);
            startActivity(it);
        }else
            if(v.getId()==R.id.bCredits)
            {
                Intent it=new Intent(Accueil.this,ListCreditView.class);
                startActivity(it);
            }
             else
                if(v.getId()==R.id.bAgences)
                {
                    Intent it=new Intent(Accueil.this,ListAllAgencesView.class);
                    startActivity(it);
                }else
                    if(v.getId()==R.id.bProfile)
                    {
                        Intent it=new Intent(Accueil.this,ProfileView.class);
                        startActivity(it);
                    }
    }
}
