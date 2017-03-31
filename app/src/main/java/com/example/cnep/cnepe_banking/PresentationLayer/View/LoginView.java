package com.example.cnep.cnepe_banking.PresentationLayer.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.Interfaces.ILoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.Presenter.LoginPresenter;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Interfaces.IloginView;
import com.example.cnep.cnepe_banking.R;

public class LoginView extends AppCompatActivity implements IloginView {


    ILoginPresenter presenter=new LoginPresenter(this);

    private EditText identifiantClient;
    private EditText motDePasse;
    private TextView tEmail;
    private EditText email;
    private CheckBox memoriserIdentifiant;
    private Button bTypeDecompte;
    private Button bConnexion;
    private boolean compteEntreprise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user_physique);
        this.identifiantClient=(EditText)findViewById(R.id.identifiantClient);
        this.motDePasse=(EditText)findViewById(R.id.motDePasse);
        this.email=(EditText)findViewById(R.id.email);
        this.tEmail= (TextView)findViewById(R.id.TEmail);
        this.memoriserIdentifiant=(CheckBox) findViewById(R.id.memoriserIdentifiant);
        this.bTypeDecompte=(Button)findViewById(R.id.BTypeDeCompte);
        this.compteEntreprise=false;
        this.bTypeDecompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(compteEntreprise==false)
                {
                    tEmail.setVisibility(View.VISIBLE);
                    email.setVisibility(View.VISIBLE);
                    bTypeDecompte.setText("COMPTE INDIVIDUEL");
                    compteEntreprise=true;
                }else
                {
                    tEmail.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    bTypeDecompte.setText("COMPTE D'ENTREPRISE");
                    compteEntreprise=false;
                }
            }
        });

        bConnexion=(Button)findViewById(R.id.connexion);
        bConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryToLogin();
            }
        });





    }

    @Override
    public void tryToLogin() {
        //verifier que les champ sont bien remplis
    if(compteEntreprise)
        presenter.attempToLogin(identifiantClient.getText().toString(),email.getText().toString(),motDePasse.getText().toString());
        else
            presenter.attempToLogin(identifiantClient.getText().toString(),motDePasse.getText().toString());
    }

    @Override
    public void login() {
        Toast.makeText(getApplicationContext(), "login succeed", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(LoginView.this,Accueil.class);
        intent=presenter.getModels(intent);
        startActivity(intent);


    }

    @Override
    public void loginFail() {
        Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();
    }
}
