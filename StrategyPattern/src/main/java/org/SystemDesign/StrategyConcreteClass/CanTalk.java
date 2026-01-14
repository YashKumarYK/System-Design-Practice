package org.SystemDesign.StrategyConcreteClass;

import org.SystemDesign.Strategies.Talkable;

public class CanTalk implements Talkable {
    @Override
    public void talk() {
        System.out.println("Can talk");
    }
}
