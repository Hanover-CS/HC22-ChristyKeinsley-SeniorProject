package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class toppings extends AppCompatActivity {

    RadioButton randomTopping;

    RadioButton caramelDrizzleRadioButton;
    RadioButton mochaDrizzleRadioButton;
    RadioButton cinnamonPwdRadioButton;
    RadioButton cinnamonSgrRadioButton;
    RadioButton nutmegRadioButton;
    RadioButton pumpkinSpiceRadioButton;

    String toppingChosen;
    String flavourChose;
    String toppingAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);

        randomTopping = findViewById(R.id.randomToppingRbtn);

        caramelDrizzleRadioButton = findViewById(R.id.caramelDrizzleRbtn);
        mochaDrizzleRadioButton = findViewById(R.id.mochaDrizzleRbtn);
        cinnamonPwdRadioButton = findViewById(R.id.cinnamonPwdRbtn);
        cinnamonSgrRadioButton = findViewById(R.id.cinnamonSugarRbtn);
        nutmegRadioButton = findViewById(R.id.nutmegRbtn);
        pumpkinSpiceRadioButton = findViewById(R.id.pumpkinSpiceRbtn);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickToppingRadioButton(View view) {

        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.caramelDrizzleRbtn:
                if (check)
                    toppingChosen = caramelDrizzleRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mochaDrizzleRbtn:
                if (check)
                    toppingChosen = mochaDrizzleRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.cinnamonPwdRbtn:
                if (check)
                    toppingChosen = cinnamonPwdRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.cinnamonSugarRbtn:
                if (check)
                    toppingChosen = cinnamonSgrRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.nutmegRbtn:
                if (check)
                    toppingChosen = nutmegRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.pumpkinSpiceRbtn:
                if (check)
                    toppingChosen = pumpkinSpiceRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomToppingRbtn:
                if (check)
                    toppingChosen = Drink.genRandomDrink().getTopping();
                break;
            default:
                break;
        }

        Intent flavourIntent = getIntent();
        flavourChose = flavourIntent.getStringExtra("flavourChosen");


        toppingAdded = flavourChose + " " + toppingChosen;

        Intent toppingIntent = new Intent(toppings.this, activityCustomizeMe.class);
        toppingIntent.putExtra("toppingChosen", toppingAdded);
        startActivity(toppingIntent);
    }
}
