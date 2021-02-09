package com.example.daggerwithnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.daggerwithnerds.Classes.Coffee;
import com.example.daggerwithnerds.Classes.MainApplication;
import com.example.daggerwithnerds.Interfaces.AppComponent;
import com.example.daggerwithnerds.Interfaces.CoffeeComponent;
import com.example.daggerwithnerds.Interfaces.DaggerCoffeeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //3
    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Video 2
        /* Manual dependency injection*/
//        Farm farm = new Farm();
//        River river = new River();
//        Coffee coffee = new Coffee(farm, river);

        // 3
        /*Automated dependency injection*/
        /*we use it if the constructor not take any parameters*/
//        CoffeeComponent coffeeComponent= DaggerCoffeeComponent.create();
//        coffeeComponent.getCoffee();

        //before video 5
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();


        //before video 6
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
//                .coffeeModule(new CoffeeModule(3)).build();


        //before video 8
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
//                .Sugar(3).Milk(5).build();

        AppComponent appComponent = ((MainApplication) getApplication()).getAppComponent();
//        Log.d(TAG, "onCreate: " + coffeeComponent.getCoffee().getCoffeeCup());

        // 3 Field injection
        // without using Boiler plate code (code repeated)
//        coffeeComponent.inject(this);
//        Log.d(TAG, "onCreate: " + coffee.getCoffeeCup() +"\n farm for coffee1 : "+ coffee.farm+
//                "\n farm for coffee2 : "+ coffee2.farm );


        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
                .Sugar(3).Milk(5).appComponent(appComponent).build();
                coffeeComponent.inject(this);

        Log.d(TAG, "onCreate: " +
                "\n  coffee1 : " + coffee +
                "\n  coffee1 : " + coffee2 +
                "\n farm for coffee1 : " + coffee.farm +
                "\n farm for coffee2 : " + coffee2.farm);


    }
}
