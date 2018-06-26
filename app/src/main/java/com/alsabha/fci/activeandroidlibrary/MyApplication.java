package com.alsabha.fci.activeandroidlibrary;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by FCI on 2018-06-22.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
