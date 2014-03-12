/*
 * Name: Zane Bradley
 * File: DancingBugRunner.java
 *
 * create a world that contains a FigureEightBug
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class DancingBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();


        int[] config = {3,4,1,8,3,5};
        DancingBug bug = new DancingBug(config);
        world.add(new Location(4,4),bug);
        world.show();
    }
}
