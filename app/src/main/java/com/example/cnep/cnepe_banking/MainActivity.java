package com.example.cnep.cnepe_banking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cnep.cnepe_banking.Domain.EntityBase;
import com.example.cnep.cnepe_banking.Repository.TestRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestRepository<EntityBase>();
    }
}
