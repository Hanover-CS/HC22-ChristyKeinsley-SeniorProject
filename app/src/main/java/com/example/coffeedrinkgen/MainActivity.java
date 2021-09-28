package com.example.coffeedrinkgen;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button customizeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customizeButton = findViewById(R.id.btn1);

        customizeButton.setOnClickListener(view -> {
//                Intent intent = new Intent(MainActivity.this, GeneratedActivity.class);
//                startActivity(intent);
            MainActivity.this.startActivity(new Intent(MainActivity.this, activityGenerateMe.class));
        });
//              When you click this it will take you to the page where it presents the generated drink.

//                Random rand = new Random();
//                int numb = rand.nextInt(100) +1;
//                ed1.setText(String.valueOf(numb));

//                String[] milk = {"Coconut", "Almond", "2%", "NonFat", "Soy", "Oat", "Whole"};
//                Random rMilk = new Random();
//                int randomMilkNum = rMilk.nextInt(milk.length);
//                ed1.setText(String.valueOf(milk[randomMilkNum]));

    }
    public void GeneratedActivity(View view) {
    }
}
