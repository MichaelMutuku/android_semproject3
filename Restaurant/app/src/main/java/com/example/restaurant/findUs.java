package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class findUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_us);
    }

    public void openMwewe(View view) {
        Intent intent = new Intent(this, Mwewe.class);
        startActivity(intent);
    }

    public void openSimba(View view) {
        Intent intent = new Intent(this, Simba.class);
        startActivity(intent);
    }

    public void openChui(View view) {
        Intent intent = new Intent(this, Chui.class);
        startActivity(intent);
    }
}