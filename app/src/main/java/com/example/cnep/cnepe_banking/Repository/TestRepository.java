package com.example.cnep.cnepe_banking.Repository;

import com.android.internal.util.Predicate;
import com.example.cnep.cnepe_banking.Domain.Agence;
import com.example.cnep.cnepe_banking.Domain.EntityBase;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by Aghiles on 2017-03-23.
 */

public class TestRepository<T extends EntityBase> implements  IBaseRepository<T> {


    private String type;
    private  Collection<T> table;
    private static LinkedHashMap<String,Collection<EntityBase>>tables;




    @Override
    public Set<T> get(Predicate<T> predicate) {
        return null;
    }

    @Override
    public Set<T> getAll() {
        return null;
    }

    @Override
    public void update(Predicate<T> predicate, T val) {

    }
}
