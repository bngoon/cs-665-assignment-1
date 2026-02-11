/**
 * Name: BOOKER NGOON
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2026
 * File Name: Main.java
 * Description: Demonstrates usage of the BeverageMachine by brewing
 * different beverages and printing their names and prices.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.BeverageMachine;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * Entry point for running the beverage machine demonstration.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {

    BeverageMachine machine = new BeverageMachine();

    Beverage espresso = machine.brewEspresso(1, 2);
    System.out.printf("%s costs $%.2f%n", espresso.getName(), espresso.getPrice());


    Beverage greenTea = machine.brewGreenTea(0, 0);
    System.out.println(greenTea.getName() + " costs $" + greenTea.getPrice());

    Beverage latte = machine.brewLatteMacchiato(2, 1);
    System.out.println(latte.getName() + " costs $" + latte.getPrice());
  }
}
