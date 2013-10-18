/* Name: 			Zane Bradley
 * Program File: 	ParallelLines.java
 * Purpose: 		Provide the constructor and draw() method for the ParallelLinesDriver class.
 */

import apcslib.*;
import java.awt.Color;

public class ParallelLines {

	//SQR_SEP,WIG_OFFSET,SQR_SIZE,ROWS,COLS,WIDTH,HEIGHT
	int[] config = {20,10,20,10,10,500,500};
	int[] offsets = {0,1,0,-1};
	int xOffset = (config[2]*(config[4]-2)+config[4]*config[0])/2;
	int yOffset = config[2]*(config[3]-2)/2;

	private SketchPad paper;
	private DrawingTool pen;

	public ParallelLines(){
		paper = new SketchPad(config[5],config[6]);
		pen = new DrawingTool(paper);
	}

	public void draw(){
		for (int row = 0; row < config[3]; row++){
			for (int col = 0; col < config[4]; col++){
				pen.up();
				pen.move((col*(config[0]+config[2])-xOffset)+offsets[row%(offsets.length)]*config[1],row*config[2]-yOffset);
				pen.down();
				pen.setColor(Color.black);
				pen.fillRect(config[2],config[2]);
			}
			int yAlg = (config[2]*(2*row-1)-2*yOffset)/2;
			pen.up();
			pen.move(-xOffset-config[2],yAlg);
			pen.down();
			pen.move(xOffset+config[2],yAlg);
		}
	}
}