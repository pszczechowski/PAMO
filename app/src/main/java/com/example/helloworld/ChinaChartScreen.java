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

public class ChinaChartScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_screen);

        Pie pie = AnyChart.pie();

        List<DataEntry> china = new ArrayList<>();
        china.add(new ValueDataEntry("Zakażeni", 81518));
        china.add(new ValueDataEntry("Zmarli", 3305));
        china.add(new ValueDataEntry("Wyleczeni", 76052	));

        pie.setData(china);
        pie.setTitle("COVID-19");

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);

    }
}
