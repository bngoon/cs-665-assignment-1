package edu.bu.met.cs665.example1;

/**
 * Represents the beverage vending machine responsible for brewing drinks.
 */
public class BeverageMachine {

    /**
     * Brews an Espresso with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Espresso beverage
     */
    public Beverage brewEspresso(int milk, int sugar) {
        Beverage drink = new Espresso();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }

    /**
     * Brews an Americano with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Americano beverage
     */
    public Beverage brewAmericano(int milk, int sugar) {
        Beverage drink = new Americano();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }

    /**
     * Brews a Latte Macchiato with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Latte Macchiato beverage
     */
    public Beverage brewLatteMacchiato(int milk, int sugar) {
        Beverage drink = new LatteMacchiato();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }

    /**
     * Brews a Black Tea with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Black Tea beverage
     */
    public Beverage brewBlackTea(int milk, int sugar) {
        Beverage drink = new BlackTea();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }

    /**
     * Brews a Green Tea with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Green Tea beverage
     */
    public Beverage brewGreenTea(int milk, int sugar) {
        Beverage drink = new GreenTea();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }

    /**
     * Brews a Yellow Tea with the specified milk and sugar units.
     *
     * @param milk number of milk units
     * @param sugar number of sugar units
     * @return brewed Yellow Tea beverage
     */
    public Beverage brewYellowTea(int milk, int sugar) {
        Beverage drink = new YellowTea();
        drink.addMilk(milk);
        drink.addSugar(sugar);
        return drink;
    }
}
