/*  Name:       Zane Bradley
    File:       Bubbly.java
    Purpose:    Provide BubblyTester with the Bubble Sorting methods to sort
                its arrays. Also provides the display method for displaying the
                sorted and unsorted arrays.
*/

public class Bubbly {

    public void bubbleIntSort(int[] a) {
        int k = 0;
        boolean swapped = true;
        while ((k < a.length - 1) && swapped) {
            swapped = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void bubbleRectSort(Rectangle[] a) {
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

    public void display(boolean v, String s, String[] w, String[] t) {
        if (v) {
            for (int i=0; i<w.length; i++) {
                System.out.printf("%-"+w[i].length()+"s", t[i]);
                System.out.printf("%s",s);
            }
            System.out.println();
        }
    }
}