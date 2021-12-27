package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class alternativeMilk extends AppCompatActivity {

    RadioButton onePercentRadioButton;
    RadioButton twoPercentRadioButton;
    RadioButton nonfatRadioButton;
    RadioButton wholeRadioButton;
    RadioButton heavyCreamRadioButton;
    RadioButton breveRadioButton;
    RadioButton almondRadioButton;
    RadioButton coconutRadioButton;
    RadioButton oatRadioButton;
    RadioButton soyRadioButton;
    RadioButton randomMilkRadioButton;



    String milkChosen;
    String coffeeChose;
    String milkAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_milk);

        onePercentRadioButton = findViewById(R.id.onePercentRbtn);
        twoPercentRadioButton = findViewById(R.id.twoPercentRbtn);
        nonfatRadioButton = findViewById(R.id.nonfatMilkRbtn);
        wholeRadioButton = findViewById(R.id.wholeMilkRbtn);
        heavyCreamRadioButton = findViewById(R.id.heavyCreamRbtn);
        breveRadioButton = findViewById(R.id.breveRbtn);
        almondRadioButton = findViewById(R.id.almondMilkRbtn);
        coconutRadioButton = findViewById(R.id.coconutMilkRbtn);
        soyRadioButton = findViewById(R.id.soyMilkRbtn);
        oatRadioButton = findViewById(R.id.oatMilkRbtn);
        randomMilkRadioButton = findViewById(R.id.randomMilkRbtn);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClickMilkBtn(View view) {

        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.onePercentRbtn:
                if (check)
                    milkChosen = onePercentRadioButton.getText().toString();
                    Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.twoPercentRbtn:
                if (check)
                    milkChosen = twoPercentRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.nonfatMilkRbtn:
                if (check)
                    milkChosen = nonfatRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.wholeMilkRbtn:
                if (check)
                    milkChosen = wholeRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.heavyCreamRbtn:
                if (check)
                    milkChosen = heavyCreamRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.breveRbtn:
                if (check)
                    milkChosen = breveRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.almondMilkRbtn:
                if (check)
                    milkChosen = almondRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.coconutMilkRbtn:
                if (check)
                    milkChosen = coconutRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.soyMilkRbtn:
                if (check)
                    milkChosen = soyRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.oatMilkRbtn:
                if (check)
                    milkChosen = oatRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), milkChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomMilkRbtn:
                if (check)
                    milkChosen = Drink.genRandomDrink().getMilk();
                break;
            default:
                break;
        }

        Intent toppingIntent = getIntent();
        coffeeChose = toppingIntent.getStringExtra("coffeeChosen");

        milkAdded = coffeeChose + milkChosen + " with ";

        Intent milkIntent = new Intent(alternativeMilk.this, toppings.class);
        milkIntent.putExtra("milkChosen", milkAdded);
        startActivity(milkIntent);

    }

}