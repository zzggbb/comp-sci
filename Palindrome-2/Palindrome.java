/* Name:    Zane Bradley
 * File:    Palindrome.java
 * Purpose: Provide the PalindromeTester.java with a Palindrome object and the isPal() method.
 */

public class Palindrome {

	private String input;

	public Palindrome(){}

	public Palindrome(String s){
		input = s;
	}

	public boolean isPal(){
		// 1. 	strip the given string of all non-alphanumeric characters
		String strip = input.toLowerCase().replaceAll("[^a-z0-9]","");

		// 2. 	check that characters, progressing towards the center, match.
		// 		If they do, increment 'correct' by one, as seen here:
		//
		// 		racccFar
		// 		^	   ^ : correct = 1
		// 		 ^    ^  : correct = 2
		// 		  ^  ^   : correct = 2
		// 		   ^^    : correct = 3
		int correct = 0;
		for (int i=0; i < strip.length(); i++) {
			correct += ( (strip.charAt(i) == strip.charAt(strip.length()-i-1)) ? 1 : 0 );
		}

		// 3. 	return a boolean value that checks if 'correct' equals the
		// 		length of 'strip', meaning every character matched. throw in
		// 		'strip.length() > 1' as well to ensure single characters aren't
		//		reported as palindromes
		return (correct == strip.length() && strip.length() > 1);
	}
}
