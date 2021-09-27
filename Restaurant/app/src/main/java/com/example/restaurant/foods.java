package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class foods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Ugali", R.drawable.ugali),
                new MyListData("Beef", R.drawable.beef),
                new MyListData("RoastBeef", R.drawable.choma),
                new MyListData("Pork", R.drawable.pork),
                new MyListData("Chicken", R.drawable.chicken),
                new MyListData("Pilau", R.drawable.pilau),
                new MyListData("Mukimo", R.drawable.mukimo),
                new MyListData("Githeri", R.drawable.githeri),
                new MyListData("Fish", R.drawable.fish),
                new MyListData("Chips", R.drawable.chips),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}