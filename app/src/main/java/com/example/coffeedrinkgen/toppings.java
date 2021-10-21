package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class toppings extends AppCompatActivity {

    ArrayList<Object> toppingResult = new ArrayList<>();

    Button nextButton;
    Button skipButton;


    CheckBox caramelDrizzleCheckBox;
    CheckBox mochaDrizzleCheckBox;
    CheckBox cinnamonPwdCheckBox;
    CheckBox cinnamonSgrCheckBox;
    CheckBox nutmegCheckBox;
    CheckBox pumpkinSpiceCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);


        nextButton = findViewById(R.id.nextBtn2);
        skipButton = findViewById(R.id.skipBtn8);

        nextButton.setOnClickListener(view -> {
            toppings.this.startActivity(new Intent(toppings.this, activityCustomizeMe.class));
        });


        skipButton.setOnClickListener(view -> {
            toppings.this.startActivity(new Intent(toppings.this, activityCustomizeMe.class));
        });

        caramelDrizzleCheckBox = findViewById(R.id.caramelCheckB);
        mochaDrizzleCheckBox = findViewById(R.id.mochaDrizzleCheckB);
        cinnamonPwdCheckBox = findViewById(R.id.cinnamonPwdCheckB);
        cinnamonSgrCheckBox = findViewById(R.id.cinnamonSgrCheckB);
        nutmegCheckBox = findViewById(R.id.nutmegCheckB);
        pumpkinSpiceCheckBox = findViewById(R.id.pumpkinSpiceTCheckB);

        caramelDrizzleCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caramelDrizzleCheckBox.isChecked())
                    toppingResult.add("Caramel drizzle");
            }
        });

        mochaDrizzleCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mochaDrizzleCheckBox.isChecked())
                    toppingResult.add("Mocha drizzle");
            }
        });

        cinnamonPwdCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cinnamonPwdCheckBox.isChecked())
                    toppingResult.add("Cinnamon powder");
            }
        });

        cinnamonSgrCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cinnamonSgrCheckBox.isChecked())
                    toppingResult.add("Cinnamon sugar");
            }
        });

        nutmegCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nutmegCheckBox.isChecked())
                    toppingResult.add("Nutmeg");
            }
        });

        pumpkinSpiceCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pumpkinSpiceCheckBox.isChecked())
                    toppingResult.add("Pumpkin spice");
            }
        });

    }
}