package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.R;

/**
 * Created by Aghiles on 2017-04-26.
 */

public class AgenceDetailledView extends AppCompatActivity implements View.OnClickListener {

    AgenceResumeView agence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agence_detaillled);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_agencedetaille);
        setSupportActionBar(toolbar);
        setTitle("Detaille Agence");

        agence = (AgenceResumeView) getIntent().getSerializableExtra("agence");

        TextView numAgence = (TextView) findViewById(R.id.numAgence);
        TextView intituleAgence = (TextView) findViewById(R.id.intituléAgence);
        TextView willayaAgence = (TextView) findViewById(R.id.willayaAgence);
        TextView adresseAgence = (TextView) findViewById(R.id.adresseAgence);
        TextView telephoneAgence = (TextView) findViewById(R.id.telephoneAgence);
        TextView emailAgence = (TextView) findViewById(R.id.emailAgence);
        Button bCall = (Button) findViewById(R.id.bCallAgence);
        Button bMessage = (Button) findViewById(R.id.bMessageAgence);
        Button bLocation = (Button) findViewById(R.id.bLocationAgence);

        numAgence.setText(agence.getId() + "");
        intituleAgence.setText(agence.getLibelle());
        willayaAgence.setText(agence.getWilaya());
        adresseAgence.setText(agence.getAdresse());
        telephoneAgence.setText(agence.getTelephone());
        emailAgence.setText(agence.getEmail());
        bCall.setOnClickListener(this);
        bLocation.setOnClickListener(this);
        bMessage.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bCallAgence: {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + agence.getTelephone()));
                startActivity(callIntent);
                break;
            }
            case R.id.bMessageAgence: {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                Uri uri = Uri.parse("mailto:"+agence.getEmail());
                intent.setData(uri);
                startActivity(intent);

                break;
            }
            case R.id.bLocationAgence:{

// Retrieve latitude and longitude
                String latitude = "43.565715431592736";
                String longitude = "1.398482322692871";
// Format the associated uri
                Uri uriGeo = Uri.parse("geo:" + latitude + "," + longitude);
// Declare the associated Intent
                Intent intentGeo = new Intent(Intent.ACTION_VIEW, uriGeo);
                startActivity(intentGeo);
                break;
            }
        }
    }
}
