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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.Models.RequestLogin;
import com.example.cnep.cnepe_banking.PresentationLayer.Contrat.ContractLogin;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.ILoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.LoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IloginView;
import com.example.cnep.cnepe_banking.R;

public class LoginView extends AppCompatActivity implements ContractLogin.View {


    ContractLogin.ActionView presenter=new LoginPresenter(this);

    private EditText identifiantClient;
    private EditText motDePasse;

    private  TextView tIdentifiant;
    private  TextView tMotDePasse;
    private  TextView tmemoriser;
    private ProgressBar progressBar;
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
        tmemoriser=(TextView)findViewById(R.id.textView);
        tIdentifiant=(TextView)findViewById(R.id.textView5);
        tMotDePasse=(TextView)findViewById(R.id.textView4);
        progressBar=(ProgressBar)findViewById(R.id.progressBar_login);
        this.memoriserIdentifiant=(CheckBox) findViewById(R.id.memoriserIdentifiant);
        bConnexion=(Button)findViewById(R.id.connexion);
        bConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestLogin requestLogin= new RequestLogin(identifiantClient.getText().toString(),motDePasse.getText().toString());
                waitingResponse();
                presenter.attempToLogin(requestLogin);
            }
        });

    }



    public void waitingResponse()
    {
        identifiantClient.setVisibility(View.GONE);
        motDePasse.setVisibility(View.GONE);
        tIdentifiant.setVisibility(View.GONE);
        tMotDePasse.setVisibility(View.GONE);
        tmemoriser.setVisibility(View.GONE);
        memoriserIdentifiant.setVisibility(View.GONE);
        bConnexion.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    public void reponseReceived()
    {
        identifiantClient.setVisibility(View.VISIBLE);
        motDePasse.setVisibility(View.VISIBLE);
        tIdentifiant.setVisibility(View.VISIBLE);
        tMotDePasse.setVisibility(View.VISIBLE);
        tmemoriser.setVisibility(View.VISIBLE);
        memoriserIdentifiant.setVisibility(View.VISIBLE);
        bConnexion.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);

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
        reponseReceived();
        Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void noConnection() {
        reponseReceived();
        Toast.makeText(getApplicationContext(), "pas de connexion", Toast.LENGTH_SHORT).show();
    }
}
