Rectangle.java:
public class Rectangle {
    private int myLength;
    private int myWidth;

    public Rectangle(int width, int length) {
        myLength = length;
        myWidth = width;
    }

    public int area() {
        return myLength * myWidth;
    }
    public int getLength() {
        return myLength;
    }
    public int getWidth() {
        return myWidth;
    }

    public int compareTo(Rectange rhs) {
        return area() - rhs.area();
    }

    public boolean equals(Rectange rhs) {
        return (getLength() == rhs.getLength() && getWidth() == rhs.getWidth());
    }
}
