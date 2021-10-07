package com.example.recyclerviewdatamovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("Yowis Ben", "Drama, Comedy", "Bayu Skak", 4.9, "Bayu menyukai Susan sejak lama, namun merasa minder dengan keadaan dirinya yang pas-pasan. Bayu bertekad mengubah dirinya menjadi lebih populer dari Roy, pacar Susan yang gitaris band. Ia membentuk band bersama teman-temannya, yang dinamai Yowis Ben. Langkah Bayu dan teman-temannya tidak mudah. Terjadi perpecahan antar personil band.","22 Februari 2018" ));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}