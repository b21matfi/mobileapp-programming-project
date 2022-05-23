package com.example.project;

import android.os.Bundle;
import com.example.project.JsonTask;
import com.google.gson.Gson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    public JsonTask jsontask;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21matfi";
    private RecyclerView recyclerView;
    private List<Items> itemslist = new ArrayList<Items>();
    private MyAdapter myAdapter = new MyAdapter(itemslist);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();


        myAdapter.notifyDataSetChanged();


    }
}
