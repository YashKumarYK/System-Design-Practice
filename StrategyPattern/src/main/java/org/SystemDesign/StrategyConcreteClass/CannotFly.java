package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Flyable;

public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("CannotFly");
    }
}
