package org.SystemDesign.Product;

import org.SystemDesign.Interface.Burger;

public class WheatCheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a wheat burger with cheese, veggies and Patty");
    }
}
