package com.example.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText growth = (EditText) findViewById(R.id.growth);
        final TextView result = (TextView) findViewById(R.id.result);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = weight.getText().toString();
                String str2 = growth.getText().toString();
                if (TextUtils.isEmpty(str1)) {
                    weight.setError("Wprowadź wagę");
                    weight.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(str2)) {
                    growth.setError(("Wprowadź wzrost"));
                    growth.requestFocus();
                    return;
                }

                float weight = Float.parseFloat(str1);
                float growth = Float.parseFloat(str2) / 100;

                float bmiValue = calculateBMI(weight, growth);

                String bmiInterpretation = interpretBMI(bmiValue);

                result.setText(String.valueOf("Twój wskażnik BMI to : " + bmiValue + " = " + bmiInterpretation));
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Projekt PAMO", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Spora niedowaga";
        } else if (bmiValue < 18.5) {

            return "Niedowaga";
        } else if (bmiValue < 25) {

            return "Normalna";
        } else if (bmiValue < 30) {

            return "Nadwaga";
        } else {
            return "Otyłość";
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
