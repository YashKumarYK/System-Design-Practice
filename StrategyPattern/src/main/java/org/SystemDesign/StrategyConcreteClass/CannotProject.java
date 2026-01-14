package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Projectable;

public class CannotProject implements Projectable {
    @Override
    public void project() {
        System.out.println("Cannot Project");
    }
}
