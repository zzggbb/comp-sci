/* Name: Zane Bradley
 * Program File: RandomFunTester
 * Purpose: Draw a house, square or circle depending on a random roll of dice 
 * 
 */

import java.util.Random;

public class RandomFunTester {
	public static void main(String args[]){
		Random r = new Random();
		int choice = r.nextInt(3) + 1;
		int radius = r.nextInt()
		
		switch (choice) {
			case 1:
				//draw a house
				break;
			case 2: 
				//draw a square
				break;
			case 3:
				//draw a circle
				break;
				
		}
	}	
}