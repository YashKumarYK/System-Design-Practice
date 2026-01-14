package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Projectable;

public class CanProject implements Projectable {
    @Override
    public void project() {
        System.out.println("Can project");
    }
}
