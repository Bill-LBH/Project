package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddData extends AppCompatActivity {
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final EditText jan;
        final EditText fe;
        final EditText mar;
        final EditText ap;
        final EditText may;
        final EditText june;
        jan=(EditText) findViewById(R.id.jannuary);
        fe=(EditText) findViewById(R.id.february);
        mar=(EditText) findViewById(R.id.march);
        ap=(EditText) findViewById(R.id.april);
        may=(EditText) findViewById(R.id.may);
        june=(EditText) findViewById(R.id.june);
        next=findViewById(R.id.btnnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String january=jan.getText().toString();
                String february=fe.getText().toString();
                String march=mar.getText().toString();
                String april=ap.getText().toString();
                String May=may.getText().toString();
                String June=june.getText().toString();
                if(!TextUtils.isEmpty(january)&&!TextUtils.isEmpty(february)&&!TextUtils.isEmpty(march)&&!TextUtils.isEmpty(april)&&!TextUtils.isEmpty(May)&&!TextUtils.isEmpty(June)){
                    float ja=Float.parseFloat(january);
                    float feb=Float.parseFloat(february);
                    float ma=Float.parseFloat(march);
                    float apr=Float.parseFloat(april);
                    float m=Float.parseFloat(May);
                    float j=Float.parseFloat(June);
                    Weight weight= new Weight(ja,feb,ma,apr,m,j);
                    APP.weight=weight;
                    Intent intent = null;
                    intent = new Intent(AddData.this, Adddata2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(AddData.this, "Weight can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}