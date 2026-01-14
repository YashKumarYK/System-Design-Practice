package org.SystemDesign.Product;

import org.SystemDesign.Interface.Burger;

public class NormalBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a burger with simple veggies and patty");
    }
}
