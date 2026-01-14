package org.SystemDesign;

import org.SystemDesign.StrategyConcreteClass.*;

public class Main {
    static void main() {
        Robot robot = new Robot(
                new CannotWalk(),
                new CanTalk(),
                new CanFlyable(),
                new CannotProject()
        );

        robot.talk();
        robot.walk();
        robot.fly();
        robot.project();
    }
}
