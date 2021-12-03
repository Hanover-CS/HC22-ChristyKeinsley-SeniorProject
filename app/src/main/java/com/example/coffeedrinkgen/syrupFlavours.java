package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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

    String flavourChosen;
    String flavourAdded;
    String whipChose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrup_flavours);

        nextButton = findViewById(R.id.nextBtn);
        skipButton = findViewById(R.id.skipBtn5);

        nextButton.setOnClickListener(view -> syrupFlavours.this.startActivity(new Intent(syrupFlavours.this, toppings.class)));

        skipButton.setOnClickListener(view -> syrupFlavours.this.startActivity(new Intent(syrupFlavours.this, toppings.class)));

        whiteMochaCheckBox = findViewById(R.id.whitemochaCheckB);
        mochaCheckBox = findViewById(R.id.mochaCheckB);
        vanillaCheckBox = findViewById(R.id.vanillaCheckB);
        sfVanillaCheckBox = findViewById(R.id.sfVanillaCheckB);
        caramelCheckBox = findViewById(R.id.caramelCheckB);
        chaiCheckBox = findViewById(R.id.chaiCheckB);
        hazelnutCheckBox = findViewById(R.id.hazelnutCheckB);
        pumpkinSpiceCheckBox = findViewById(R.id.pumpkinCheckB);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickSyrupCheckBox(View view) {
        boolean check = ((CheckBox) view).isChecked();
        switch (view.getId()) {

            case R.id.whitemochaCheckB:
                if (check)
                    flavourChosen = whiteMochaCheckBox.getText().toString();
                    syrupResult.add("White mocha");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mochaCheckB:
                if (check)
                    flavourChosen = mochaCheckBox.getText().toString();
                    syrupResult.add("Mocha");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.vanillaCheckB:
                if (check)
                    flavourChosen = vanillaCheckBox.getText().toString();
                    syrupResult.add("Vanilla");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.sfVanillaCheckB:
                if (check)
                    flavourChosen = sfVanillaCheckBox.getText().toString();
                    syrupResult.add("SF Vanilla");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.caramelCheckB:
                if (check)
                    flavourChosen = caramelCheckBox.getText().toString();
                    syrupResult.add("Caramel");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.chaiCheckB:
                if (check)
                    flavourChosen = chaiCheckBox.getText().toString();
                    syrupResult.add("Chai");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.hazelnutCheckB:
                if (check)
                    flavourChosen = hazelnutCheckBox.getText().toString();
                    syrupResult.add("Hazelnut");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.pumpkinCheckB:
                if (check)
                    flavourChosen = pumpkinSpiceCheckBox.getText().toString();
                    syrupResult.add("Pumpkin Spice");
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        Intent whipIntent = getIntent();
        whipChose = whipIntent.getStringExtra("whipChosen");

        flavourAdded = whipChose + " " + flavourChosen;

        Intent flavourIntent = new Intent(syrupFlavours.this, toppings.class);
        flavourIntent.putExtra("flavourChosen", flavourAdded);
        startActivity(flavourIntent);


    }
}