/* Name: Zane Bradley
 * File: RockHound.java 
 * Desc: A RockHound processes actors by looping through the
 *       provided list of Actors and removing any actor that
 *       is a Rock.
 *
 */

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors){
		    // remove `a` if it is a Rock	
              if(a instanceof Rock){
				a.removeSelfFromGrid();
			}
		}	
	}
}
