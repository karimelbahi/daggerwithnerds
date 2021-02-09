package com.example.daggerwithnerds.Interfaces;

import com.example.daggerwithnerds.Classes.Coffee;
import com.example.daggerwithnerds.MainActivity;
import com.example.daggerwithnerds.Modules.RiverModule;
import com.example.daggerwithnerds.Qualifiers.Milk;
import com.example.daggerwithnerds.Qualifiers.Sugar;
import com.example.daggerwithnerds.Scopes.ActivityScope;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
//@Component(modules = RiverModule.class)
@Component(dependencies = AppComponent.class)

public interface CoffeeComponent {

    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
            // it means builder component not Dagger builder
    interface Builder {

        @BindsInstance
        Builder Sugar(@Sugar int sugar); // if u need any int value take this value

        @BindsInstance
        Builder Milk(@Milk int milk); // if u need any int value take this value

        // this because CoffeeComponent depend on AppComponent
        Builder appComponent(AppComponent appComponent);

        CoffeeComponent build();
    }
}
