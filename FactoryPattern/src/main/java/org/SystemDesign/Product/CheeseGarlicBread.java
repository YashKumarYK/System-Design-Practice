package org.SystemDesign.Product;

import org.SystemDesign.Interface.GarlicBread;

public class CheeseGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Garlic Bread !!");
    }
}
