package com.company;

public class DeluxeBurger {

    public DeluxeBurger(boolean isMeatRequired) {
        Hamburgers hamburgers = new Hamburgers("DeluxeBurger", isMeatRequired);
        this.setDeluxeBurgerPrice(hamburgers.getBasePrice());
    }

    private double chipPrice = 50.00;
    private double drinkPrice = 50.00;
    private double deluxeBurgerPrice = 0.0;

    public void setDeluxeBurgerPrice(double basePrice) {
        this.deluxeBurgerPrice += (basePrice + this.chipPrice + this.drinkPrice);
    }

    public void priceCalculation() {
        System.out.println("Deluxe Burger Price is " + this.deluxeBurgerPrice);
    }

}
