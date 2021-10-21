package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class syrupFlavours extends AppCompatActivity {

    ArrayList<Object> syrupResult = new ArrayList<>();

    Button nextButton;
    Button skipButton;

    CheckBox whiteMochaCheckBox;
    CheckBox mochaCheckBox;
    CheckBox vanillaCheckBox;
    CheckBox sfVanillaCheckBox;
    CheckBox caramelCheckBox;
    CheckBox chaiCheckBox;
    CheckBox hazelnutCheckBox;
    CheckBox pumpkinSpiceCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrup_flavours);

        nextButton = findViewById(R.id.nextBtn);
        skipButton = findViewById(R.id.skipBtn5);

        nextButton.setOnClickListener(view -> {
            syrupFlavours.this.startActivity(new Intent(syrupFlavours.this, toppings.class));
        });

        skipButton.setOnClickListener(view -> {
            syrupFlavours.this.startActivity(new Intent(syrupFlavours.this, toppings.class));
        });

        whiteMochaCheckBox = findViewById(R.id.whitemochaCheckB);
        mochaCheckBox = findViewById(R.id.mochaCheckB);
        vanillaCheckBox = findViewById(R.id.vanillaCheckB);
        sfVanillaCheckBox = findViewById(R.id.sfVanillaCheckB);
        caramelCheckBox = findViewById(R.id.caramelCheckB);
        chaiCheckBox = findViewById(R.id.chaiCheckB);
        hazelnutCheckBox = findViewById(R.id.hazelnutCheckB);
        pumpkinSpiceCheckBox = findViewById(R.id.pumpkinCheckB);


        whiteMochaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (whiteMochaCheckBox.isChecked())
                    syrupResult.add("White mocha");
            }
        });

        mochaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mochaCheckBox.isChecked())
                    syrupResult.add("Mocha");
            }
        });

        vanillaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vanillaCheckBox.isChecked())
                    syrupResult.add("Vanilla");
            }
        });

        sfVanillaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sfVanillaCheckBox.isChecked())
                    syrupResult.add("Sf Vanilla");
            }
        });

        caramelCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caramelCheckBox.isChecked())
                    syrupResult.add("Caramel");
            }
        });

        chaiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chaiCheckBox.isChecked())
                    syrupResult.add("Chai");
            }
        });

        hazelnutCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hazelnutCheckBox.isChecked())
                    syrupResult.add("Hazelnut");
            }
        });

        pumpkinSpiceCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pumpkinSpiceCheckBox.isChecked())
                    syrupResult.add("Pumpkin Spice");
            }
        });
    }
}