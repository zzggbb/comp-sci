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

	/*
	 *	. . . . . 
	 *	. . . . . 
	 *	. . $ . .  
	 *  . . . . .  
	 *  . . . . . 
	 */
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
		
		int red = (int)(c.getRed()*(1-deltaRGB));
		int grn = (int)(c.getGreen()*(1-deltaRGB));
		int blu = (int)(c.getBlue()*(1-deltaRGB));
		
		int redAdj = red<255?red:255;
		int grnAdj = grn<255?grn:255;
		int bluAdj = blu<255?blu:255;

		setColor(new Color(redAdj,grnAdj,bluAdj));
		System.out.println("Changed color");	
	}

	public void processActors(ArrayList<Actor> actors){
		darken(((actors.size()<c)?-1:1)*0.05);
	}
}
