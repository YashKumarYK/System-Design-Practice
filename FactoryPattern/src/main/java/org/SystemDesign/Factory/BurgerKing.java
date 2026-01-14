package org.SystemDesign.Factory;

import org.SystemDesign.Interface.Burger;
import org.SystemDesign.Interface.GarlicBread;
import org.SystemDesign.Product.WheatBurger;
import org.SystemDesign.Product.WheatCheeseBurger;
import org.SystemDesign.Product.WheatCheeseGarlicBread;
import org.SystemDesign.Product.WheatGarlicBread;

public class BurgerKing implements MealFactory{
    @Override
    public Burger createBurger(String type) {
        if(type.equals("Normal")){
            return new WheatBurger();
        }
        if(type.equals("Cheese")){
            return new WheatCheeseBurger();
        }
        return null;
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if(type.equals("Normal")){
            return new WheatGarlicBread();
        }
        if(type.equals("Cheese")){
            return new WheatCheeseGarlicBread();
        }
        return null;
    }
}
