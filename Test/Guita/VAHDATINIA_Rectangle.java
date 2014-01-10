//NAME: Guita Vahdatinia
//file: Rectangle.java
//purpose: to use the rectangles in the array of rectlist to compare the length and widths to find the area to put it in order and compare 
// the rectangles in order. 

public class Rectangle 
{
 int myLength;
 int myWidth;
 

    public Rectangle(int w, int l) 
    {
    
     myWidth = w;
     myLength = l;
    
    }
    
    //accessors
    public int area() {
    return myWidth*myLength;
    }
    public int getWidth()
    {
     return myWidth;
    }
    
    public int getLength()
    {
     return myLength;
    }
    
    //modifiers
    public void setWidth(int w)
    {
     myWidth = w;
    }
    
     public int compareTo(Rectangle rhs){
      return area()- rhs.area();     
    
     } 
     public boolean equals(Rectangle r){
       return(r.getLength() == myLength && r.getWidth() == myWidth);
             }   
}

