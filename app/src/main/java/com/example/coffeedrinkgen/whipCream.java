package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class whipCream extends AppCompatActivity {

    Button whipCreamRadioButton;
    Button noWhipCreamRadioButton;
    Button skipButton;

    String whipChosen;
    String milkChose;
    String whipAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whip_cream);

        whipCreamRadioButton = findViewById(R.id.whipCreamRbtn);
        noWhipCreamRadioButton = findViewById(R.id.noWhipCreamRbtn);
        skipButton = findViewById(R.id.skipBtn4);

        skipButton.setOnClickListener(view -> {
            whipCream.this.startActivity(new Intent(whipCream.this, syrupFlavours.class));
        });
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