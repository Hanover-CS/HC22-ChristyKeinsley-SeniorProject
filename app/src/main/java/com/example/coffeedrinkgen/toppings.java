package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class toppings extends AppCompatActivity {

    ArrayList<Object> toppingResult = new ArrayList<>();

    RadioButton randomTopping;

    CheckBox caramelDrizzleCheckBox;
    CheckBox mochaDrizzleCheckBox;
    CheckBox cinnamonPwdCheckBox;
    CheckBox cinnamonSgrCheckBox;
    CheckBox nutmegCheckBox;
    CheckBox pumpkinSpiceCheckBox;

    String toppingChosen;
    String flavourChose;
    String toppingAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);

        randomTopping = findViewById(R.id.randomToppingRbtn);

        caramelDrizzleCheckBox = findViewById(R.id.caramelCheckB);
        mochaDrizzleCheckBox = findViewById(R.id.mochaDrizzleCheckB);
        cinnamonPwdCheckBox = findViewById(R.id.cinnamonPwdCheckB);
        cinnamonSgrCheckBox = findViewById(R.id.cinnamonSgrCheckB);
        nutmegCheckBox = findViewById(R.id.nutmegCheckB);
        pumpkinSpiceCheckBox = findViewById(R.id.pumpkinSpiceTCheckB);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickToppingCheckBox(View view) {

        boolean check = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.caramelCheckB:
                if (check)
                    toppingChosen = caramelDrizzleCheckBox.getText().toString();
                    toppingResult.add("Caramel drizzle");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.mochaCheckB:
                if (check)
                    toppingChosen = mochaDrizzleCheckBox.getText().toString();
                    toppingResult.add("Mocha drizzle");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.cinnamonPwdCheckB:
                if (check)
                    toppingChosen = cinnamonPwdCheckBox.getText().toString();
                    toppingResult.add("Cinnamon powder");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.cinnamonSgrCheckB:
                if (check)
                    toppingChosen = cinnamonSgrCheckBox.getText().toString();
                    toppingResult.add("Cinnamon sugar");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.nutmegCheckB:
                if (check)
                    toppingChosen = nutmegCheckBox.getText().toString();
                    toppingResult.add("Nutmeg");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.pumpkinCheckB:
                if (check)
                    toppingChosen = pumpkinSpiceCheckBox.getText().toString();
                    toppingResult.add("Pumpkin spice");
                Toast.makeText(getApplicationContext(), toppingChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomToppingRbtn:
                if (check)
                    toppingChosen = Drink.genRandomDrink().getTopping();
                    toppingResult.add(toppingChosen);
                break;
            default:
                break;
        }

        Intent flavourIntent = getIntent();
        flavourChose = flavourIntent.getStringExtra("flavourChosen");

        //toppingAdded = flavourChose + " " + toppingChosen;

        toppingAdded = flavourChose + " " + toppingResult;

        Intent toppingIntent = new Intent(toppings.this, activityCustomizeMe.class);
        toppingIntent.putExtra("toppingChosen", toppingAdded);
        startActivity(toppingIntent);
    }
}
