package com.example.daggerwithnerds.Modules;

import com.example.daggerwithnerds.Classes.Ginger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    //before video 6
//    int sugar;
//
//    public CoffeeModule(int sugar) {
//        this.sugar = sugar;
//    }

    // Not my class
//    @Singleton
    @Provides
    Ginger providerGinger(){
        return new Ginger();
    }

    //before video 6

//    @Provides
//    int providerSugar(){
//        return sugar;
//    }
}
