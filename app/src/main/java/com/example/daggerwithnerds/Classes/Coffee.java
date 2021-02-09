package com.example.daggerwithnerds.Classes;

import android.util.Log;

import com.example.daggerwithnerds.Qualifiers.Milk;
import com.example.daggerwithnerds.Qualifiers.Sugar;
import com.example.daggerwithnerds.Scopes.ActivityScope;

import javax.inject.Inject;
import javax.inject.Singleton;

// it is called dependant
@ActivityScope
public class  Coffee {

    private static final String TAG = "Coffee";

    // called second
    // Field injection (i use it if i don't need to passing it to the constructor )(good with activities and fragments)
    @Inject
    public Farm farm; // it is called dependency

    // Constructor injection
    public River river; // it is called dependency

    public Ginger ginger; // it is called dependency

    public int sugar;
    public int milk;


//    @Inject
//    public Coffee() {
//    }

    // called first
    //  constructor injection
    @Inject
    public Coffee(River river, Ginger ginger, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.ginger = ginger;
        this.sugar = sugar;
        this.milk = milk;
    }

    // called third
    // Method injection
    // it will be called automatic one time only
    @Inject
    public void connectElectricity() {
        Log.d(TAG, "connectElectricity: connecting...");
    }

    public String getCoffeeCup() {

        return farm.getBeans() + " " + river.getWater() + " " + ginger.getGinger() + sugar + " Sugar " +
                milk + " Milk";
    }
}
