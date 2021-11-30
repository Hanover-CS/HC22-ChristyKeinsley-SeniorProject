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

    private final static List<String> milkList = Arrays.asList("1%", "2%", "nonfat milk","whole milk", "heavy cream",
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

    public String toString(){ return "I would like " + hotIcedOrBlendedOption + " " + flavourOption + " with "
            + coffeeOption + " and made with " + milkOption + " with " + toppingOption
             + " and " + whippedCreamOption;}




    public void getRandomTopping() {
        Random randomTopping = new Random();
        int toppingNum = randomTopping.nextInt(toppingList.size());
        String topping = toppingList.get(toppingNum);
        setTopping(topping);
    }

    public void setTopping(String t) {
        toppingOption = t;
    }

//    public void getTopping() {
//        toppingOption = setRandomTopping();
//        //return toppingOption;
//    }
//
    public void getRandomFlavour() {
        Random randomFlavour = new Random();
        int flavourNum = randomFlavour.nextInt(flavourList.size());
        String flavour = flavourList.get(flavourNum);
        setFlavour(flavour);
    }

    public void setFlavour(String f) {
//        flavourOption = getFlavour();
        flavourOption = f;
    }

//    public String getFlavour() {
//        setRandomFlavour();
//        return flavourOption;
//    }
//
    public void getRandomMilk() {
        Random randomMilk = new Random();
        int milkNum = randomMilk.nextInt(milkList.size());
        String milk = milkList.get(milkNum);
        setMilk(milk);
    }

    public void setMilk(String m) {
        //milkOption = getMilk();
        milkOption = m;
    }

//    public String getMilk() {
//        setRandomMilk();
//        return milkOption;
//    }
//
    public void getRandomWhip() {
        Random randomWhip = new Random();
        int whipOrNoneNum = randomWhip.nextInt(whipCreamList.size());
        String whippedCream = whipCreamList.get(whipOrNoneNum);
        setWhip(whippedCream);
    }

    public void setWhip(String w) {
//        whippedCreamOption = getWhip();
        whippedCreamOption = w;
    }

//    public String getWhip() {
//        setRandomWhip();
//        return whippedCreamOption;
//    }
//
    public void getRandomHotIcedOrBlended() {
        Random randomHotIcedBlended = new Random();
        int hotIcedBlendedNum = randomHotIcedBlended.nextInt(hotIcedBlendedList.size());
        String hotIcedOrBlended = hotIcedBlendedList.get(hotIcedBlendedNum);
        setHotIcedOrBlended(hotIcedOrBlended);
    }

    public void setHotIcedOrBlended(String HIB) {
        //hotIcedOrBlendedOption = getHotIcedOrBlended();
        hotIcedOrBlendedOption = HIB;
    }
//
//    public String getHotIcedOrBlended() {
//        setRandomHotIcedOrBlended();
//        return hotIcedOrBlendedOption;
//    }
//
    public void getRandomCoffeeOrNoCoffee() {
        Random randomCoffee = new Random();
        int coffeeOrNum = randomCoffee.nextInt(coffeeList.size());
        String coffeeOrNone = coffeeList.get(coffeeOrNum);
        setCoffeeOrNoCoffee(coffeeOrNone);
    }

    public void setCoffeeOrNoCoffee(String CON) {
//        coffeeOption = getCoffeeOrNoCoffee();
        coffeeOption = CON;
    }
//
//    public String getCoffeeOrNoCoffee() {
//        setRandomCoffeeOrNoCoffee();
//        return coffeeOption;
//    }
}


