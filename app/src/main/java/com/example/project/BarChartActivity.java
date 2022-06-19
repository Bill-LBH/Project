package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    public AddData addData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> weight = new ArrayList<>();
        weight.add(new BarEntry(1,APP.weight.getJa() ));
        weight.add(new BarEntry(2,APP.weight.getFe()));
        weight.add(new BarEntry(3,APP.weight.getMarch()));
        weight.add(new BarEntry(4,APP.weight.getAp()));
        weight.add(new BarEntry(5,APP.weight.getMay()));
        weight.add(new BarEntry(6,APP.weight.getJune()));
        weight.add(new BarEntry(7,APP.weight2.getJuly()));
        weight.add(new BarEntry(8,APP.weight2.getAugust()));
        weight.add(new BarEntry(9,APP.weight2.getSeptember()));
        weight.add(new BarEntry(10,APP.weight2.getOctober()));
        weight.add(new BarEntry(11,APP.weight2.getNovember()));
        weight.add(new BarEntry(12,APP.weight2.getDecember()));

        BarDataSet barDataSet = new BarDataSet(weight,"weight");
        barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextColor(16);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Health and Fitness");
        barChart.animateY(2000);
    }
}