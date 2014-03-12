/*
 * Name: Zane Bradley
 * File: ZBug.java
 *
 * a ZBug creates the letter Z with a given length of the sides of the letter
 */

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    
    private int myLength, sideSteps, totalSteps;
    
    // construct a ZBug that traces out the letter z with a given length
    public ZBug(int length){
        setDirection(90);
        sideSteps = totalSteps = 0;
        myLength = length;
        
    }
    
    // move to the next space if possible, otherwise do nothing
    // if the Z is complete, stop movement
    public void act(){
        // z pattern is complete
        if(!canMove()){return;}
        
        if (totalSteps == 3*myLength){return;}

        if (sideSteps == myLength){
            int dir = totalSteps==myLength?1:-1;
            setDirection(getDirection() + dir*135);
            sideSteps = 0;
        }
        if (sideSteps < myLength && canMove()){
            move();
            sideSteps++;
            totalSteps++;
        }
    }
}
