package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Flyable;

public class CanFlyable implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
