package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class syrupFlavours extends AppCompatActivity {

    RadioButton randomSyrup;

    RadioButton whiteMochaRadioButton;
    RadioButton mochaRadioButton;
    RadioButton vanillaRadioButton;
    RadioButton sfVanillaRadioButton;
    RadioButton caramelRadioButton;
    RadioButton chaiRadioButton;
    RadioButton hazelnutRadioButton;
    RadioButton pumpkinSpiceRadioButton;

    String flavourChosen;
    String flavourAdded;
    String whipChose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrup_flavours);

        randomSyrup = findViewById(R.id.randomSyrupRbtn);

        whiteMochaRadioButton = findViewById(R.id.whiteMochaRbtn);
        mochaRadioButton = findViewById(R.id.mochaRbtn);
        vanillaRadioButton = findViewById(R.id.vanillaRbtn);
        sfVanillaRadioButton = findViewById(R.id.sfVanillaRbtn);
        caramelRadioButton = findViewById(R.id.caramelRbtn);
        chaiRadioButton = findViewById(R.id.chaiRbtn);
        hazelnutRadioButton = findViewById(R.id.hazelnutRbtn);
        pumpkinSpiceRadioButton = findViewById(R.id.pumpkinSpiceFlavourRbtn);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickSyrupRadioButton(View view) {
        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.whiteMochaRbtn:
                if (check)
                    flavourChosen = whiteMochaRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mochaRbtn:
                if (check)
                    flavourChosen = mochaRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.vanillaRbtn:
                if (check)
                    flavourChosen = vanillaRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.sfVanillaRbtn:
                if (check)
                    flavourChosen = sfVanillaRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.caramelRbtn:
                if (check)
                    flavourChosen = caramelRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.chaiRbtn:
                if (check)
                    flavourChosen = chaiRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.hazelnutRbtn:
                if (check)
                    flavourChosen = hazelnutRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.pumpkinSpiceFlavourRbtn:
                if (check)
                    flavourChosen = pumpkinSpiceRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), flavourChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomSyrupRbtn:
                if (check)
                    flavourChosen = Drink.genRandomDrink().getFlavour();
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