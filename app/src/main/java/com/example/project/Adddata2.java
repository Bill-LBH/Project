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

public class Adddata2 extends AppCompatActivity {
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata2);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final EditText ju;
        final EditText au;
        final EditText sep;
        final EditText oct;
        final EditText nov;
        final EditText dec;
        ju=(EditText) findViewById(R.id.july);
        au=(EditText) findViewById(R.id.august);
        sep=(EditText) findViewById(R.id.september);
        oct=(EditText) findViewById(R.id.october);
        nov=(EditText) findViewById(R.id.november);
        dec=(EditText) findViewById(R.id.december);
        next=findViewById(R.id.btnnext2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jul=ju.getText().toString();
                String aug=au.getText().toString();
                String sept=sep.getText().toString();
                String octb=oct.getText().toString();
                String nove=nov.getText().toString();
                String dece=dec.getText().toString();
                if(!TextUtils.isEmpty(jul)&&!TextUtils.isEmpty(aug)&&!TextUtils.isEmpty(sept)&&!TextUtils.isEmpty(octb)&&!TextUtils.isEmpty(nove)&&!TextUtils.isEmpty(dece)){
                    float july=Float.parseFloat(jul);
                    float august=Float.parseFloat(aug);
                    float september=Float.parseFloat(sept);
                    float october=Float.parseFloat(octb);
                    float november=Float.parseFloat(nove);
                    float december=Float.parseFloat(dece);
                    Weight2 weight2=new Weight2(july,august,september,october,november,december);
                    APP.weight2=weight2;
                    Intent intent = null;
                    intent = new Intent(Adddata2.this, Report.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Adddata2.this, "Weight can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }