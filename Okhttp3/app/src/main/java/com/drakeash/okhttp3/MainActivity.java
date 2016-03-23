package com.drakeash.okhttp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.recvCat)
    RecyclerView recyclerView;
    CatAdapter catAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        Request request = new Request.Builder()
                .url("http://thecatapi.com/api/Images/get?format=xml&results_per_page=20")
                .build();
        catAdapter = new CatAdapter(MainActivity.this, null);
        recyclerView.setAdapter(catAdapter);

        final Serializer serializer = new Persister();
        AppController.getInstance().getOkHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    Log.d("", response.body().string());
                    com.drakeash.okhttp3.Response example = serializer.read(com.drakeash.okhttp3.Response.class, response.body().string());
                    for(Image image : example.getData().getImages().getImages()){
                        catAdapter.add(image);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
