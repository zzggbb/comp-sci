/* Name: Zane Bradley
 * File: ChameleonKid
 * Desc: A ChameleonKid only processes the actors immediately in front and
 *       behind it. It then chooses the first possible neighbor and 
 *       changes its own color to the color of the chosen neighbor. 
 *
 */

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
	
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> neighbors = new ArrayList<Actor>();
		
		int[] dirs = {0,180};
		for (int dir : dirs){
			// append the thing in front and the thing behind
			Location loc = getLocation().getAdjacentLocation(getDirection()-dir);
			if (getGrid().isValid(loc)){
				Actor a = getGrid().get(loc);
				if (a != null){
					neighbors.add(a);
				}
			}
		}
		return neighbors;	
	}
	public void processActors(ArrayList<Actor> actors){
		int n = actors.size();
		if (n==0){
			super.darken(10);
		} else {
			setColor(actors.get(0).getColor());
		}
	}
}
