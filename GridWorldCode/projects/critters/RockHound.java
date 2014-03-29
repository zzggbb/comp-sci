import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors){
			if(a instanceof Rock){
				a.removeSelfFromGrid();
			}
		}	
	}
}
