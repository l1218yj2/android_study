package com.drakeash.okhttp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.novoda.sexp.finder.ElementFinder;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.recvCat)
    RecyclerView recyclerView;
    CatAdapter catAdapter;
    private static ElementFinder<Images> elementFinder;

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

    }
}
