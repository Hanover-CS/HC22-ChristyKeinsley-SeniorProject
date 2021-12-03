package com.example.coffeedrinkgen;

import static java.lang.String.valueOf;

import android.content.Intent;

public class CustomizedDrink {

//    String coffeeOption;
//    String hotIcedOrBlendedOption;
    String customizedMilkOption;
//    String whippedCreamOption;
//    String flavourOption;
//    String toppingOption;

    public CustomizedDrink() {
//        toppingOption = "";
//        coffeeOption = "";
//        hotIcedOrBlendedOption = "";
        customizedMilkOption = "";
//        whippedCreamOption = "";
//        flavourOption = "";
    }

    public static CustomizedDrink genCustomizedDrink() {
        CustomizedDrink customDrink = new CustomizedDrink();
//        customizedDrink.getRandomTopping();
//        customizedDrink.getRandomFlavour();
        customDrink.getCustomizedMilk();
//        customizedDrink.getRandomWhip();
//        customizedDrink.getRandomCoffeeOrNoCoffee();
//        customizedDrink.getRandomHotIcedOrBlended();
        return customDrink;
    }

    public String toString(){ return "I would like "  + " "  + " with "
             + " and made with " + customizedMilkOption + " with "
            + " and ";}

    public void getCustomizedMilk(){
        Intent milkIntent = new Intent();
        //String n = getIntent().getStringExtra("milkChosen");
        String m = milkIntent.getStringExtra("milkChosen");
        setCustomizedMilk(m);
    }

    public void setCustomizedMilk(String m) {
        customizedMilkOption = m;
    }

}
