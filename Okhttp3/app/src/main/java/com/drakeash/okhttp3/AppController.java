package com.drakeash.okhttp3;

import android.app.Application;

import okhttp3.OkHttpClient;

/**
 * Created by YJLaptop on 2016-03-22.
 */
public class AppController extends Application {
    private static String BASE_URL = "http://thecatapi.com/";
    //api/categories/list
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

}
