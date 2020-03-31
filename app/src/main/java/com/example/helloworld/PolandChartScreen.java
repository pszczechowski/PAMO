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


public class PolandChartScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_screen);

        Pie pie = AnyChart.pie();

        List<DataEntry> poland = new ArrayList<>();
        poland.add(new ValueDataEntry("Zakażeni", 2215));
        poland.add(new ValueDataEntry("Zmarli", 32));
        poland.add(new ValueDataEntry("Wyleczeni", 35));

        pie.setData(poland);
        pie.setTitle("COVID-19");

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);

    }
}
