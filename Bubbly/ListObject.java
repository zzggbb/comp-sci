/*  Name:       Zane Bradley
    File:       Rectangle.java
    Purpose:    Provide Bubbly and BubblyTester with the ListObject object.
                This object allows for ints and Rectangles to be the 'true'
                values of an array, while under the cloak of being 'ListObjects'
                This allows for Bubbly to only contain one bubbleSort method.
*/

public class ListObject {

    private int v;

    public ListObject(int n) {
        v = n;
    }

    public ListObject(Rectangle r) {
        v = r.area();
    }

    public int compareTo(ListObject rhs) {
        return v - rhs.v;
    }

    public String toString() {
        return v + "";
    }
}