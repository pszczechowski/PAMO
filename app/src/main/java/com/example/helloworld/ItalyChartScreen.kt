package com.example.helloworld

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.anychart.anychart.AnyChart
import com.anychart.anychart.AnyChartView
import com.anychart.anychart.DataEntry
import com.anychart.anychart.ValueDataEntry
import java.util.*

class ItalyChartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart_screen)
        val pie = AnyChart.pie()
        val italy: MutableList<DataEntry> = ArrayList()
        italy.add(ValueDataEntry("Zakażeni", 105792))
        italy.add(ValueDataEntry("Zmarli", 12428))
        italy.add(ValueDataEntry("Wyleczeni", 15729))
        pie.setData(italy)
        pie.setTitle("COVID-19")
        val anyChartView = findViewById<View>(R.id.any_chart_view) as AnyChartView
        anyChartView.setChart(pie)
    }
}