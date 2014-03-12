/* 
 * Name: Zane Bradley
 * File: FigureEightBugRunner.java
 *
 * create a world that contains a FigureEightBug
 *
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class FigureEightBugRunner {
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        FigureEightBug bug = new FigureEightBug(4);
        world.add(new Location(6,6), bug);
        world.show();
    }
}

