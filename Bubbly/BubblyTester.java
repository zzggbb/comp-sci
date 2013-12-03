/*  Name:       Zane Bradley
    File:       BubblyTester.java
    Purpose:    Use bubble sorting methods on two randomly generated arrays and
                display the unsorted vs sorted arrays to the monitor.
*/

import java.util.Random;

public class BubblyTester {

    public static void main(String[] args) {

        // constants declaration
        final int SIZE = 10;
        final int MIN = 1;
        final int MAX = 10;
        final boolean VERBOSE = true;
        final String SEPARATE = " | ";
        final String[] LABEL = {"index", "intArray", "rectArray (Area)"};

        Random r = new Random();
        Bubbly b = new Bubbly();

        int[] intArray = new int[SIZE];
        Rectangle[] rectArray = new Rectangle[SIZE];

        // set column labels if verboseness is on
        b.display(VERBOSE, SEPARATE, LABEL, LABEL);

        // Random Value Generation
        // create random values for our intArray and rectArray
        for (int i=0; i<SIZE; i++) {
            // generate three different random numbers
            int[] randoms = new int[3];
            for (int j=0; j<3; j++) {
                randoms[j] = r.nextInt((MAX - MIN) + 1) + MIN;
            }
            // assign indexes of intArray and dimensions of Rectangles to the
            // values generated
            intArray[i] = randoms[0];
            rectArray[i] = new Rectangle(randoms[1], randoms[2]);
        }

        // display unsorted values
        for(int i=0; i<SIZE; i++) {
            String[] values = {i+"", intArray[i]+"", rectArray[i].toString()};
            b.display(VERBOSE, SEPARATE, LABEL, values);
        }

        // sort the values of our two arrays
        b.bubbleIntSort(intArray);
        b.bubbleRectSort(rectArray);
        System.out.println("Sorting complete");

        // again, set column labels if verboseness is on
        b.display(VERBOSE, SEPARATE, LABEL, LABEL);

        // display sorted values
        for(int i=0; i<SIZE; i++) {
            String[] values = {i+"", intArray[i]+"", rectArray[i].toString()};
            b.display(VERBOSE, SEPARATE, LABEL, values);
        }
    }
}