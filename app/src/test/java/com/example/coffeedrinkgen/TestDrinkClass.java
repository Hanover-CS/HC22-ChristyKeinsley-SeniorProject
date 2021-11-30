package com.example.coffeedrinkgen;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestDrinkClass {

    @Test
    public void testGetHotIcedBlended() {
        Drink testDrink = new Drink();
        testDrink.setHotIcedOrBlended("a hot");
        assertEquals("a hot", testDrink.getHotIcedBlended());
    }

    @Test
    public void testGetFlavour() {
        Drink testDrink = new Drink();
        testDrink.setFlavour("pumpkin spice");
        assertEquals("pumpkin spice", testDrink.getFlavour());
    }

    @Test
    public void testGetCoffee() {
        Drink testDrink = new Drink();
        testDrink.setCoffeeOrNoCoffee("coffee");
        assertEquals("coffee", testDrink.getCoffeeOrNoCoffee());
    }

    @Test
    public void testGetMilk() {
        Drink testDrink = new Drink();
        testDrink.setMilk("2%");
        assertEquals("2%", testDrink.getMilk());
    }

    @Test
    public void testGetTopping() {
        Drink testDrink = new Drink();
        testDrink.setTopping("cinnamon sugar");
        assertEquals("cinnamon sugar", testDrink.getTopping());
    }

    @Test
    public void testGetWhip() {
        Drink testDrink = new Drink();
        testDrink.setWhip("no whip");
        assertEquals("no whip", testDrink.getWhip());
    }

    @Test
    public void testDrink() {
        Drink testDrink = new Drink();
        testDrink.setHotIcedOrBlended("a blended");
        testDrink.setFlavour("hazelnut");
        testDrink.setCoffeeOrNoCoffee("no coffee");
        testDrink.setMilk("almond milk");
        testDrink.setTopping("caramel drizzle");
        testDrink.setWhip("no whip");

        assertEquals("a blended", testDrink.getHotIcedBlended());
        assertEquals("hazelnut", testDrink.getFlavour());
        assertEquals("no coffee", testDrink.getCoffeeOrNoCoffee());
        assertEquals("almond milk", testDrink.getMilk());
        assertEquals("caramel drizzle", testDrink.getTopping());
        assertEquals("no whip", testDrink.getWhip());
    }
}
