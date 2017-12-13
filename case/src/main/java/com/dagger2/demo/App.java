package com.dagger2.demo;

import android.app.Application;

import com.dagger2.demo.case05.Case05Component;
import com.dagger2.demo.case05.DaggerCase05Component;

/**
 * @author JY
 * @Time 2017/12/13 13:10
 */

public class App extends Application{

    private Case05Component case05Component;

    @Override
    public void onCreate() {
        super.onCreate();
        case05Component = DaggerCase05Component.builder().build();
    }

    public Case05Component getCase05Component() {
        return case05Component;
    }
}
