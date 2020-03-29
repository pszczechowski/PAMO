package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonInit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInit = (Button) findViewById(R.id.startButton);

        buttonInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalcActivity();
            }
        });
    }

    public void openCalcActivity() {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }


}