package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class Workout extends AppCompatActivity {
    private GifImageView gif1;
    private GifImageView gif2;
    private GifImageView gif3;
    private GifImageView gif4;
    private GifImageView gif5;
    private GifImageView gif6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().hide();
        gif1 = findViewById(R.id.gif1);
        gif2 = findViewById(R.id.gif2);
        gif3 = findViewById(R.id.gif3);
        gif4 = findViewById(R.id.gif4);
        gif5 = findViewById(R.id.gif5);
        gif6 = findViewById(R.id.gif6);
//        gif1.setImageResource(getResources().getDrawable(R.drawable.abs));
        gif1.setImageResource(R.drawable.abs);
        gif2.setImageResource(R.drawable.lunge);
        gif3.setImageResource(R.drawable.squat);
        gif4.setImageResource(R.drawable.streach);
        gif5.setImageResource(R.drawable.workout);
        gif6.setImageResource(R.drawable.fitness1);

    }
}