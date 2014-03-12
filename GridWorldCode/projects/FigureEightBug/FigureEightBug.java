/* 
 * Name: Zane Bradley
 * File: FigureEightBug.java
 *
 * a FigureEightBug creates a horizontal figure-eight with side lengths of the
 * given constructor parameter
 *
 */

import info.gridworld.actor.Bug;

public class FigureEightBug extends CircleBug {
    private int sideLength, steps, turns, dir;
    
    /*
     * construct a new FigureEightBug that traces out a figure eight with side
     * lengths of the given side length
     */
    public FigureEightBug(int length){
        setDirection(90);
        steps=turns=0;
        dir = 1;
        sideLength = length;
    }
    
    // move to the next location in the grid
    public void act(){
        if(!canMove()){
            turn();
            steps = 0;
        }
        
        if (steps == sideLength){
            // toggle between - and + direction every time the bug is located
            // in the area overlapped by each circle
            dir = ((turns%8==6)?-1:1) * dir;
            
            setDirection(getDirection() + dir*45);
            turns++;
            steps = 0;
        }
        
        if (steps < sideLength && canMove()){
            move();
            steps++;
        }
    }
}
