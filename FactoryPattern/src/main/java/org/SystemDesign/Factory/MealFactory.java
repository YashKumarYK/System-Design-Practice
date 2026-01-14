package org.SystemDesign.Factory;

import org.SystemDesign.Interface.Burger;
import org.SystemDesign.Interface.GarlicBread;

public interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}
