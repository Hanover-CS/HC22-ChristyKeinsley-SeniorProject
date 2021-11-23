package com.example.coffeedrinkgen;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class activityCustomizeMe extends AppCompatActivity {

    EditText customizeGeneratedDrinkText;
    Button customizeGenerateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_me);

        customizeGeneratedDrinkText = findViewById(R.id.customizedDrinkEditTxt);
        customizeGenerateButton = findViewById(R.id.customizeDrinkBtn);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String message= extras.getString("milkChosen");
            customizeGenerateButton.setOnClickListener(view -> customizeGeneratedDrinkText.setText(valueOf(message)));
        }
    }
}