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

        ListObject[] intArray = new ListObject[SIZE];
        ListObject[] rectArray = new ListObject[SIZE];

        // set column labels if verboseness is on
        b.display(VERBOSE, LABEL, LABEL);

        // Random Value Generation
        // create random values for our intArray and rectArray
        for (int i=0; i<SIZE; i++) {
            intArray[i] = new ListObject(b.randomRange(MIN,MAX));
            rectArray[i] = new ListObject(new Rectangle(b.randomRange(MIN,MAX),
                                                        b.randomRange(MIN,MAX)
                                                        )
                                         );
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
    }
}