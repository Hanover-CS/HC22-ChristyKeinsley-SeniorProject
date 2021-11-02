package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class hotIcedOrBlended extends AppCompatActivity {

    Button hotButton;
    Button icedButton;
    Button blendedButton;
    Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_iced_or_blended);

        hotButton = findViewById(R.id.hotBtn);
        icedButton = findViewById(R.id.icedBtn);
        blendedButton = findViewById(R.id.blendedBtn);
        skipButton = findViewById(R.id.skipBtn2);

        hotButton.setOnClickListener(view -> hotIcedOrBlended.this.startActivity(new Intent(hotIcedOrBlended.this, alternativeMilk.class)));

        icedButton.setOnClickListener(view -> hotIcedOrBlended.this.startActivity(new Intent(hotIcedOrBlended.this, alternativeMilk.class)));

        blendedButton.setOnClickListener(view -> hotIcedOrBlended.this.startActivity(new Intent(hotIcedOrBlended.this, alternativeMilk.class)));

        skipButton.setOnClickListener(view -> hotIcedOrBlended.this.startActivity(new Intent(hotIcedOrBlended.this, alternativeMilk.class)));
    }
}