package org.SystemDesign.Product;

import org.SystemDesign.Interface.Burger;

public class WheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a wheat burger with veggies and patty");
    }
}
