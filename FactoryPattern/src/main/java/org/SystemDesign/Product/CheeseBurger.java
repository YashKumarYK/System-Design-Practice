package org.SystemDesign.Product;

import org.SystemDesign.Interface.Burger;

public class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a burger with Cheese, veggies and patty");
    }
}
