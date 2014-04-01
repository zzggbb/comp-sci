/* Name: Zane Bradley
 * File: 
 * Desc: 
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
			if(getGrid().isValid(side) && getGrid().get(side) == null){
				Location sideSide = side.getAdjacentLocation(cDir);
				if(getGrid().isValid(sideSide) &&  getGrid().get(sideSide) == null){
					locs.add(sideSide);
				}
			}
		}
		locs.add(getLocation());
		return locs;
	}
}
