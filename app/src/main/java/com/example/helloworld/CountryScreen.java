package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CountryScreen extends AppCompatActivity {

    private Button buttonPoland;
    private Button buttonChina;
    private Button buttonItaly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_screen);

        buttonPoland = (Button) findViewById(R.id.poland);
        buttonChina = (Button) findViewById(R.id.china);
        buttonItaly = (Button) findViewById(R.id.italy);
        buttonPoland.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openPolandActivity();
            }
        });
        buttonChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChinaActivity();
            }
        });
        buttonItaly.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openItalyActivity();
            }

        });
    }

    public void openPolandActivity() {
        Intent intent = new Intent(this, PolandChartScreen.class);
        startActivity(intent);
    }
    public void openChinaActivity() {
        Intent intent = new Intent(this, ChinaChartScreen.class);
        startActivity(intent);
    }
    public void openItalyActivity(){
        Intent intent = new Intent(this, ItalyChartScreen.class);
        startActivity(intent);
    }


}