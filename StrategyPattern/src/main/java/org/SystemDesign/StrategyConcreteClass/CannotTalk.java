package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Talkable;

public class CannotTalk implements Talkable {
    @Override
    public void talk() {
        System.out.println("Cannot Talk");
    }
}
