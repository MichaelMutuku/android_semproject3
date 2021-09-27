package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Simba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simba);
    }

    public void openSimbaMap(View view) {
        Intent intent = new Intent(this, SimbaMap.class);
        startActivity(intent);
    }

    public void contactUs(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Enquiry");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello restaurant i would like help with");

        startActivity(Intent.createChooser(intent, "Contact Us"));
    }
}