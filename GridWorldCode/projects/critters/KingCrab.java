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
			
			if (getGrid().isValid(newLoc) && getGrid().get(newLoc) == null){
				a.moveTo(newLoc);
			} else {
				a.removeSelfFromGrid();
			}
		}
	}
}
