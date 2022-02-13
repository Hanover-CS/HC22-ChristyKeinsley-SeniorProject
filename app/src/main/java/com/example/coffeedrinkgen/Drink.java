package com.example.coffeedrinkgen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Drink {

    String coffeeOption;
    String hotIcedOrBlendedOption;
    String milkOption;
    String whippedCreamOption;
    String flavourOption;
    String toppingOption;

    private final static List<String> flavourList = Arrays.asList("white mocha", "mocha", "vanilla", "sugar free vanilla",
            "caramel", "chai", "hazelnut", "pumpkin spice");

    private final static List<String> toppingList = Arrays.asList("caramel drizzle", "mocha drizzle",
            "cinnamon powder", "cinnamon sugar", "nutmeg", "pumpkin spice");

    private final static List<String> milkList = Arrays.asList("one percent", "two percent", "nonfat milk","whole milk", "heavy cream",
            "breve", "almond milk", "coconut milk", "oat milk", "soy milk");

    private final static List<String> whipCreamList = Arrays.asList("whip cream", "no whip");

    private final static List<String> hotIcedBlendedList = Arrays.asList("a hot", "an iced", "a blended");

    private final static List<String> coffeeList = Arrays.asList("coffee", "no coffee");

    public Drink() {
        toppingOption = "";
        coffeeOption = "";
        hotIcedOrBlendedOption = "";
        milkOption = "";
        whippedCreamOption = "";
        flavourOption = "";
    }

    public static Drink genRandomDrink() {
        Drink randDrink = new Drink();
        randDrink.getRandomTopping();
        randDrink.getRandomFlavour();
        randDrink.getRandomMilk();
        randDrink.getRandomWhip();
        randDrink.getRandomCoffeeOrNoCoffee();
        randDrink.getRandomHotIcedOrBlended();
        return randDrink;
    }

    public String toString(){ return "I would like " + hotIcedOrBlendedOption + " " + flavourOption + " latte with "
            + coffeeOption + " and made with " + milkOption + " with " + toppingOption
             + " and " + whippedCreamOption;}


    // Getters

    public void getRandomHotIcedOrBlended() {
        Random randomHotIcedBlended = new Random();
        int hotIcedBlendedNum = randomHotIcedBlended.nextInt(hotIcedBlendedList.size());
        String hotIcedOrBlended = hotIcedBlendedList.get(hotIcedBlendedNum);
        setHotIcedOrBlended(hotIcedOrBlended);
    }

    public String getHotIcedBlended(){ return hotIcedOrBlendedOption; }

    public void getRandomFlavour() {
        Random randomFlavour = new Random();
        int flavourNum = randomFlavour.nextInt(flavourList.size());
        String flavour = flavourList.get(flavourNum);
        setFlavour(flavour);
    }

    public String getFlavour(){ return flavourOption; }

    public void getRandomCoffeeOrNoCoffee() {
        Random randomCoffee = new Random();
        int coffeeOrNum = randomCoffee.nextInt(coffeeList.size());
        String coffeeOrNone = coffeeList.get(coffeeOrNum);
        setCoffeeOrNoCoffee(coffeeOrNone);
    }

    public String getCoffeeOrNoCoffee(){ return coffeeOption; }

    public void getRandomMilk() {
        Random randomMilk = new Random();
        int milkNum = randomMilk.nextInt(milkList.size());
        String milk = milkList.get(milkNum);
        setMilk(milk);
    }

    public String getMilk(){ return milkOption; }

    public void getRandomTopping() {
        Random randomTopping = new Random();
        int toppingNum = randomTopping.nextInt(toppingList.size());
        String topping = toppingList.get(toppingNum);
        setTopping(topping);
    }

    public String getTopping(){ return toppingOption; }

    public void getRandomWhip() {
        Random randomWhip = new Random();
        int whipOrNoneNum = randomWhip.nextInt(whipCreamList.size());
        String whippedCream = whipCreamList.get(whipOrNoneNum);
        setWhip(whippedCream);
    }

    public String getWhip(){ return whippedCreamOption; }

    // Setters

    public void setHotIcedOrBlended(String h) { hotIcedOrBlendedOption = h; }

    public void setFlavour(String f) { flavourOption = f; }

    public void setCoffeeOrNoCoffee(String c) { coffeeOption = c; }

    public void setMilk(String m) { milkOption = m; }

    public void setTopping(String t) { toppingOption = t; }

    public void setWhip(String w) { whippedCreamOption = w; }
}