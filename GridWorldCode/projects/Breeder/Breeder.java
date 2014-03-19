import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.awt.Color;
import java.util.Random;

public class Breeder extends Actor {
  
	private Grid<Actor> grid;
  	//private Location location;
  	private int direction;
  	private int age;
  	private int deathChance;
  	private Random rand;
 
   	private final int CHILD = 6;
	private final int MIDDLE = 20;
	private final int ELDER = 30;

	public Breeder() {
    	//super();
		grid = getGrid();
		direction = 0;
        setColor(Color.BLUE);
		age = 0;
        deathChance = 0;
        rand = new Random();
  	}
	public Location getInFront(){
		return getLocation().getAdjacentLocation(getDirection());
	}

  	public void act() {
    	maybeDie();
    	if (!canMove()){
			Object thingInFront = grid.get(getInFront());
			if (thingInFront instanceof Breeder){
				Breeder breederInFront = (Breeder) thingInFront;
				if (getAge() >= ELDER){
					int potentialFoodAge = breederInFront.getAge();
					if (potentialFoodAge <= CHILD){
						setAge(getAge()-potentialFoodAge);					
						eat();
						// ATE A BREEDER
					} else {
						// breeder in front of us is too old
					}
				} else {
					// we are not old enough to eat a child
				}
			} else {
				//there is something in front of us, it is not a breeder
				setDirection(getDirection()-45);
			}
		} else {
			// nothing is in front of us
			move();	
		}
    	ageColor();
    	age++;
    	deathChance += 10;
  	}
  	public void eat(){
		Breeder victim = (Breeder) grid.get(getInFront());
		int age = victim.getAge();
		Location loc = victim.getLocation();
		System.out.println("Breeder at " + loc + " was eaten at age " + age);
		victim.removeSelfFromGrid();
	}
	public int getAge(){
    	return age;
  	}
	public void setAge(int n){
		age = n;
	}

  	public void ageColor() {
		if (age > CHILD){
			if (age > MIDDLE){
				if (age > ELDER){
					setColor(Color.YELLOW);
					return;
				}
				setColor(Color.GREEN);
				return;
			}
			setColor(Color.RED);
			return;
		}
  	}
  	public void maybeDie() {
    	if (rand.nextInt()*100 < deathChance) {
      		removeSelfFromGrid();
		}
    }
  	public int getDirection() {
    	return direction;
  	}
  	public void setDirection(int val) {
    	direction = val;
  	}
  	public boolean canMove() {
		Grid<Actor> gr = getGrid();
        if (gr == null)
			System.out.println("grid is null");
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
			System.out.println("next space isn't valid");
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null);
  	}
  	public void move() {
  		if (grid == null){
			System.out.println("grid is null"); 
			return;
		}
		Location next = getInFront();
		if (grid.isValid(next)){
			moveTo(next);
		} else {
			removeSelfFromGrid();
		}
  	}
} 
