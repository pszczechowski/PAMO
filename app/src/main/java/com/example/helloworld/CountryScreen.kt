package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CountryScreen : AppCompatActivity() {
    private var buttonPoland: Button? = null
    private var buttonChina: Button? = null
    private var buttonItaly: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_screen)
        buttonPoland = findViewById<View>(R.id.poland) as Button
        buttonChina = findViewById<View>(R.id.china) as Button
        buttonItaly = findViewById<View>(R.id.italy) as Button
        buttonPoland!!.setOnClickListener { openPolandActivity() }
        buttonChina!!.setOnClickListener { openChinaActivity() }
        buttonItaly!!.setOnClickListener { openItalyActivity() }
    }

    fun openPolandActivity() {
        val intent = Intent(this, PolandChartScreen::class.java)
        startActivity(intent)
    }

    fun openChinaActivity() {
        val intent = Intent(this, ChinaChartScreen::class.java)
        startActivity(intent)
    }

    fun openItalyActivity() {
        val intent = Intent(this, ItalyChartScreen::class.java)
        startActivity(intent)
    }
}