package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class customizeCoffee extends AppCompatActivity {

    Button coffeeButton;
    Button noCoffeeButton;
    Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_coffee);

        coffeeButton = findViewById(R.id.coffeeBtn);
        noCoffeeButton = findViewById(R.id.noCoffeeBtn);
        skipButton = findViewById(R.id.skipBtn1);

        coffeeButton.setOnClickListener(view -> {
            customizeCoffee.this.startActivity(new Intent(customizeCoffee.this, hotIcedOrBlended.class));
        });

        noCoffeeButton.setOnClickListener(view -> {
            customizeCoffee.this.startActivity(new Intent(customizeCoffee.this, hotIcedOrBlended.class));
        });

        skipButton.setOnClickListener(view -> {
            customizeCoffee.this.startActivity(new Intent(customizeCoffee.this, hotIcedOrBlended.class));
        });

    }
}