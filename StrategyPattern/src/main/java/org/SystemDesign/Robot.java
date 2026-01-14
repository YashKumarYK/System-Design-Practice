package org.SystemDesign;

import org.SystemDesign.Strategies.Flyable;
import org.SystemDesign.Strategies.Projectable;
import org.SystemDesign.Strategies.Talkable;
import org.SystemDesign.Strategies.Walkable;

public class Robot {
    public Walkable walkable;
    public Talkable talkable;
    public Flyable flyable;
    public Projectable projectable;

    Robot(Walkable walkable, Talkable talkable, Flyable flyable, Projectable projectable){
        this.walkable = walkable;
        this.talkable = talkable;
        this.flyable = flyable;
        this.projectable=projectable;
    }

    void walk(){
        walkable.walk();
    }

    void fly(){
        flyable.fly();
    }

    void talk(){
        talkable.talk();
    }

    void project(){
        projectable.project();
    }

}
