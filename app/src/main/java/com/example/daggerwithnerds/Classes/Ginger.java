package com.example.daggerwithnerds.Classes;

import android.util.Log;

import javax.inject.Inject;

public class Ginger {

    private static final String TAG = "Milk";

    @Inject
    public Ginger() {
        Log.d(TAG, "karim Milk: ");
    }

    // For view only " IF IT NOT MY CLASS OR I USE MVVM "
    public String getGinger() {

        return "Milk ";
    }
}
