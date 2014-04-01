/* Name: Zane Bradley
 * File: ChameleonCritter.java 
 * Desc: A ChameleonCritter randomly selects one of its
 *       neighbors and becomes the same color as it. If
 *       it has no neighbors, it darkens.
 *
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class ChameleonCritter extends Critter {
    /*
     * Randomly selects a neighbor and changes this critter's 
	 * color to be the same as that neighbor's. If there are 
	 * no neighbors, the ChameleonCritter darkens
     */
    public void processActors(ArrayList<Actor> actors) {
        int n = actors.size();
        // darken if there are no actors around us
        if (n == 0) {
			darken(10);
	   } else {
		  int r = (int) (Math.random() * n);
        Actor other = actors.get(r);
        setColor(other.getColor());
    	   }
	}
	public void darken(double deltaRGB){
		Color c = getColor();
		setColor(new Color(
			(int)(c.getRed() + deltaRGB),
			(int)(c.getGreen() + deltaRGB),
			(int)(c.getBlue() + deltaRGB)
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
