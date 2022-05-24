package com.example.project;

import android.os.Bundle;
import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    public JsonTask jsontask;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private RecyclerView recyclerView;
    private List<Items> itemslist;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        itemslist = new ArrayList<>();
        myAdapter = new MyAdapter(itemslist);



        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute("https://mobprog.webug.se/json-api?login=b21matfi");
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("TEST", "onPostExecute: " + json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Items>>(){}.getType();
        List<Items> tmpList = gson.fromJson(json, type);
        Log.d("TEST", "onPostExecute: " + tmpList.toString());
        itemslist.addAll(tmpList);
        myAdapter.notifyDataSetChanged();


    }
}
