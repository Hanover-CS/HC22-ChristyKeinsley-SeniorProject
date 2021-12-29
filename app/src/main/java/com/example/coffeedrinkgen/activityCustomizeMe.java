package com.example.coffeedrinkgen;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class activityCustomizeMe extends AppCompatActivity {

    EditText customizeGeneratedDrinkText;
    Button customizeGenerateButton;

    String finalDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_me);

        customizeGeneratedDrinkText = findViewById(R.id.customizedDrinkEditTxt);
        customizeGenerateButton = findViewById(R.id.customizeDrinkBtn);


        Intent finalDrinkIntent = getIntent();
        finalDrink = finalDrinkIntent.getStringExtra("whipChosen");

        customizeGenerateButton.setOnClickListener(view -> customizeGeneratedDrinkText.setText(finalDrink));
    }
}