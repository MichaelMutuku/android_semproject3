package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Things extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);
    }

    public void findUs(View view) {
        Intent intent = new Intent(this, findUs.class);
        startActivity(intent);
    }

    public void openFoods(View view) {
        Intent intent = new Intent(this, foods.class);
        startActivity(intent);
    }

    public void openChef(View view) {
        Intent intent = new Intent(this, ChefOfTheMonth.class);
        startActivity(intent);
    }
}