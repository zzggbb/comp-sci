/* Name: 			Zane Bradley
 * Program File: 	ParallelLines.java
 * Purpose: 		Provide the constructor and draw() method for the ParallelLinesDriver class.
 */

import apcslib.*;
import java.awt.Color;

public class ParallelLines {

	int[] config = {
        20,    // Square separation
        10,    // Wiggle length multiplier
        20,    // Length of a side of a square
        10,    // Amount of rows
        10,    // Amount of columns
        500,   // Width of canvas
        500    // Height of canvas
    };
    // pattern that the `wiggle` will follow

	int[] offsets = {0,1,0,-1};
    
    /*
        calculate the distance to move from the left edge *each* time 
        we draw something
	*/
    int xOffset = (config[2]*(config[4]-2)+config[4]*config[0])/2;

    /*
        calculate the distance to move from the top edge *each* time 
        we draw something
    */
	int yOffset = config[2]*(config[3]-2)/2;

	private SketchPad paper;
	private DrawingTool pen;

	public ParallelLines(){
		pen = new DrawingTool(new SketchPad(config[5],config[6]));
	}

	public void draw(){
		for (int row = 0; row < config[3]; row++){
			for (int col = 0; col < config[4]; col++){
				pen.up();
                /*
                    calculate cyclical value so that the wiggle can 
                    continuously loop through the `offsets` array
                */
                int modrow = row%offsets.length;
                int wiggle = offsets[modrow]*config[1];
                int x = (col*(config[0]+config[2])-xOffset) + wiggle;
                int y = row*config[2]-yOffset;
                pen.move(x,y);
				pen.down();
				pen.setColor(Color.black);
				pen.fillRect(config[2],config[2]);
			}
            // calculate coordinates for drawing 
			int yAlg = (config[2]*(2*row-1) - 2*yOffset) / 2;
			pen.up();
			pen.move(-xOffset-config[2],yAlg);
			pen.down();
			pen.move(xOffset+config[2],yAlg);
		}
	}
}
