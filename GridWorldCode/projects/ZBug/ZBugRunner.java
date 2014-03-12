/*
 * Name: Zane Bradley
 * File: ZBugRunner.java
 *
 * create a world that contains a ZBug
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner {
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        ZBug bug = new ZBug(5);
        world.add(new Location(3,3), bug);
        world.show();
    }
}
