package edu.bu.met.cs665.example1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the BeverageMachine class.
 */
public class BeverageMachineTest {

    /**
     * Tests brewing an Espresso with milk and sugar
     * and verifies the correct name and total price.
     */
    @Test
    public void testEspressoWithCondiments() {
        BeverageMachine machine = new BeverageMachine();
        Beverage drink = machine.brewEspresso(1, 2);

        assertEquals("Espresso", drink.getName());
        assertEquals(3.50, drink.getPrice(), 0.001);
    }

    /**
     * Tests that exceeding the maximum milk limit
     * throws an IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMaxMilkExceeded() {
        BeverageMachine machine = new BeverageMachine();
        machine.brewEspresso(4, 0);
    }

    /**
     * Tests brewing Green Tea without condiments
     * and verifies the correct name and base price.
     */
    @Test
    public void testTeaWithoutCondiments() {
        BeverageMachine machine = new BeverageMachine();
        Beverage drink = machine.brewGreenTea(0, 0);

        assertEquals("Green Tea", drink.getName());
        assertEquals(2.00, drink.getPrice(), 0.001);
    }
}
