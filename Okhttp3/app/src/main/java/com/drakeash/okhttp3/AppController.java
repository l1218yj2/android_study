package com.drakeash.okhttp3;

import android.app.Application;

import okhttp3.OkHttpClient;

/**
 * Created by YJLaptop on 2016-03-22.
 */
public class AppController extends Application {
    ///get?format=xml&results_per_page=20
    private static AppController mInstance;
    private OkHttpClient okHttpClient;


    public static synchronized AppController getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public OkHttpClient getOkHttpClient() {
        if(okHttpClient == null){
            okHttpClient = new OkHttpClient();
        }
        return okHttpClient;
    }


}
