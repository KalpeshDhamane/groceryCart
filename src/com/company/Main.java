package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welocome to Bills Burgers \n " +
                "Please select option from below menu \n " +
                "1.Healty Burger \n " +
                "2.Delux Burger");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Is meat required?");
        boolean isMeatRequired = scanner.nextLine().equalsIgnoreCase("yes") ? true : false;
        HealtyBurger healtyBurger = null;
        DeluxeBurger deluxeBurger = null;
        switch (count) {
            case 1:
                healtyBurger = new HealtyBurger(isMeatRequired);
                break;
            case 2:
                deluxeBurger = new DeluxeBurger(isMeatRequired);
                break;
        }
        if (healtyBurger != null) {
            healtyBurger.priceCalculation();
        } else if (deluxeBurger != null) {
            deluxeBurger.priceCalculation();
        }
    }
}
