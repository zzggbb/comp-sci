import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class ChameleonCritter extends Critter {
    /*
     * Randomly selects a neighbor and changes this critter's 
	 * color to be the same as that neighbor's. If there are 
	 * no neighbors, no action is taken.
     */
    public void processActors(ArrayList<Actor> actors) {
        int n = actors.size();
        if (n == 0) {
			darken(0.05);
		} else {
			int r = (int) (Math.random() * n);
        	Actor other = actors.get(r);
        	setColor(other.getColor());
    	}
	}
	public void darken(double deltaRGB){
		Color c = getColor();
		setColor(new Color(
			(int)(c.getRed() * (1-deltaRGB)),
			(int)(c.getGreen() * (1-deltaRGB)),
			(int)(c.getBlue() * (1-deltaRGB))
		));
	}

    /*
     * Turns towards the new location as it moves.
     */
    public void makeMove(Location loc) {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
