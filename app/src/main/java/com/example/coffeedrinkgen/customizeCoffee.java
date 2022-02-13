package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class customizeCoffee extends AppCompatActivity {

    RadioButton coffeeRadioButton;
    RadioButton noCoffeeRadioButton;
    RadioButton randomCoffeeRadioButton;

    String coffeeChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_coffee);

        coffeeRadioButton = findViewById(R.id.coffeeRbtn);
        noCoffeeRadioButton = findViewById(R.id.noCoffeeRbtn);
        randomCoffeeRadioButton = findViewById(R.id.randomCoffeeRbtn);

    }
        @SuppressLint("NonConstantResourceId")
        public void onClickCoffeeBtn(View view) {

            boolean check = ((RadioButton) view).isChecked();
            switch (view.getId()) {
                case R.id.coffeeRbtn:
                    if (check)
                        coffeeChosen = coffeeRadioButton.getText().toString();
                    Toast.makeText(getApplicationContext(), coffeeChosen, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.noCoffeeRbtn:
                    if (check)
                        coffeeChosen = noCoffeeRadioButton.getText().toString();
                    Toast.makeText(getApplicationContext(), coffeeChosen, Toast.LENGTH_SHORT).show();
                case R.id.randomCoffeeRbtn:
                    if (check)
                        coffeeChosen = Drink.genRandomDrink().getCoffeeOrNoCoffee();
                default:
                    break;
            }

            Intent flavourIntent = getIntent();
            String flavourChose = flavourIntent.getStringExtra("flavourChosen");

            String coffeeAdded = flavourChose + coffeeChosen + " and made with ";

            Intent milkIntent = new Intent(customizeCoffee.this, alternativeMilk.class);
            milkIntent.putExtra("coffeeChosen", coffeeAdded);
            startActivity(milkIntent);


    }
}