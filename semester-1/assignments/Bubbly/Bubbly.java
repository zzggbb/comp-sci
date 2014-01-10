/*  Name:       Zane Bradley
    File:       Bubbly.java
    Purpose:    Provide BubblyTester with the Bubble Sorting methods to sort
                its arrays. Also provides the display method for displaying the
                sorted and unsorted arrays.
*/
import java.util.Random;

public class Bubbly {

    public void bubbleSort(Rectangle[] a) {
        int k = 0;
        boolean swapped = true;
        while ((k < a.length - 1) && swapped) {
            swapped = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if ( a[j].compareTo(a[j + 1]) > 0 ) {
                    Rectangle temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    public void bubbleSort(int[] a) {
        int k = 0;
        boolean swapped = true;
        while ((k < a.length - 1) && swapped) {
            swapped = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if ( a[j] > a[j + 1] ) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void display(boolean v, String[] w, String[] t) {
        if (v) {
            for (int i=0; i<w.length; i++) {
                System.out.printf("%-"+w[i].length()+"s", t[i]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int randRange(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}