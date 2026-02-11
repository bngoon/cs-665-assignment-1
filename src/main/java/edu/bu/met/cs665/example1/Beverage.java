package edu.bu.met.cs665.example1;

/**
 * Abstract base class representing a beverage with optional condiments.
 * Provides shared behavior for all coffee and tea drinks.
 */
public abstract class Beverage {

    protected String name;
    protected double basePrice;
    protected CondimentSet condiments;

    /**
     * Constructs a beverage and initializes its condiment set.
     */
    public Beverage() {
        this.condiments = new CondimentSet();
    }

    /**
     * Adds milk units to the beverage.
     *
     * @param units number of milk units to add
     */
    public void addMilk(int units) {
        condiments.addMilk(units);
    }

    /**
     * Adds sugar units to the beverage.
     *
     * @param units number of sugar units to add
     */
    public void addSugar(int units) {
        condiments.addSugar(units);
    }

    /**
     * Returns the total price of the beverage including condiments.
     *
     * @return total calculated price
     */
    public double getPrice() {
        return basePrice + condiments.getPrice();
    }

    /**
     * Returns the name of the beverage.
     *
     * @return beverage name
     */
    public String getName() {
        return name;
    }
}
