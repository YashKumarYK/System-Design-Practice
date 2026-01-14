package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Walkable;

public class canWalk implements Walkable {

    @Override
    public void walk() {
        System.out.print("Can walk");
    }
}
