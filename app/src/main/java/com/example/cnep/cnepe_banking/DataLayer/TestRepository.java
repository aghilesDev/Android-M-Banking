package com.example.cnep.cnepe_banking.DataLayer;

import android.os.StrictMode;

import com.android.internal.util.Predicate;
import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.Models.EntityBase;
import com.example.cnep.cnepe_banking.DomainLayer.Repository.IBaseRepository;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by Aghiles on 2017-03-23.
 */

public class TestRepository{



    public String getAgence()
    {
        Gson gson=new Gson();

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://192.168.1.5:5454/api/Agence/all")
                .build();
        try {
            Response response = client.newCall(request).execute();
            //AgenceResumeView agence=gson.fromJson(response.body().toString(),AgenceResumeView.class);
            return " HTTP REQUEST c'est fait!!!!\naaaa"+response.body().string();



        } catch (IOException e) {

            return " HTTP REQUEST echoué!!!"+e.getMessage();
        }

    }



}
