package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class whipCream extends AppCompatActivity {

    RadioButton whipCreamRadioButton;
    RadioButton noWhipCreamRadioButton;
    RadioButton randomWhipCreamRadioButton;


    String whipChosen;
    String milkChose;
    String whipAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whip_cream);

        whipCreamRadioButton = findViewById(R.id.whipCreamRbtn);
        noWhipCreamRadioButton = findViewById(R.id.noWhipCreamRbtn);
        randomWhipCreamRadioButton = findViewById(R.id.randomWhipCreamRbtn);

    }
    @SuppressLint("NonConstantResourceId")
    public void onClickWhipBtn(View view) {

        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.whipCreamRbtn:
                if (check)
                    whipChosen = whipCreamRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), whipChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.noWhipCreamRbtn:
                if (check)
                    whipChosen = noWhipCreamRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), whipChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomWhipCreamRbtn:
                if (check)
                    whipChosen = Drink.genRandomDrink().getWhip();
                break;
            default:
                break;
        }

        Intent milkIntent = getIntent();
        milkChose = milkIntent.getStringExtra("milkChosen");

        whipAdded = milkChose + " " + whipChosen;

        Intent whipIntent = new Intent(whipCream.this, syrupFlavours.class);
        whipIntent.putExtra("whipChosen", whipAdded);
        startActivity(whipIntent);
    }
}