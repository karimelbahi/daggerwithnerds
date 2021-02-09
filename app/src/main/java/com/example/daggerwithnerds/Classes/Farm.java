package com.example.daggerwithnerds.Classes;

import android.util.Log;

import com.example.daggerwithnerds.Scopes.ActivityScope;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Farm {

    private static final String TAG = "Farm";
    @Inject
    public Farm() {

        Log.d(TAG, "karim Farm: ");
    }

    public String getBeans(){

        return  "Beans";
    }
}
