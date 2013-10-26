/* Name: 	Zane Bradley
 * File: 	PalindromeTester.java
 * Purpose:	Use a palindrome object and its isPal() method to return whether or not an inputted string is a palindrome.
*/

import java.util.Scanner;

public class PalindromeTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean cont = true;
		while (cont) {
			System.out.print("Type a string or q to quit: ");
			String userin = s.nextLine();
			cont = !(userin.equals("q"));
			boolean checkPal = new Palindrome(userin).isPal();
			System.out.println(cont ? "\""+userin+"\" "+(checkPal ? "IS":"IS NOT")+" a palindrome":"Program will exit");
		}
	}
}
