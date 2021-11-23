package com.example.coffeedrinkgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Drink {

    private String coffeeOption;
    private String hotIcedOrBlendedOption;
    private String milkOption;
    private String whippedCreamOption;
    private String flavourOption;
    private String toppingOption;

    private final static List<String> flavourList = Arrays.asList("White Mocha", "Mocha", "Vanilla", "Sf Vanilla",
            "Caramel", "Chai", "Hazelnut", "Pumpkin Spice");

    private final static List<String> toppingList = Arrays.asList("Caramel Drizzle", "Mocha Drizzle",
            "Cinnamon Powder", "Cinnamon Sugar", "Nutmeg", "Pumpkin Spice");

    private final static List<String> milkList = Arrays.asList("1%", "2%", "Nonfat Milk","Whole Milk", "Heavy Cream",
            "Breve", "Almond Milk", "Coconut Milk", "Oat Milk", "Soy Milk");

    private final static List<String> whipCreamList = Arrays.asList("add Whip", "no Whip");

    private final static List<String> hotIcedBlendedList = Arrays.asList("Hot", "Iced", "Blended");

    private final static List<String> coffeeList = Arrays.asList("Coffee", "No Coffee");

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
        randDrink.setRandomTopping();
        randDrink.setRandomFlavour();
        randDrink.setRandomMilk();
        randDrink.setRandomWhip();
        randDrink.setRandomHotIcedOrBlended();
        randDrink.setRandomCoffeeOrNoCoffee();
        return randDrink;
    }

//    public List <String> finalGenDrink(){
//        List<String> finalDrinkList = new ArrayList<>();
//        finalDrinkList.add(coffeeOption);
//        finalDrinkList.add(flavourOption);
//        finalDrinkList.add(toppingOption);
//        finalDrinkList.add(milkOption);
//        finalDrinkList.add(hotIcedOrBlendedOption);
//        finalDrinkList.add(whippedCreamOption);
//        return finalDrinkList;
//    }

    public void setRandomTopping() {
        Random randomTopping = new Random();
        int toppingNum = randomTopping.nextInt(toppingList.size());
        String topping = toppingList.get(toppingNum);
        setTopping(topping);
    }

    public void setTopping(String t) {
        toppingOption = t;
    }

    public String getTopping() {
        return toppingOption;
    }

    public void setRandomFlavour() {
        Random randomFlavour = new Random();
        int flavourNum = randomFlavour.nextInt(flavourList.size());
        String flavour = flavourList.get(flavourNum);
        setFlavour(flavour);
    }

    public void setFlavour(String f) {
        flavourOption = f;
    }

    public String getFlavour() {
        return flavourOption;
    }

    public void setRandomMilk() {
        Random randomMilk = new Random();
        int milkNum = randomMilk.nextInt(milkList.size());
        String milk = milkList.get(milkNum);
        setMilk(milk);
    }

    public void setMilk(String m) {
        milkOption = m;
    }

    public String getMilk() {
        return milkOption;
    }


    public void setRandomWhip() {
        Random randomWhip = new Random();
        int whipOrNoneNum = randomWhip.nextInt(whipCreamList.size());
        String whippedCream = whipCreamList.get(whipOrNoneNum);
        setWhip(whippedCream);
    }

    public void setWhip(String w) {
        whippedCreamOption = w;
    }

    public String getWhip() {
        return whippedCreamOption;
    }


    public void setRandomHotIcedOrBlended() {
        Random randomHotIcedBlended = new Random();
        int hotIcedBlendedNum = randomHotIcedBlended.nextInt(hotIcedBlendedList.size());
        String hotIcedOrBlended = hotIcedBlendedList.get(hotIcedBlendedNum);
        setHotIcedOrBlended(hotIcedOrBlended);
    }

    public void setHotIcedOrBlended(String HIB) {
        hotIcedOrBlendedOption = HIB;
    }

    public String getHotIcedOrBlended() {
        return hotIcedOrBlendedOption;
    }

    public void setRandomCoffeeOrNoCoffee() {
        Random randomCoffee = new Random();
        int coffeeOrNum = randomCoffee.nextInt(coffeeList.size());
        String coffeeOrNone = coffeeList.get(coffeeOrNum);
        setCoffeeOrNoCoffee(coffeeOrNone);
    }

    public void setCoffeeOrNoCoffee(String CON) {
        coffeeOption = CON;
    }

    public String getCoffeeOrNoCoffee() {
        return coffeeOption;
    }
}


