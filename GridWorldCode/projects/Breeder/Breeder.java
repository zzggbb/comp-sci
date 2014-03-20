import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.awt.Color;
import java.util.Random;

public class Breeder extends Actor {
  
 //private Grid<Actor> grid;
   //private Location location;
   private int age;
   private int deathChance;
   private Random rand;
   private boolean isAlive;
 
    private final int CHILD = 5;
 private final int MIDDLE = 15;

 public Breeder() {
        //super();
        //grid = getGrid();
        setColor(Color.BLUE);
    age = 0;
        deathChance = 0;
        rand = new Random();
        isAlive = true;
   }
 public Location getInFront(){
  return getLocation().getAdjacentLocation(getDirection());
 }
     /*
    public Location getAdjacentLocation(){
        return getLocation().getAdjacentLocation();
    }
    */

   public void act() {
     maybeDie();
     if (isAlive) {
     if (!canMove()) {
       if (getGrid().isValid(getInFront())) {
        Object thingInFront = getGrid().get(getInFront());
    if (thingInFront instanceof Breeder){
        Breeder breederInFront = (Breeder) thingInFront;
        if (getAge() > MIDDLE){
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
        
            turn();
        }
       } else {
         turn();
        
     } 
     }else {
    // nothing is in front of us
    move(); 
     }
     ageColor();
     age++;
     if (age <= CHILD) {
         deathChance = 5;
     } else if (age <= MIDDLE) {
       deathChance = 10;
     } else {
       deathChance = 15;
     }
   }
   }
     public void turn(){
        setDirection(getDirection()-45);
     }

   public void eat(){
  Breeder victim = (Breeder) getGrid().get(getInFront());
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
                setColor(Color.CYAN);
    return;
    }
    setColor(Color.RED);
    return;
    }
     }
   public void maybeDie() {
     if (rand.nextInt(99) < deathChance) {
        removeSelfFromGrid();
        isAlive = false;
  }
     
     }
   public boolean canMove() {
  Grid<Actor> gr = getGrid();
        if (gr == null){
    System.out.println("grid is null");
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)){
    System.out.println("next space isn't valid");
            return false;
        }
        Actor neighbor = gr.get(next);
        return (neighbor == null);
   }
   public void move() {
    if (getGrid() == null){
   System.out.println("grid is null"); 
   return;
  }
  Location next = getInFront();
  if (getGrid().isValid(next)){
   moveTo(next);
  } else {
   removeSelfFromGrid();
  }
   }
} 