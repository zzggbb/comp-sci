// Name: 
import info.gridworld.actor.Actor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class Breeder extends Actor {
	    private int age; 
	    private final int DEATH;
	   
	    /**
	     * Constructs a box bug that traces a square of a given side length
	     * @param length the side length
	     */
	    public Breeder()
	    {
	    	DEATH = 2;
	        age = 0;   
	    }
	    public int getAge(){
	    	return age;
	    }
	    public void turn()
	    {
	        setDirection(getDirection() + Location.HALF_LEFT);
	    }
	    public void move()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (gr.isValid(next))
	            moveTo(next);
	        else
	            removeSelfFromGrid();
	    }
	    public boolean canMove()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return false;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (!gr.isValid(next))
	            return false;
	        Actor neighbor = gr.get(next);
	        return (neighbor == null);
	        // ok to move into empty location or onto flower
	        // not ok to move onto any other actor
	    }	
	    
	    public boolean breederInFront() {
			Location front = getLocation().getAdjacentLocation(getDirection());
			if (getGrid().get(front) instanceof Breeder)
				return true;
			return false;
		}
	    
	 // Breeder can breed if its age is between 5 and 15
		public boolean canBreed(){
			Grid<Actor> gr = getGrid();
			// false if Grid does not exist
	        if (gr == null)
	            return false;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        // false if next location is not in Grid
	        if (!gr.isValid(next))
	            return false;
	        // true if in breeding age range
			if (breederInFront() && age >= 5 && age <= 15)
				return true;
			return false;
		}
		
		
		// add new Breeders in empty adjacent spaces when breeding
		public void breed(){
			ArrayList<Breeder> babies = new ArrayList<Breeder>();
			// ArrayList of places to put new Breeders
			ArrayList<Location> places = getGrid().getEmptyAdjacentLocations(getLocation());
			// make new Breeders facing the same direction
		    for (int i = 0; i < places.size(); i++){
		    	babies.add(new Breeder());
				setDirection(getDirection());
				babies.get(i).putSelfInGrid(getGrid(),places.get(i));
			}
		}
		
		

		public boolean doFight(){
			Grid<Actor> gr = getGrid();
			if (gr== null)
				return false;
			Location loc = getLocation();
			Location next = loc.getAdjacentLocation(getDirection());
			if(!gr.isValid(next))
				return false;
			if(breederInFront() && age<5)
				return true;
			return false;
		}
	
		
		public void Fight(){
			
			 Location loc = getLocation();
		        Location next = loc.getAdjacentLocation(getDirection());
		        if(( (Breeder) (getGrid().get(next))).getAge()> age){
		        	removeSelfFromGrid();
		        
		        			
		        }
		 //       else  if(((Breeder) getGrid().get(next)).getAge()< age)
		   //     	getGrid().remove(next);
		        	
	
		}
		
		
	    public void act()
	    {
	    	if(canBreed()){
	    		breed();
	    		
	    	}
	    	if(doFight()){
	    		Fight();
	    		System.out.println("killing baby");
	    	}
	    	
	        if (canMove()){
	            move();
	            changeColor();
	            age++;
	            //Death process
	            int deathLimit = 20;
	            Random rand = new Random();
	            int checkDeath = rand.nextInt(deathLimit) + 1;
	            	if(checkDeath == DEATH){
	            		removeSelfFromGrid();
	            		System.out.println("Bug died at " + age + ".");
	            	}
	            	else if(deathLimit < 0){
	            		removeSelfFromGrid();
	            		System.out.println("Bug died at " + age + ".");
	            	}
	            	else
	            		deathLimit--; 
	           //If two babies are facing each other
	           
	               
	            	   
	        }
	        
	        else
	            turn();	 
	    }
	    public void changeColor(){
	    	if(age > 3){
	    		setColor(Color.RED);
	    	}
	    	if(age > 15){
	    		setColor(Color.CYAN);
	    	}
	    }
	    public void fight(){
	    	if(getGrid().get(getLocation().getAdjacentLocation(getDirection())) != null ) {
	    		
	    		System.out.println("valid");
	   }
	   }
	    
	    

}
