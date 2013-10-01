/* Name: 			Zane Bradley
 * Program File: 	RandomFunTester
 * Purpose: 		Draw a house, square, or circle depending on a random roll
 */

import java.util.Random;

public class RandomFunTester {

	public static void main(String args[]){

		Random r = new Random();

		int choice = r.nextInt(3) + 1; 		// 1,2,3
		int radius = r.nextInt(31) + 20;	// 20...50
		//System.out.println(radius); 		// debug

		switch (choice) {
			case 1:
				// Draw a house
				DrawHouse house = new DrawHouse();
				house.draw();
				break;
			case 2:
				// Draw a square
				DrawSquare square = new DrawSquare();
				square.draw();
				break;
			case 3:
				// Draw some circles
				DrawCircles circles = new DrawCircles(radius);
				circles.draw();
				break;
			default:
				System.out.println("This is an unreachable error message...");

		}
	}
}