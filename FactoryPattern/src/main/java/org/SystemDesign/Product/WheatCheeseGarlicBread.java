package org.SystemDesign.Product;

import org.SystemDesign.Interface.GarlicBread;

public class WheatCheeseGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing wheat Garlic Bread with Cheese !!");
    }
}
