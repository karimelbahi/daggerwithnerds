package com.example.daggerwithnerds.Classes;

import android.app.Application;

import com.example.daggerwithnerds.Interfaces.AppComponent;
import com.example.daggerwithnerds.Interfaces.CoffeeComponent;
import com.example.daggerwithnerds.Interfaces.DaggerAppComponent;

public class MainApplication extends Application {
//    private CoffeeComponent coffeeComponent;
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//         coffeeComponent = DaggerCoffeeComponent.builder()
//                .Sugar(3).Milk(5).build();
//    }
//
//    public CoffeeComponent getCoffeeComponent() {
//        return coffeeComponent;
//    }
     AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

         appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
