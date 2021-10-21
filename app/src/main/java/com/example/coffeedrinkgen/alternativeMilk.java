package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class alternativeMilk extends AppCompatActivity {

    Button onePercentButton;
    Button twoPercentButton;
    Button nonfatButton;
    Button wholeButton;
    Button heavyCreamButton;
    Button breveButton;
    Button almondButton;
    Button coconutButton;
    Button oatButton;
    Button soyButton;
    Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_milk);

        onePercentButton = findViewById(R.id.onePercentBtn);
        twoPercentButton = findViewById(R.id.twoPercentBtn);
        nonfatButton = findViewById(R.id.nonfatBtn);
        wholeButton = findViewById(R.id.wholeBtn);
        heavyCreamButton = findViewById(R.id.heavyCreamBtn);
        breveButton = findViewById(R.id.breveBtn);
        almondButton = findViewById(R.id.almondBtn);
        coconutButton = findViewById(R.id.coconutBtn);
        oatButton = findViewById(R.id.oatBtn);
        soyButton = findViewById(R.id.soyBtn);       
        skipButton = findViewById(R.id.skipBtn3);

        onePercentButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        twoPercentButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        nonfatButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        wholeButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        heavyCreamButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        breveButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        almondButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        coconutButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        oatButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        soyButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

        skipButton.setOnClickListener(view -> {
            alternativeMilk.this.startActivity(new Intent(alternativeMilk.this, whipCream.class));
        });

    }
}