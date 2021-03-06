package com.example.coffeedrinkgen;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class activityGenerateMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_me);

        //Animation
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);

        TextView generatedDrinkText = findViewById(R.id.yourDrinkTxt);
        Button generateButton = findViewById(R.id.generateBtn);

        Drink drink = Drink.genRandomDrink();
        generateButton.setOnClickListener(view -> generatedDrinkText.setText(valueOf(drink)));
        generateButton.startAnimation(animation);
    }
}