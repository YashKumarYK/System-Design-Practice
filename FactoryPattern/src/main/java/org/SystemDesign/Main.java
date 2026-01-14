package org.SystemDesign;

import org.SystemDesign.Factory.BurgerKing;
import org.SystemDesign.Factory.MealFactory;
import org.SystemDesign.Interface.Burger;
import org.SystemDesign.Interface.GarlicBread;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String burgerType = "Normal";
        String garlicBreadType = "Cheese";

        MealFactory factory = new BurgerKing();

        Burger burger = factory.createBurger(burgerType);
        GarlicBread garlicBread = factory.createGarlicBread(garlicBreadType);

        burger.prepare();
        garlicBread.prepare();
    }
}
