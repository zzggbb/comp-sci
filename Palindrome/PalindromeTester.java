/* Name: 	Zane Bradley
 * File:	PalindromeTester.java
 * Purpose: Use a Palindrome object and its isPal() method to return
 *			whether or not an inputted string is a palindrome.
 */


import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean cont = true;
        while (cont){
            System.out.println("Give a string or type q to exit: ");
            String userin = s.nextLine();
            cont = !(userin.equals("q"));
            boolean check = new Palindrome(userin).isPal();
            System.out.println(cont ? "\"" + userin + "\" " + (check ? "IS":"IS NOT") + " a palindrome":"Program will exit...");
        }
    }
}