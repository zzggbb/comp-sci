/* Name: Zane Bradley
 * Program File: DrawHouse
 * Purpose: provide methods and constructors to draw a house
 */

import apcslib.*;
import java.awt.Color;

public class DrawHouse{

	private DrawingTool pen;
	private SketchPad canvas;


	// Basic constructor for DrawHouse. Instantiates canvas and pen to basic values.

	public DrawHouse(){
		canvas = new SketchPad(1000, 1000);
		pen = new DrawingTool(canvas);
	}

		//	The draw method for the DrawHouse class.
		//	This method will run all of the commands necessary to draw the square.

		public void draw(){

			//frame of house
			pen.move(0,0);
			pen.down();
			pen.move(250,0);
			pen.move(250,150);
			pen.move(0,300);
			pen.move(-250,150);
			pen.move(-250,0);
			pen.move(0,0);
			pen.up();
			pen.move(250,150);
			pen.down();
			pen.move(-250,150);
			pen.up();
			pen.move(0,0);
			pen.down();

			//door
			pen.setColor(Color.blue);
			pen.setWidth(10);
			pen.move(50,0);
			pen.move(50,100);
			pen.move(-50,100);
			pen.move(-50,0);
			pen.move(0,0);

			//windows
			pen.up();
			pen.move(150,80);
			pen.down();
			pen.drawCircle(30);
			pen.up();
			pen.move(-150,80);
			pen.down();
			pen.drawCircle(30);
			pen.up();

			//extra
			pen.move(-45,120);
			pen.down();
			pen.setColor(Color.black);
			pen.drawString("This is a house");
	}
}
