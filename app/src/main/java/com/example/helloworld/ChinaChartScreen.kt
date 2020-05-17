package com.example.helloworld

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.anychart.anychart.AnyChart
import com.anychart.anychart.AnyChartView
import com.anychart.anychart.DataEntry
import com.anychart.anychart.ValueDataEntry
import java.util.*

class ChinaChartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart_screen)
        val pie = AnyChart.pie()
        val china: MutableList<DataEntry> = ArrayList()
        china.add(ValueDataEntry("Zakażeni", 81518))
        china.add(ValueDataEntry("Zmarli", 3305))
        china.add(ValueDataEntry("Wyleczeni", 76052))
        pie.setData(china)
        pie.setTitle("COVID-19")
        val anyChartView = findViewById<View>(R.id.any_chart_view) as AnyChartView
        anyChartView.setChart(pie)
    }
}