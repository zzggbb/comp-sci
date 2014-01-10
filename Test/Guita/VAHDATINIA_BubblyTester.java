//NAME: Guita Vahdatinia
//file: BubblyTester.java
import java.util.Random;

public class BubblyTester {
 public static void main (String[] args){
 int[] intarray = {5,19,4,1,7,3,13,64,34,3074,74,1094,304};
 System.out.println("Before sorting");
 for(int x=0; x<intarray.length; x++){
  System.out.print(intarray[x]+ " ");
    }
    System.out.println();
   
    // making an array for t
    Bubbly b = new Bubbly();
    b.bubbleSort(intarray);
    System.out.println("After Sorting");
    for(int x=0; x<intarray.length; x++){
      System.out.print(intarray[x] + " ");
    }

    Random generator = new Random();
    int max = 5; 
    System.out.println();
   System.out.println("Before sorting");
   Rectangle[] rectlist = new Rectangle [5];
   for (int k=0;k<rectlist.length; k++){
    rectlist[k] = new Rectangle ((generator.nextInt(max)+1) , (generator.nextInt(max)+1));
	   
    System.out.print(rectlist[k].area() + " ");
     //rectarea[k] = rectlist[k].getLength() * rectlist[k].getWidth();
    }
    
 
   Bubbly c = new Bubbly();
    c.bubbleSort(rectlist);
    System.out.println(); 
     System.out.println("After sorting");
    for (int k=0;k<rectlist.length; k++){
    System.out.print(rectlist[k].area() + " ");
   }
   //  passing to the bubbly to sort the   
    
    System.out.println();
    
    for (int y = 0; y<rectlist.length; y++){
    	for ( int z = y+1; z<rectlist.length;z++){
    		if (rectlist[y].equals(rectlist[z])){
    			System.out.println("true - " +  "length: " + rectlist[y].getLength() + " width: " + rectlist[y].getWidth());

    		}
    		else {
    				System.out.println("false - "+  "length: " + rectlist[y].getLength() + " width: " + rectlist[y].getWidth());
    		
    
    		}
    	}
    }
    
    }    
}


