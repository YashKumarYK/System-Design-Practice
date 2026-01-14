package org.SystemDesign.Factory;

import org.SystemDesign.Interface.Burger;
import org.SystemDesign.Interface.GarlicBread;
import org.SystemDesign.Product.CheeseBurger;
import org.SystemDesign.Product.CheeseGarlicBread;
import org.SystemDesign.Product.NormalBurger;
import org.SystemDesign.Product.NormalGarlicBread;

public class BurgerSingh implements MealFactory{
    @Override
    public Burger createBurger(String type) {
        if(type.equals("Normal")){
            return new NormalBurger();
        }
        if(type.equals("Cheese")){
            return new CheeseBurger();
        }
        return null;
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if(type.equals("Normal")){
            return new NormalGarlicBread();
        }
        if(type.equals("Cheese")){
            return new CheeseGarlicBread();
        }
        return null;
    }
}
