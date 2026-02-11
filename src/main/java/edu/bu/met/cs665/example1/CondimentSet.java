package edu.bu.met.cs665.example1;

/**
 * Represents a set of condiments that can be added to a beverage.
 * Enforces limits on milk and sugar units and calculates condiment cost.
 */

public class CondimentSet {
    private int milkUnits;
    private int sugarUnits;

    private static final int MAX_UNITS = 3;
    private static final double UNIT_PRICE = 0.50;

    /**
     * Adds milk units to the condiment set.
     *
     * @param units number of milk units to add
     * @throws IllegalArgumentException if maximum milk units are exceeded
     */

    public void addMilk(int units) {
        if (milkUnits + units > MAX_UNITS) {
            throw new IllegalArgumentException("Max milk units is 3");
        }
        milkUnits += units;
    }

    /**
     * Adds sugar units to the condiment set.
     *
     * @param units number of sugar units to add
     * @throws IllegalArgumentException if maximum sugar units are exceeded
     */

    public void addSugar(int units) {
        if (sugarUnits + units > MAX_UNITS) {
            throw new IllegalArgumentException("Max sugar units is 3");
        }
        sugarUnits += units;
    }

    /**
     * Calculates the total price of added condiments.
     *
     * @return total condiment price
     * */

    public double getPrice() {
        return (milkUnits + sugarUnits) * UNIT_PRICE;
    }
}
