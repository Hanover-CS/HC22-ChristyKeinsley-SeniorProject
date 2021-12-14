package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class hotIcedOrBlended extends AppCompatActivity {

    Button hotRadioButton;
    Button icedRadioButton;
    Button blendedRadioButton;
    Button skipButton;

    String hotIcedBlendedChosen;
    String hotIcedBlendedAdded;
    String coffeeChose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_iced_or_blended);

        hotRadioButton = findViewById(R.id.hotRbtn);
        icedRadioButton = findViewById(R.id.icedRbtn);
        blendedRadioButton = findViewById(R.id.blendedRbtn);
        skipButton = findViewById(R.id.skipBtn2);

        skipButton.setOnClickListener(view -> hotIcedOrBlended.this.startActivity(new Intent(hotIcedOrBlended.this, alternativeMilk.class)));
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
                break;
            default:
                break;
        }

        Intent coffeeIntent = getIntent();
        coffeeChose = coffeeIntent.getStringExtra("coffeeChosen");

        hotIcedBlendedAdded = coffeeChose + " " + hotIcedBlendedChosen;

        Intent hotIcedBlendedIntent = new Intent(hotIcedOrBlended.this, alternativeMilk.class);
        hotIcedBlendedIntent.putExtra("hotIcedBlendedChosen", hotIcedBlendedAdded);
        startActivity(hotIcedBlendedIntent);
    }
}

