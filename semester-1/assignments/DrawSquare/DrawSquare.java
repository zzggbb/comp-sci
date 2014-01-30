/**
 *  DrawSquare: This class will create a piece of paper and a pencil,
 *  place the pencil on the paper, and then draw a square.
 *
 *  Modified by Jason Quesenberry and Nancy Quesenberry Nov. 5, 2005.
 *
 * @author     G. Peck
 * @created    March 23, 2002
 */

import apcslib.*;
import java.awt.Color;

public class DrawSquare{

 	private DrawingTool pencil;
    private SketchPad paper;


	// Basic constructor for DrawSquare. Instantiates paper and pencil to basic values.

	public DrawSquare(){
		paper = new SketchPad(1000, 1000);
	    pencil = new DrawingTool(paper);
	}

   	//	The draw method for the DrawSquare class.
    //  This method will run all of the commands necessary to draw the square.

  	public void draw(){
  		
  		//frame of house
  		pencil.move(0,0);
  		pencil.down();
  		pencil.move(250,0);
  		pencil.move(250,150);
  		pencil.move(0,300);
  		pencil.move(-250,150);
  		pencil.move(-250,0);
  		pencil.move(0,0);
  		pencil.up();
  		pencil.move(250,150);
  		pencil.down();
  		pencil.move(-250,150);
  		pencil.up();
  		pencil.move(0,0);
  		pencil.down();
  		
  		//door
  		pencil.setColor(Color.blue);
  		pencil.setWidth(10);
  		pencil.move(50,0);
  		pencil.move(50,100);
  		pencil.move(-50,100);
  		pencil.move(-50,0);
  		pencil.move(0,0);
  		
  		//windows
  		pencil.up();
  		pencil.move(150,80);
  		pencil.down();
  		pencil.drawCircle(30);
  		pencil.up();
  		pencil.move(-150,80);
  		pencil.down();
  		pencil.drawCircle(30);
  		pencil.up();
  		
  		//extra
  		pencil.move(-45,120);
  		pencil.down();
  		pencil.setColor(Color.black);
  		pencil.drawString("This is a house");


  	}
}
