/* Name: 	Zane Bradley
 * File:	Palindrome.java
 * Purpose: Provide the PalindromeTester.java with a Palindrome object,
 *			and with it the isPal() method.
 */

public class Palindrome {

    private String input;

    public Palindrome(){}

    public Palindrome(String s){
        input = s;
    }

    public boolean isPal(){
        String strip = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuffer reverse = new StringBuffer(strip).reverse();
        return ((strip.length() > 1) && reverse.toString().equals(strip));
    }
}