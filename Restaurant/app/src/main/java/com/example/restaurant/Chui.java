package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chui);
    }

    public void openChuiMap(View view) {
        Intent intent = new Intent(this, ChuiMap.class);
        startActivity(intent);
    }

    public void sendEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Enquiry");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello restaurant i would like help with");

        startActivity(Intent.createChooser(intent, "Contact Us"));
    }
}