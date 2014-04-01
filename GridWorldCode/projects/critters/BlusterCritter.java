/*
 * Name:  Zane Bradley
 * File:  BlusterCritter.java
 * Desc:  A BlusterCritter is instantiated with a `c` value which
 *        represents its courage. A BlusterCritter checks the 
 *        number of actors within 2 spaces, and will "blush" if the 
 *        there are less actors than the "courage" value.
 */

import java.util.ArrayList;
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter {
	
    private int c;

    public BlusterCritter(int courage){
        super();
	   c = courage;
    }
	
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> neighbors = new ArrayList<Actor>();
	   Location center = getLocation();
	   int cX = center.getRow();
	   int cY = center.getCol();
	   for (int x=cX-2 ; x<cX+3 ; x++){
	       for (int y=cY-2 ; y<cY+3 ; y++){
		      Location cLoc = new Location(x,y);
			 if(getGrid().isValid(cLoc) && !(cLoc.equals(center))){
			     neighbors.add(getGrid().get(cLoc));
			 }
		  } 
	   }
	   return neighbors;
    }
    public void darken(double deltaRGB){
	   Color c = getColor();
	   int[] colors = {
            (int)(c.getRed()+deltaRGB),
            (int)(c.getGreen()+deltaRGB),
            (int)(c.getBlue()+deltaRGB)
        }
	   for (int i=0; i<colors.length(); i++){
            if (colors[i] < 0){
                colors[i] = 0;
            } else if(colors[i] > 255 {
                colors[i] = 255;
            }
        }
	   setColor(new Color(colors[0],colors[1],color[2]));
	   System.out.println("Changed color");	
    }

    public void processActors(ArrayList<Actor> actors){
        int deltaRGB = ((actors.size()<c)?1:-1)*10;	
        darken(deltaRGB);
    }
}
