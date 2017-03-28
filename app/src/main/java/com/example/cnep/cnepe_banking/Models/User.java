package com.example.cnep.cnepe_banking.Models;

import android.os.Parcelable;

import java.util.Collection;

/**
 * Created by Aghiles on 2017-03-26.
 */

public abstract class User extends EntityBase {

    private String userId;
    private String type ;
    private String telephone;

    public User(int ID, String userId, String type, String telephone) {
        super(ID);
        this.userId = userId;
        this.type = type;
        this.telephone = telephone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
