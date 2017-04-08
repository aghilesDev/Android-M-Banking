package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.R;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        Button bCompte=(Button)findViewById(R.id.bComptes);
        bCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Accueil.this,ListAgenceView.class);
                startActivity(it);
            }
        });
        Button bCredits=(Button)findViewById(R.id.bCredits);
        bCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Accueil.this,ListCreditView.class);
                startActivity(it);
            }
        });
    }
}
