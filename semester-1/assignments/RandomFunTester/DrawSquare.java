/* Name: Zane Bradley
 * Program File: DrawSquare
 * Purpose: Provide methods and constructors to draw a square
 */

import apcslib.*;

public class DrawSquare{

	private DrawingTool pen;
	private SketchPad canvas;

	/**
	 *  Basic constructor for DrawSquare.
	 *  Instantiates canvas and pen to basic
	 *  values.
	 */
	public DrawSquare(){
		canvas = new SketchPad(500, 500);
		pen = new DrawingTool(canvas);
	}

	/**
	 *  The draw method for the DrawSquare class.
	 *  This method will run all of the
	 *  commands necessary to draw the square.
	 *
	 */

  	public void draw(){

		// draw the square
		pen.forward(100);
		pen.turnLeft(90);
		pen.forward(100);
		pen.turnLeft(90);
		pen.forward(100);
		pen.turnLeft(90);
		pen.forward(100);

	}
}
