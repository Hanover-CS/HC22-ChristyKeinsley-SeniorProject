package com.example.coffeedrinkgen;

import static java.lang.String.valueOf;

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

//
//        Intent milkIntent = getIntent();
//        milk = milkIntent.getStringExtra("milkChosen");

        Intent finalDrinkIntent = getIntent();
        finalDrink = finalDrinkIntent.getStringExtra("toppingChosen");

        //String.valueOf(milk);
//        if (milk == null){
//            milk = "why";
//        }

//        String finalDrink = ("I would like "  + " "  + " with "
//                 + " and made with " + milk + " with "
//                + " and " );

        //+ hotIcedOrBlendedOption
        //+ flavourOption
        //+ coffeeOption
        //+ toppingOption
        //+ whippedCreamOption

        customizeGenerateButton.setOnClickListener(view -> customizeGeneratedDrinkText.setText(finalDrink));

    }

    CustomizedDrink customDrink = CustomizedDrink.genCustomizedDrink();

}