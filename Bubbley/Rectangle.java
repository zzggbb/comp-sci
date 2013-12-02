/*  Name:       Zane Bradley
    File:       Rectangle.java
    Purpose:    Provide Bubbly and BubblyTester with the Rectangle object,
                which has a length and width. Also provides a method to find
                the area and string representation of a given Rectangle.
*/

public class Rectangle {

    private int myW,myL;

    public Rectangle(int w, int l) {
        myW = w;
        myL = l;
    }

    public Rectangle() {
        myW = 1;
        myL = 1;
    }

    public int area() {
        return myW * myL;
    }

    // rect1.compareTo(rect2):
    // rect1 > rect2: +
    // rect1 < rect2: -
    public int compareTo(Rectangle rect2) {
        return area() - rect2.area();
    }

    public String toString() {
        return myW + " " + myL + " " + area();
    }
}