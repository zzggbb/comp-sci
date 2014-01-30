/* Name: 	Zane Bradley
 * File:	PalindromeTester.java
 * Purpose: Use a Palindrome object and its isPal() method to return whether or not an inputted string is a palindrome.
 */

import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        boolean cont = true;
        while (cont){
            System.out.print("Give a string or type q to exit: ");
            String userin = s.nextLine();
            cont = !(userin.equals("q"));
            boolean checkPal = new Palindrome(userin).isPal();
            // print whether or not userin is a palindrome, or exit depending on supplied string
            System.out.print(cont ? "\""+userin+"\" "+(checkPal ? "IS":"IS NOT")+" a palindrome\n":"Program will exit...");
        }
    }
}