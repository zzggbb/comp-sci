import info.gridworld.actor.*;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class BreederRunner {

 final static int BREEDER_COUNT = 10;
 final static int ROCK_COUNT = 3;

 public static void main(String[] args){
  ActorWorld world = new ActorWorld();

  for (int i = 0; i<10; i++) {
  Breeder x = new Breeder();
  world.add(x);
  }

  
  world.show(); 
 }
}
