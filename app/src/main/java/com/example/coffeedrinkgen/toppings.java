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

    String toppingChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);

        nextButton = findViewById(R.id.nextBtn2);
        skipButton = findViewById(R.id.skipBtn8);

        nextButton.setOnClickListener(view -> toppings.this.startActivity(new Intent(toppings.this, activityCustomizeMe.class)));
        skipButton.setOnClickListener(view -> toppings.this.startActivity(new Intent(toppings.this, activityCustomizeMe.class)));

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
                break;
            default:
                break;
        }
    }
}
