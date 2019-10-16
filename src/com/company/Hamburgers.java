package com.company;

public class Hamburgers {

    private String breadType;
    private boolean isMeatRequired;

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public double getBasePrice(){
        return basePrice;
    }

    private double meatprice = 50.00;
    private double basePrice = 0.0;
    private double tomatoPrice = 20.00;
    private double cheesePrice = 30.00;
    private double carrotPrice = 15.00;
    private double onionPrice = 10.00;

    public Hamburgers(String breadType, boolean isMeatRequired) {
        if (breadType.equalsIgnoreCase("HealthyBurger")) {
            double healtyBurgerPrice = 100.00;
            if (isMeatRequired) {
                this.basePrice += (healtyBurgerPrice + this.meatprice);
            } else {
                this.basePrice = healtyBurgerPrice;
            }
        } else if (breadType.equalsIgnoreCase("DeluxeBurger")) {
            double deluxBurgerPrice = 120.00;
            if (isMeatRequired) {
                this.basePrice += (deluxBurgerPrice + this.meatprice);
            } else {
                this.basePrice = deluxBurgerPrice;
            }
        }
    }

    public void baseBurgerFinalPrice(double price) {
        this.basePrice += price;
    }

}
