/* Name: Zane Bradley
 * File: QuickCrab.java 
 * Desc: A QuickCrab chooses between the Locations that are
 *       two spaces away. If the space between the QuickCrab
 *       and the possible space is occupied, then the 
 *       possible space is ignored.
 *
 */

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> locs = new ArrayList<Location>();
		int dir = getDirection();
		int[] dirs = {dir-90, dir+90};	
		for(int cDir : dirs) {
			Location side = getLocation().getAdjacentLocation(cDir);
			// check immediately to left and right.
               if(getGrid().isValid(side) && getGrid().get(side) == null){
				// check the spaces that are 2 units away.
                    Location sideSide = side.getAdjacentLocation(cDir);
				// add them if they are empty and are valid.
                    if(getGrid().isValid(sideSide) &&  getGrid().get(sideSide) == null){
					locs.add(sideSide);
				}
			}
		}
		return locs;
	}
}
