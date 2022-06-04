package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    private TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        getSupportActionBar().hide();
        username=findViewById(R.id.user_name);
        username.setText(APP.user.getName());
    }
}