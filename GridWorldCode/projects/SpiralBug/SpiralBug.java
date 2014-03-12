/*
 * Name: Zane Bradley
 * File: SpiralBug.java
 *
 * a SpiralBug traces out a spiral, with the initial spiral-side-length being
 * a give value
 */

import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
    
    private int myLength;
    private int steps = 0;
    
    // construct a SpiralBug that traces out a spiral with sidelength of length
    public SpiralBug(int length){
        myLength = length;
        setDirection(90);
    }

    public SpiralBug(){
        myLength = 2;
        setDirection(90);
    }
    
    // move to the next location of the grid
    public void act(){
        if (canMove() && steps < myLength ){
            move();
            steps++;
        } else {
            myLength++;
            turn();
            turn();
            steps = 0;                
        }
    } 
} 
