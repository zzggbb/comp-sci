/*
 * Name: Zane Bradley
 * File: DancingBug.java
 *
 * a DancingBug rotates a given amount of times, as specified by a value in the
 * array that is passed to its constructor. It then moves forward, if possible
 * and advances the current position in the array.
 */

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
        
    private int pos;
    private int[] config; 
    
    /*
     * Construct a DancingBug with a given array of integers to use in
     * determining how many times to rotate
     */

    public DancingBug(int[] config) {
        this.config = config;   
    }
    
    // move to the next location in the grid after turning the amount of times
    // as specified by the value in config at index pos
    public void act() {
        if(canMove()) {
            int len = this.config.length;
            for(int x=0; x<this.config[pos%len]; x++) {
                turn();
            }
            move();
            pos++;
        } else {
            turn();
        }
    }
}
