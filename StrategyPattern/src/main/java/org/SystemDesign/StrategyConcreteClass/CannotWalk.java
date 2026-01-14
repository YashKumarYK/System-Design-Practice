package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Walkable;

public class CannotWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("Cannot walk");
    }
}
