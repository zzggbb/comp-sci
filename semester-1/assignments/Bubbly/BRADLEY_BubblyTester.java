/*  Name:       Zane Bradley
    File:       BubblyTester.java
    Purpose:    Use bubble sorting methods on two randomly generated arrays and
                display the unsorted vs sorted arrays to the monitor.
*/

public class BubblyTester {

    public static void main(String[] args) {

        // constants declaration
        final int SIZE = 10;
        final int MIN = 1;
        final int MAX = 100;
        final boolean VERBOSE = true;
        final String[] LABEL = {"index", "intArray", "rectArray (Area)"};

        Bubbly b = new Bubbly();

        int[] intArray = new int[SIZE];
        Rectangle[] rectArray = new Rectangle[SIZE];

        // set column labels if verboseness is on
        b.display(VERBOSE, LABEL, LABEL);

        // Random Value Generation
        // create random values for our intArray and rectArray
        for (int i=0; i<SIZE; i++) {
            intArray[i] = b.randRange(MIN,MAX);
            rectArray[i] = new Rectangle(b.randRange(MIN,MAX),
                                         b.randRange(MIN,MAX));
            // display unsorted values
            String[] values = {i+"", intArray[i]+"", rectArray[i]+""};
            b.display(VERBOSE, LABEL, values);
        }

        b.bubbleSort(intArray);
        b.bubbleSort(rectArray);
        System.out.println("Sorting complete");

        b.display(VERBOSE, LABEL, LABEL);

        // display sorted values
        for(int i=0; i<SIZE; i++) {
            String[] values = {i+"", intArray[i]+"", rectArray[i]+""};
            b.display(VERBOSE, LABEL, values);
        }
        System.out.println();
        System.out.println("Rectangle.equals() Demonstration: ");
        System.out.println();

        Rectangle[] equalsRectArray = {
            new Rectangle(4,7),
            new Rectangle(3,10),
            new Rectangle(4,7)
        };

        for (int rectIndex = 0; rectIndex<equalsRectArray.length; rectIndex++) {
            System.out.println("Rectangle " + (rectIndex + 1) + ":");
            System.out.println("Length: " + equalsRectArray[rectIndex].getLength());
            System.out.println("Width: " + equalsRectArray[rectIndex].getWidth());
            System.out.println();
        }
        for (int j = 0; j<equalsRectArray.length; j++) {
            for (int k = 0; k<equalsRectArray.length; k++) {
                System.out.print("Rectangle " + (j+1) + " compared to " + (k+1) + ": ");
                System.out.println(equalsRectArray[j].equals(equalsRectArray[k]));
            }
            System.out.println();
        }
    }
}