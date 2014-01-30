/* Name:    Zane Bradley
 * File:    PalindromeTester.java
 * Purpose: Use a palindrome object and its isPal() method to return whether or not an inputted string is a palindrome.
*/

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.print("Type a string or q to quit: ");
            String userin = s.nextLine();

            // make loop stop and send the exit message if the sentinel 'q' is typed
            cont = !(userin.equals("q"));

            // assign a boolean 'checkPal' the value of the given input passed to the 'isPal' method
            boolean checkPal = new Palindrome(userin).isPal();

            // if cont is true, print the original string and if it is a palindrome or not.
            // otherwise, send the exit message
            System.out.println(cont ? "\""+userin+"\" "+(checkPal ? "IS":"IS NOT")+" a palindrome":"Program will exit");
        }
    }
}
