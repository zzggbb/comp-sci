public class ArrayTest {
    public static void main(String[] args){

        String[][] people = { {"zane","bradley"} , {"lil","b"} };
        // print the names:
        for(String[] person : people){
            System.out.println( person[0] + "\'s last name is " + person[1] );
        }
    }
}