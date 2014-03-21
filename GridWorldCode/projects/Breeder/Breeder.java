import info.gridworld.grid.*;
import info.gridworld.actor.Actor;
import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;

public class Breeder extends Actor {

  private int age;
  private int deathChance;
  private Random rand;
  private boolean isAlive;
  private final int CHILD = 5;
  private final int MIDDLE = 15;

  public Breeder() {

    setColor(Color.BLUE);
    age = 0;
    deathChance = 0;
    rand = new Random();
    isAlive = true;
  }
  public Location getInFront(){
    return getLocation().getAdjacentLocation(getDirection());
  }

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
              }
            }
          } else {
            //there is something in front of us, it is not a breeder          
            turn();
          }
        } else { 
          turn();
        } 
      } else {
        // nothing is in front of us
        move(); 
      }
      breed();
      ageColor();
      age++;
      if (age <= 3) {
        deathChance = 3;
      } else if (age <= 15) {
        deathChance = 7;
      } else {
        deathChance = 10;
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
 
  public void breed() {
    if (getGrid().isValid(getInFront())) {
      if (getGrid().get(getInFront()) instanceof Breeder) {
        Breeder thingInFront = (Breeder)getGrid().get(getInFront());
        if (age > 5 && age <= 15 && (thingInFront.getAge()) > 5 && (thingInFront.getAge()) <= 15) {
          Breeder breederInFront = (Breeder) thingInFront;
          ArrayList childSpaces = getGrid().getValidAdjacentLocations(getLocation());
          for (int i = 0; i<childSpaces.size(); i++) {
            Actor child = new Breeder();
            child.putSelfInGrid(getGrid(), (Location) childSpaces.get(i));
            child.setDirection(getDirection());
          }
        }
      }
    }
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
    if (rand.nextInt(100) < deathChance) {
      System.out.println("Breeder at "+ getLocation() + " died at age " + age); 
      removeSelfFromGrid();
      isAlive = false;  
    }
  }
  
  public boolean canMove() {
    Grid<Actor> gr = getGrid();
    if (gr == null){
      //System.out.println("grid is null");
      return false;
    }
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    if (!gr.isValid(next)){
      //System.out.println("next space isn't valid");
      return false;
    }
    Actor neighbor = gr.get(next);
    return (neighbor == null);
  }

  public void move() {
    if (getGrid() == null){
      //System.out.println("grid is null"); 
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