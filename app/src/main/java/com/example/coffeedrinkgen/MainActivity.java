package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generateMeButton = findViewById(R.id.generateMeBtn);
        Button customizeMeButton = findViewById(R.id.customizeMeBtn);

        //When you click this it will take you to the page where it presents the generated drink.
        generateMeButton.setOnClickListener(view -> MainActivity.this.startActivity(new Intent(MainActivity.this, activityGenerateMe.class)));

        //When you click on this it will take you to where you will start to customize the drink.
        customizeMeButton.setOnClickListener(view -> MainActivity.this.startActivity(new Intent(MainActivity.this, hotIcedOrBlended.class)));

    }
}
