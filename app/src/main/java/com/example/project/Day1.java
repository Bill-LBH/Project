package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Day1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        getSupportActionBar().hide();
    }
}