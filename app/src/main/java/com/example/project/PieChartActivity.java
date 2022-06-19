package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

//Reference:https://youtu.be/vhKtbECeazQ
public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> vistors = new ArrayList<>();
        vistors.add((new PieEntry(APP.weight.getJa(), 1)));
        vistors.add((new PieEntry(APP.weight.getFe(), 2)));
        vistors.add((new PieEntry(APP.weight.getMarch(), 3)));
        vistors.add((new PieEntry(APP.weight.getAp(), 4)));
        vistors.add((new PieEntry(APP.weight.getMay(), 5)));
        vistors.add((new PieEntry(APP.weight.getJune(), 6)));
        vistors.add((new PieEntry(APP.weight2.getJuly(), 7)));
        vistors.add((new PieEntry(APP.weight2.getAugust(), 8)));
        vistors.add((new PieEntry(APP.weight2.getSeptember(), 9)));
        vistors.add((new PieEntry(APP.weight2.getOctober(), 10)));
        vistors.add((new PieEntry(APP.weight2.getNovember(), 11)));
        vistors.add((new PieEntry(APP.weight2.getDecember(), 12)));

        PieDataSet pieDataSet = new PieDataSet(vistors,"weight kg");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);

        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("weight");
        pieChart.animate();
    }
}