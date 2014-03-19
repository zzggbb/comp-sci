import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class BreederRunner {

	final static int BREEDER_COUNT = 10;
	final static int ROCK_COUNT = 3;

	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
/*
		for (int i=0; i<BREEDER_COUNT; i++){
			world.add(new Breeder());
		}
		for (int i=0; i<ROCK_COUNT; i++){
			world.add(new Rock());
		}
*/
		Breeder x = new Breeder();
		world.add(new Rock());
		world.add(x);
		world.add(new Bug());
		world.show();	
	}
}

