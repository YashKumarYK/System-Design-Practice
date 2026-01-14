package org.SystemDesign.Product;

import org.SystemDesign.Interface.GarlicBread;

public class NormalGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing a normal Garlic Bread");
    }
}
