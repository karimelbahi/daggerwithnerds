package com.example.daggerwithnerds.Classes;

import android.util.Log;

import javax.inject.Inject;

public class River {

    private static final String TAG = "River";

    @Inject
    public River() {
        Log.d(TAG, "karim River: ");
    }

    public String getWater(){

        return "Water";
    }
}
