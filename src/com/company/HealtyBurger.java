package com.company;

import java.util.Scanner;

public class HealtyBurger extends Hamburgers {

    Scanner scanner = new Scanner(System.in);

    public HealtyBurger(boolean isMeatRequired) {
        super("HealthyBurger", isMeatRequired);
    }

    private double cornPrice = 20.00;
    private double capsicumPrice = 20.00;
    private int previousSelection = 0;
    private double totalHealtyBurgerPrice = 0.0;

    public void priceCalculation() {
        int selectedMenuOption = 0;
        selectedMenuOption = displayMenu();
        if (selectedMenuOption != 0) {
            calculateAddOn(selectedMenuOption);
        }
        scanner.nextLine();
        System.out.println("Do you like to add another add on");
        if (scanner.nextLine().equalsIgnoreCase("yes") ? true : false) {
            selectedMenuOption = displayMenu();
            if (selectedMenuOption != 0) {
                calculateAddOn(selectedMenuOption);
            }
        }
        System.out.println("Your Final price is " + this.totalHealtyBurgerPrice);
    }

    public int displayMenu() {
        System.out.println("Thanks for choosing healty burger " +
                "\nWould you like any add one from following menu " +
                "\n 1. Tomato " +
                "\n 2. Cheese " +
                "\n 3. Carrot" +
                "\n 4. Onion " +
                "\n 5. Corn " +
                "\n 6. Capsicum");
        int selection = scanner.nextInt();
        if (selection == this.previousSelection) {
            System.out.println("Option is already selected.");
            return 0;
        } else {
            this.previousSelection = selection;
            return selection;
        }
    }

    public void calculateAddOn(int addOn) {
        switch (addOn) {
            case 1:
                this.baseBurgerFinalPrice(this.getTomatoPrice());
                this.totalHealtyBurgerPrice += this.getBasePrice();
                break;

            case 2:
                this.baseBurgerFinalPrice(this.getCheesePrice());
                this.totalHealtyBurgerPrice += this.getBasePrice();
                break;
            case 3:
                this.baseBurgerFinalPrice(this.getCarrotPrice());
                this.totalHealtyBurgerPrice += this.getBasePrice();
                break;
            case 4:
                this.baseBurgerFinalPrice(this.getOnionPrice());
                this.totalHealtyBurgerPrice += this.getBasePrice();
                break;
            case 5:
                this.totalHealtyBurgerPrice += (this.getBasePrice() + this.cornPrice);
                break;
            case 6:
                this.totalHealtyBurgerPrice += (this.getBasePrice() + this.capsicumPrice);
                break;
        }
    }

}