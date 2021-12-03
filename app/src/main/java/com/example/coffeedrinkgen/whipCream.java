package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class whipCream extends AppCompatActivity {

    Button whipCreamButton;
    Button noWhipCreamButton;
    Button skipButton;
    String whipChosen;
    String milkChose;
    String whipAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whip_cream);

        whipCreamButton = findViewById(R.id.whipCreamBtn);
        noWhipCreamButton = findViewById(R.id.noWhippedCreamBtn);
        skipButton = findViewById(R.id.skipBtn4);

        whipCreamButton.setOnClickListener(view -> {
            whipChosen = whipCreamButton.getText().toString();
            whipCream.this.startActivity(new Intent(whipCream.this, syrupFlavours.class));
        });

        noWhipCreamButton.setOnClickListener(view -> {
            whipChosen = noWhipCreamButton.getText().toString();
            whipCream.this.startActivity(new Intent(whipCream.this, syrupFlavours.class));
        });

        skipButton.setOnClickListener(view -> {
            whipCream.this.startActivity(new Intent(whipCream.this, syrupFlavours.class));
        });

        Intent milkIntent = getIntent();
        milkChose = milkIntent.getStringExtra("milkChosen");

        whipAdded = milkChose + " " + whipChosen;

        Intent whipIntent = new Intent(whipCream.this, syrupFlavours.class);
        whipIntent.putExtra("whipChosen", whipAdded);
        startActivity(whipIntent);
    }
}