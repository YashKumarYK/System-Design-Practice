package org.SystemDesign.Product;

import org.SystemDesign.Interface.GarlicBread;

public class WheatGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing a wheat Garlic Bread");
    }
}
