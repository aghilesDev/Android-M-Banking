package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractLogin;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.ILoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.LoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IloginView;
import com.example.cnep.cnepe_banking.R;

public class LoginView extends AppCompatActivity implements ContractLogin.View {


    ContractLogin.ActionView presenter=new LoginPresenter(this);

    private EditText identifiantClient;
    private EditText motDePasse;

    private CheckBox memoriserIdentifiant;
    private Button bConnexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user_physique);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar_login);
        setSupportActionBar(toolbar);
        setTitle("Identification");


        this.identifiantClient=(EditText)findViewById(R.id.identifiantClient);
        this.motDePasse=(EditText)findViewById(R.id.motDePasse);

        this.memoriserIdentifiant=(CheckBox) findViewById(R.id.memoriserIdentifiant);

        bConnexion=(Button)findViewById(R.id.connexion);
        bConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.attempToLogin(identifiantClient.getText().toString(),motDePasse.getText().toString());
            }
        });

    }



    @Override
    public void loginSucced() {
        Toast.makeText(getApplicationContext(), "login succeed", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(LoginView.this,Accueil.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void loginFailed() {
        Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void noConnection() {

    }
}
