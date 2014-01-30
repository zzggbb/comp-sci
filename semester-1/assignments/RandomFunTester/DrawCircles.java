/* Name: 			Zane Bradley
 * Program File: 	RandomFunTester
 * Purpose: 		Provide methods and constructors to draw circles, which will be used by
 * 					the RandomFunTester driver file.
 */

import apcslib.*;
import java.awt.Color;

public class DrawCircles {

	private DrawingTool pen;
	private SketchPad canvas;
	private int myRadius;

	public DrawCircles(int radius) {
		myRadius = radius;
		canvas = new SketchPad(500, 500);
		pen = new DrawingTool(canvas);
	}

	public void draw() {
		pen.move(0,0);
		pen.down();
		pen.setColor(Color.blue);
		pen.drawCircle(myRadius);
		pen.up();
		pen.move(-75,-75);
		pen.down();
		pen.setColor(Color.green);
		pen.drawCircle(myRadius);
		pen.up();
		pen.move(100,50);
		pen.down();
		pen.setColor(Color.red);
		pen.drawCircle(myRadius);
	}
}