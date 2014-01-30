/* Name: 	Zane Bradley
 * File:	Palindrome.java
 * Purpose: Provide the PalindromeTester.java with a Palindrome object and the isPal() method.
 */

public class Palindrome {

    private String input;

    public Palindrome(){}

    public Palindrome(String s){
        input = s;
    }

    public boolean isPal(){

        // convert to lowercase and remove all non-alphanumeric characters
        String strip = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        // create a string buffer object with 'strip' and reverse it
        StringBuffer reverse = new StringBuffer(strip).reverse();
        // make sure the stripped version has more than 1 significant character and
        // is the same word as its reversed version
        return ((strip.length() > 1) && reverse.toString().equals(strip));
    }
}