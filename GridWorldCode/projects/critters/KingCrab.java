/* Name: Zane Bradley
 * File: KingCrab.java 
 * Desc: A KingCrab processes actors by moving them one space in 
 *       the direction relative to the KingCrab. If the actor 
 *       cannot be moved away it is destroyed by the King Crab.
 *
 */

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors){
			
			Location loc = a.getLocation();
			int sendDirection = getLocation().getDirectionToward(loc);
			Location newLoc = loc.getAdjacentLocation(sendDirection);
			// send each actor in actors to the new location, so long as the
               // location is empty and is valid
			if (getGrid().isValid(newLoc) && getGrid().get(newLoc) == null){
				a.moveTo(newLoc);
			} else {
				a.removeSelfFromGrid();
			}
		}
	}
}
