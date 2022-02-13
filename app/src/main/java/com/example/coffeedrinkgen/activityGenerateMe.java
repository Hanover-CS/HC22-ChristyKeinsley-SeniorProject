package com.example.coffeedrinkgen;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activityGenerateMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_me);

        TextView generatedDrinkText = findViewById(R.id.yourDrinkTxt);
        Button generateButton = findViewById(R.id.generateBtn);

        generateButton.setOnClickListener(view -> generatedDrinkText.setText(valueOf(drink)));
    }

    Drink drink = Drink.genRandomDrink();
}