package com.example.helloworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Pie;
import com.anychart.anychart.ValueDataEntry;

import java.util.ArrayList;
import java.util.List;

public class ItalyChartScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_screen);

        Pie pie = AnyChart.pie();

        List<DataEntry> italy = new ArrayList<>();
        italy.add(new ValueDataEntry("Zakażeni", 105792));
        italy.add(new ValueDataEntry("Zmarli", 12428));
        italy.add(new ValueDataEntry("Wyleczeni", 15729));

        pie.setData(italy);
        pie.setTitle("COVID-19");

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);
    }
}
