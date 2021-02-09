package com.example.daggerwithnerds.Interfaces;

import com.example.daggerwithnerds.Classes.Farm;
import com.example.daggerwithnerds.Classes.River;
import com.example.daggerwithnerds.Modules.RiverModule;
import com.example.daggerwithnerds.Scopes.ActivityScope;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    River getRiver();
    Farm getFarm();
}
