package com.example;

import android.app.Application;

public class DeckardApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        getContentResolver().unregisterContentObserver(null);
    }
}
