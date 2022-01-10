package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class hotIcedOrBlended extends AppCompatActivity {

    RadioButton hotRadioButton;
    RadioButton icedRadioButton;
    RadioButton blendedRadioButton;
    RadioButton randomHotIcedBlendedRadioButton;

    String hotIcedBlendedChosen;
    String hotIcedBlendedAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_iced_or_blended);

        hotRadioButton = findViewById(R.id.hotRbtn);
        icedRadioButton = findViewById(R.id.icedRbtn);
        blendedRadioButton = findViewById(R.id.blendedRbtn);
        randomHotIcedBlendedRadioButton = findViewById(R.id.randomHotIcedBlendedRbtn);

    }

        @SuppressLint("NonConstantResourceId")
    public void onClickHotIcedBlendedBtn(View view) {

        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.hotRbtn:
                if (check)
                    hotIcedBlendedChosen = hotRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), hotIcedBlendedChosen, Toast.LENGTH_SHORT).show();
                break;
            case R.id.icedRbtn:
                if (check)
                    hotIcedBlendedChosen = icedRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), hotIcedBlendedChosen, Toast.LENGTH_SHORT).show();
            case R.id.blendedRbtn:
                if (check)
                    hotIcedBlendedChosen = blendedRadioButton.getText().toString();
                Toast.makeText(getApplicationContext(), hotIcedBlendedChosen, Toast.LENGTH_SHORT).show();
            case R.id.randomHotIcedBlendedRbtn:
                if (check)
                    hotIcedBlendedChosen =  Drink.genRandomDrink().getHotIcedBlended();
                break;
            default:
                break;
        }

        Intent hotIcedOrBlendedIntent = new Intent(hotIcedOrBlended.this, syrupFlavours.class);

        hotIcedBlendedAdded = "I would like " + hotIcedBlendedChosen + " ";

        hotIcedOrBlendedIntent.putExtra("hotIcedBlendedChosen", hotIcedBlendedAdded);
        startActivity(hotIcedOrBlendedIntent);

    }
}

