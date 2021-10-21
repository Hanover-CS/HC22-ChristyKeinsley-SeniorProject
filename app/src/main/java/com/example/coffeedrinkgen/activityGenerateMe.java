package com.example.coffeedrinkgen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class activityGenerateMe extends AppCompatActivity {

    EditText generatedDrinkText;
    Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_me);

        generatedDrinkText = findViewById(R.id.yourDrinkTxt);
        generateButton = findViewById(R.id.generateBtn);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<String> coffeeList = new ArrayList<>();
                coffeeList.add("Coffee");
                coffeeList.add("No Coffee");

                Random randomCoffee = new Random();
                int coffeeOrNone = randomCoffee.nextInt(coffeeList.size());
                String generatedCoffee = coffeeList.get(coffeeOrNone);

                List<String> hotIcedBlendedList = new ArrayList<>();
                hotIcedBlendedList.add("Hot");
                hotIcedBlendedList.add("Iced");
                hotIcedBlendedList.add("Blended");

                Random randomHotIcedBlended = new Random();
                int hotIcedBlended = randomHotIcedBlended.nextInt(hotIcedBlendedList.size());
                String generatedHotIcedBlended = hotIcedBlendedList.get(hotIcedBlended);

                List<String> milkList = new ArrayList<>();
                milkList.add("1%");
                milkList.add("2%");
                milkList.add("Nonfat Milk");
                milkList.add("Whole Milk");
                milkList.add("Heavy Cream");
                milkList.add("Breve");
                milkList.add("Almond Milk");
                milkList.add("Coconut Milk");
                milkList.add("Oat Milk");
                milkList.add("Soy Milk");

                Random randomMilk = new Random();
                int milk = randomMilk.nextInt(milkList.size());
                String generatedMilk = milkList.get(milk);

                List<String> whipCreamList = new ArrayList<>();
                whipCreamList.add("add Whip");
                whipCreamList.add("No Whip");

                Random randomWhip = new Random();
                int whipOrNone = randomWhip.nextInt(whipCreamList.size());
                String generatedWhip = whipCreamList.get(whipOrNone);

                List<String> flavourList = new ArrayList<>();
                flavourList.add("White Mocha");
                flavourList.add("Mocha");
                flavourList.add("Vanilla");
                flavourList.add("Sf Vanilla");
                flavourList.add("Caramel");
                flavourList.add("Chai");
                flavourList.add("Hazelnut");
                flavourList.add("Pumpkin Spice");

                Random randomFlavour = new Random();
                int flavour = randomFlavour.nextInt(flavourList.size());
                String generatedFlavour = flavourList.get(flavour);

                List<String> toppingList = new ArrayList<>();
                toppingList.add("Caramel Drizzle");
                toppingList.add("Mocha Drizzle");
                toppingList.add("Cinnamon Powder");
                toppingList.add("Cinnamon Sugar");
                toppingList.add("Nutmeg");
                toppingList.add("Pumpkin Spice");

                Random randomTopping = new Random();
                int topping = randomTopping.nextInt(toppingList.size());
                String generatedTopping = toppingList.get(topping);

                List<String> generatedDrink = new ArrayList<>();

                generatedDrink.add(generatedHotIcedBlended);
                generatedDrink.add(generatedCoffee);
                generatedDrink.add(generatedFlavour);
                generatedDrink.add(generatedMilk);
                generatedDrink.add(generatedWhip);
                generatedDrink.add(generatedTopping);

                generatedDrinkText.setText(String.valueOf(generatedDrink));
            }
        });
    }
}