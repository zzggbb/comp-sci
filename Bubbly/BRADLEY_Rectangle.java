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

    public int area() {
        return myW * myL;
    }
    public int getWidth() {
        return myW;
    }
    public int getLength() {
        return myL;
    }

    public int compareTo(Rectangle rhs) {
        return area() - rhs.area();
    }

    public boolean equals(Rectangle rhs) {
        return (getWidth() == rhs.getWidth() && getLength() == rhs.getLength());
    }

    public String toString() {
        return area() + "";
    }


}