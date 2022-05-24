package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


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
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21matfi";
    private RecyclerView recyclerView;
    private List<Items> itemslist;
    private MyAdapter myAdapter;
    private Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        itemslist = new ArrayList<>();
        myAdapter = new MyAdapter(itemslist);
        about = findViewById(R.id.myButton);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("TEST", "onPostExecute: " + json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Items>>(){}.getType();
        ArrayList<Items> tmpList = gson.fromJson(json, type);
        Log.d("TEST", "onPostExecute: " + tmpList.toString());
        myAdapter.setitemslist(tmpList);
        myAdapter.notifyDataSetChanged();


    }
}
