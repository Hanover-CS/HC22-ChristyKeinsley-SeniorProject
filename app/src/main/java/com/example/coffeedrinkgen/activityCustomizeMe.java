package com.example.coffeedrinkgen;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activityCustomizeMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_me);

        TextView customizeGeneratedDrinkText = findViewById(R.id.customizeYourDrinkTxt);
        Button customizeGenerateButton = findViewById(R.id.customizeGenerateBtn);


        Intent finalDrinkIntent = getIntent();
        String finalDrink = finalDrinkIntent.getStringExtra("whipChosen");

        customizeGenerateButton.setOnClickListener(view -> customizeGeneratedDrinkText.setText(finalDrink));
    }
}