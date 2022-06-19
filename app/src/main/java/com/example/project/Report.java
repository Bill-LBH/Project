package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Report extends AppCompatActivity {

    //declaring variables
    Button btnBarChart;
    Button btnPieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnBarChart = (Button)findViewById(R.id.btnBarChart);
        btnBarChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar = new Intent(Report.this, BarChartActivity.class);
                startActivity(bar);
            }
        });
        btnPieChart = (Button)findViewById(R.id.btnPieChart);
        btnPieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pie = new Intent(Report.this, PieChartActivity.class);
                startActivity(pie);
            }
        });
    }
}