package com.example.helloworld;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {
    private EditText growth;
    private EditText weight;
    private EditText age;
    private TextView result;
    private RadioGroup radioSexGroup;
    private Button buttonScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        growth = findViewById(R.id.growth);
        weight = findViewById(R.id.weight);
        age = findViewById(R.id.age);
        result = findViewById(R.id.result);
        radioSexGroup = findViewById(R.id.radioSex);
        buttonScore = findViewById(R.id.buttonScore);
    }

    public void calculateBMI(View v) {
        String growthStr = growth.getText().toString();
        String weightStr = weight.getText().toString();
        String ageStr = age.getText().toString();
        int checkedRadioButtonId = radioSexGroup.getCheckedRadioButtonId();
        View radioButton = radioSexGroup.findViewById(checkedRadioButtonId);
        int sex = radioSexGroup.indexOfChild(radioButton);


        if (growthStr != null && !growthStr.equals("") && weightStr.equals("") && ageStr != null && !ageStr.equals("")) {

            float growthValue = Float.parseFloat(growthStr) / 100;
            float weightValue = Float.parseFloat(weightStr);
            float ageValue = Float.parseFloat(ageStr);
            float bmi = weightValue / (growthValue * growthValue);

            displayBMI(bmi, sex, weightValue, growthValue, ageValue);
        }
    }

    private void displayBMI(float bmi, int sex, float weight, float growth, float age) {
        String bmiLabel = "";
        String foodRecomendation = "";
        double kcal = 0;

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = getString(R.string.spora_niedowaga);
            foodRecomendation = "Zacznij jesć spora ilość miesa, warzyw i witamin";
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0) {
            bmiLabel = getString(R.string.niedowaga);
            foodRecomendation = "Sporzywaj więcej mięsa, warzyw i witamin";
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 20.5f) <= 0) {
            bmiLabel = getString(R.string.normalna);
            foodRecomendation = "Jedz 5 posiłków dziennie, staraj się nie jeść zbyt tłusto";
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.nadwaga);
            foodRecomendation = "Jedz 5 lekkich posiłków dziennie, nie możesz pozwolić sobie na kolejna pizze";
        } else {
            bmiLabel = getString(R.string.otylosc);
            foodRecomendation = "Jedz 5 razy dziennie tylko gotowane warzywa i mała ilośc mięs, zapomnij o pizzy itp.";
        }

        if (sex == 0) {
            kcal = 655.1 + (9.563 * weight) + (1.85 * growth) - (4.676 * age);
        } else if (sex == 1) {
            kcal = 66.5 + (13.75 * weight) + (5.003 * growth) - (6.775 * age);
        }

        bmiLabel = bmi + " = " + bmiLabel + "\n\n Powinieneś zjesć " + result + "kcal aby nie stracić wagi" + "\n\n COVID-19 REKOMENDACJA:\n " + foodRecomendation;
        result.setText(bmiLabel);
    }

}