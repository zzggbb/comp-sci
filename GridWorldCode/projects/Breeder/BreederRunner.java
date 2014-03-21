import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class BreederRunner {

	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
  		for (int i = 0; i<10; i++) {
  			Breeder x = new Breeder();
  			world.add(x);
  		}
  		world.show(); 
 	}
}
