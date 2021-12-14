package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class customizeCoffee extends AppCompatActivity {

    Button coffeeRadioButton;
    Button noCoffeeRadioButton;
    Button skipButton;

    String coffeeChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_coffee);

        coffeeRadioButton = findViewById(R.id.coffeeRbtn);
        noCoffeeRadioButton = findViewById(R.id.noCoffeeRbtn);
        skipButton = findViewById(R.id.skipBtn1);

        skipButton.setOnClickListener(view -> {
            customizeCoffee.this.startActivity(new Intent(customizeCoffee.this, hotIcedOrBlended.class));
        });
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
                default:
                    break;
            }

            Intent coffeeIntent = new Intent(customizeCoffee.this, hotIcedOrBlended.class);
            coffeeIntent.putExtra("coffeeChosen", coffeeChosen);
            startActivity(coffeeIntent);
    }
}